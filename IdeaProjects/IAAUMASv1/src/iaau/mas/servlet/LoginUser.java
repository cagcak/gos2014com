package iaau.mas.servlet;

/**
 * Created by Çağrı on 12.12.2013
 * *************************************
 * This Java Servlet class uses JSecurity to authenticate a user.
 * If user can be authenticated successfully, it forwards user to /secure/index.jsp.
 * If user cannot be authenticated, then it forwards user to the /Login.jsp which will display an error message.
 */

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;

public class LoginUser extends HttpServlet implements Servlet
{
    static final long serialVersionUID = 1L;

    public LoginUser()
    {
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String url = "/login.jsp";
        // Parameters in the form field come from /login.jsp
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //We create a token for the user's username and password values
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);

        try {
            //We get the user or subject associated with this request
            Subject subject = SecurityUtils.getSubject();
            //Using IniShiroFilter in web.xml caused JSecurity to create the
            //DefaultWebSecurityManager object.
            //----------------------------------------------------------------------
            //This security manager is the default for web-based applications.
            //----------------------------------------------------------------------
            //The SecurityUtils was provided that security manager automatically.
            //-----------------------------------------------------------------------
            //The configuration specified in web.xml caused a JdbcRealm object to be
            //provided to the SecurityManager, so when the login method is called that
            //JdbcRealm object will be used.
            //----------------------------------------------------------------------
            //This application uses all the other defaults
            //For example the default authentication query string is
            //"select password from users where username = ?"
            //since the database this application uses (iaaumasDB)
            //has a users table and that table has a column named username
            //and a column named password, the default authentication query
            //string will work
            //The call to login will cause the following to occur
            //Shiro will query the database for a password associated with the
            //provided username (which is stored in token).  If a password is found
            //and matches the password
            //provided by the user (also stored in the token), a new Subject will be created that is
            //authenticated.  This subject will be bound to the session for the
            //user who made this request
            //see:  http://shiro.apache.org/static/current/apidocs/org/apache/shiro/authc/Authenticator.html
            //for a list of potential Exceptions that might be generated if
            //authentication fails (e.g. incorrect password, no username found)

            subject.login(token);
            //We clear the information stored in the token here
            token.clear();

            url = "/secure/index.jsp";
        }catch (UnknownAccountException ex)
            {
                ex.printStackTrace();
                request.setAttribute("error", ex.getMessage());
            }catch (IncorrectCredentialsException ex)
                {
                    ex.printStackTrace();
                    request.setAttribute("error", ex.getMessage());
                }catch (Exception ex)
                    {
                        ex.printStackTrace();
                        request.setAttribute("error", "Login NOT SUCCESSFUL - not known the reason!");
                    }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request, response);
    }
}