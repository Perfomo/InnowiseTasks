<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<html>
    <head>
        <title>Select items</title>
    </head>

    <body>
        <div style="width: 50%; margin: auto; padding: 10px; justify-content: center">
            <h2 style="text-align: center">Hello ${name}!</h2>
            <form method="post" name="form" style="text-align: center;">
                <p>Make your order</p>

                <c:set var="name" value="${name}" />
                <%Map<String, Double> items = (HashMap<String, Double>) request.getAttribute("shopItems");%>

                <select name="selectedItems" multiple required>
                <%for (String item : items.keySet()) {%>
                    <option value="<%=item%>" style="border: 3px solid limegreen"><%=item%> (<%=items.get(item)%>)$</option>
                <%}%>
                </select>

                <br><br>
                <input type="hidden" name="name" value="${name}" />
                <input type="submit" value="Sumbit" style="width: 25%; border: 3px solid limegreen; border-radius: 3%">
            </form>
        </div>
    </body>
</html>
