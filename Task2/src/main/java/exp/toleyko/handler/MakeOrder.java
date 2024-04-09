package exp.toleyko.handler;

import exp.toleyko.service.Shop;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MakeOrder implements Handler{
    @Override
    public void handle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("userName");
        if (name == null || name.isEmpty()) {
            name = "NoNameUser";
        }

        req.setAttribute("userName", name);
        req.setAttribute("allItems", Shop.items);

        req.getRequestDispatcher("WEB-INF/jsp/makeOrder.jsp").forward(req, resp);
    }
}
