package iaau.mas.servlet;

import iaau.mas.dao.UserDAO;
import iaau.mas.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Çağrı on 12.12.2013.
 */
public class GetAllUsers extends HttpServlet implements Servlet
{
    static final long serialVersionUID = 1L;

    public GetAllUsers()
    {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Subject currentUser = SecurityUtils.getSubject();

        String url = "/login.jsp";

        if (currentUser.isAuthenticated() && ! currentUser.hasRole("admin"))
        {
            url = "/admin/users.jsp";

            List<User> userList = UserDAO.getAllUsers();

            request.setAttribute("userList", userList);
        }

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request, response);
    }
}
