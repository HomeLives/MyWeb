package Day1207.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @Author Frank
 * @Date: 2020/12/7 0007 上午 10:55
 */
@WebServlet("/index")
public class Index extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        /*Cookie[] cookies = request.getCookies();
        String username = null;
        boolean flag = false;
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                if ("username".equals(cookie.getName())) {
                    username = URLDecoder.decode(cookie.getValue(), "utf-8");
                    flag = true;
                    break;
                }
            }
        }*/
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        /*System.out.println(username);*/
        if (username != null) {
            writer.print("欢迎用户：" + username);
            writer.flush();
            writer.close();
        } else {
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        }
        /*if (flag) {
            writer.print("欢迎用户：" + username);
            writer.flush();
            writer.close();
        } else {
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        }*/
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
