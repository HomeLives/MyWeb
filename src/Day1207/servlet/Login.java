package Day1207.servlet;

import Day1207.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * @Author Frank
 * @Date: 2020/12/7 0007 上午 10:51
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        UserDao user = new UserDao();
        boolean flag = user.hasUser(name, password);
        if (flag) {
            Cookie cookie = new Cookie("username", URLEncoder.encode(name, "utf-8"));
            response.addCookie(cookie);
            response.sendRedirect(request.getContextPath() + "/Success");
        } else {
            request.getRequestDispatcher("/Fail").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
