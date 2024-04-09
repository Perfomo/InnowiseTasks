<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<html>
<head>
    <title>Select items</title>
</head>

<body>
<div style="width: 50%; margin: auto; padding: 10px; justify-content: center">
    <h2 style="text-align: center">Hello ${requestScope.userName}!</h2>
    <form method="post" name="form" style="text-align: center;">
        <p>Make your order</p>

        <select name="selectedItems" multiple required>
            <c:forEach items="${requestScope.allItems.keySet()}" var="itemKey">
                <option value="${itemKey}" style="border: 3px solid limegreen">${itemKey} - ${requestScope.allItems.get(itemKey)}$</option>
            </c:forEach>
        </select>

        <br><br>
        <input type="hidden" name="userName" value="${requestScope.userName}" />
        <input type="hidden" name="path" value="showOrder" />
        <input type="submit" value="Sumbit" style="width: 25%; border: 3px solid limegreen; border-radius: 3%">
    </form>
</div>
</body>
</html>
