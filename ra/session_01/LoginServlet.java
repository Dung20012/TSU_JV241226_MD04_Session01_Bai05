package ra.session_01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    private final String USERNAME = "NguyenVanA";
    private final String PASSWORD = "matkhauco8kytu";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // lấy dữ liệu từ form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("NguyenVanA".equals(username) && "matkhauco8kytu".equals(password)) {
            request.getRequestDispatcher("home.jsp").forward(request, response);
        } else if (username != null && password != null) {
            request.setAttribute("error", "Invalid username and password");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
