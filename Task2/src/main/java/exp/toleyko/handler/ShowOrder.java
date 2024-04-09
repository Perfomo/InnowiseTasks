package exp.toleyko.handler;

import exp.toleyko.entity.Item;
import exp.toleyko.service.Shop;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
public class ShowOrder implements Handler {
    @Override
    public void handle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] selectedItemsNames = req.getParameterValues("selectedItems");
        ArrayList<Item> selectedItems = Shop.getOrderedItems(selectedItemsNames);
        double orderCost = Shop.getOrderCost(selectedItems);

        req.setAttribute("selectedItems", selectedItems);
        req.setAttribute("orderCost", orderCost);
        req.setAttribute("userName", req.getParameter("userName"));

        req.getRequestDispatcher("WEB-INF/jsp/showOrder.jsp").forward(req, resp);
    }
}
