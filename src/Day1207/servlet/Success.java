package Day1207.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @Author Frank
 * @Date: 2020/12/7 0007 上午 10:55
 */
@WebServlet("/Success")
public class Success extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        Cookie[] cookies = request.getCookies();
        String username = null;
        boolean flag = false;
        for (Cookie cookie : cookies) {
            if ("username".equals(cookie.getName())) {
                username = URLDecoder.decode(cookie.getValue(), "utf-8");
                flag = true;
                break;
            }
        }
        if (flag) {
            writer.print("欢迎用户：" + username);
            writer.flush();
            writer.close();
        } else {
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
