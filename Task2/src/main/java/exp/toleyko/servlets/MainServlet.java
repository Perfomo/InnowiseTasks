package exp.toleyko.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "MainServlet", urlPatterns = "/www.online-shop.com")
public class MainServlet extends HttpServlet {

    private static final Map<String, Double> items = new HashMap<>();
    static {
        items.put("Pen", 1.0);
        items.put("Book", 5.5);
        items.put("Phone", 300.0);
        items.put("Car", 30000.0);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jsp/interName.jsp").forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("inputName");
        if (name == null) {
            req.setAttribute("name", req.getParameter("name"));
            String[] selectedItems = req.getParameterValues("selectedItems");
            double resCost = 0;
            if (selectedItems != null) {
                for (int i = 0; i < selectedItems.length; i++) {
                    resCost += items.get(selectedItems[i]);
                    selectedItems[i] = i + 1 + ") " + selectedItems[i] + " - " + (items.get(selectedItems[i]) + "$");
                }
                req.setAttribute("checkItems", selectedItems);
            }
            else {
                req.setAttribute("checkItems", new String[]{});
            }
            req.setAttribute("cost", resCost);
            req.getRequestDispatcher("/WEB-INF/jsp/showCheck.jsp").forward(req, resp);
        }
        else {
            req.setAttribute("name", name);
            req.setAttribute("shopItems", items);
            req.getRequestDispatcher("/WEB-INF/jsp/selectItems.jsp").forward(req, resp);
        }
    }
}
