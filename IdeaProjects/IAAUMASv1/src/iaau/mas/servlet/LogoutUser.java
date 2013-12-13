package iaau.mas.servlet;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Çağrı on 12.12.2013.
 */
public class LogoutUser extends HttpServlet implements Servlet
{
    static final long serialVersionUID = 1L;

    public LogoutUser()
    {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String url = "/index.jsp";
        // We get the subject associated with this user request.
        //If the user has previously logged in during this session
        //then the subject will be the subject authenticated at login
        Subject subject = SecurityUtils.getSubject();

        if (subject != null)
        {
            subject.logout();
        }

        HttpSession session = request.getSession(false);

        if (session != null)
        {
            session.invalidate();
        }

        //We forward the request and response to the view
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request, response);
    }
}