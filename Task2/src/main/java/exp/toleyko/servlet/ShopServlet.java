package exp.toleyko.servlet;

import exp.toleyko.handler.Handler;
import exp.toleyko.handler.MakeOrder;
import exp.toleyko.handler.ShowOrder;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

@WebServlet(name = "ShopServlet", urlPatterns = "/www.online-shop.com")
public class ShopServlet extends HttpServlet {
    private static final HashMap<String, Handler> attributeToPath = new HashMap<>();
    static {
        attributeToPath.put("makeOrder", new MakeOrder());
        attributeToPath.put("showOrder", new ShowOrder());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jsp/homeShop.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        attributeToPath.get(req.getParameter("path")).handle(req, resp);
    }
}
