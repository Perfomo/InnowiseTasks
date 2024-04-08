<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Show check</title>
    </head>
    <body>
        <div style="width: 50%; margin: auto; padding: 10px; justify-content: center; text-align: center">
            <h2>Dear ${name}, your order:</h2>
            <br>
            <table>
                <%for (String item : (String[]) request.getAttribute("checkItems")) {%>
                    <tr style="width: 100%"><td><%=item%></td></tr>
                <%}%>
            </table>
            <p>Total: $ ${cost}</p>
            <input type="button" value="Back" onclick="window.location.href='/www.online-shop.com'" style="width: 25%; border: 3px solid limegreen; border-radius: 3%"/>
        </div>
    </body>
</html>
