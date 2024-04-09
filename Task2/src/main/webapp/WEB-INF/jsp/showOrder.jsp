<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<html>
<head>
    <title>Show order</title>
</head>
    <body>
        <div style="width: 50%; margin: auto; padding: 10px; justify-content: center; text-align: center">
            <h2>Dear ${requestScope.userName}, your order:</h2>
            <br>
                <table>
                    <%int i = 1;%>
                    <c:forEach items="${requestScope.selectedItems}" var="item">
                        <tr style="border: 3px solid limegreen;"><%=i%>) ${item.getName()} ${item.getCost()}$</tr>
                        <br>
                        <%i++;%>
                    </c:forEach>
                </table>
            <p>Total: $ ${requestScope.orderCost}</p>
            <input type="button" value="Back" onclick="window.location.href='/www.online-shop.com'" style="width: 25%; border: 3px solid limegreen; border-radius: 3%"/>
        </div>
    </body>
</html>
