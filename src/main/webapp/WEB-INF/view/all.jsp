<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 09.09.2019
  Time: 1:35
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<html>
    <h2>Product Form Result</h2>
    <table>
        <tr><th>ID</th><th>Title</th><th>Cost</th></tr>
        <c:forEach var="product" items="${products}">
            <tr><th>${product.id}</th><th>${product.title}</th><th>${product.cost}</th></tr>
        </c:forEach>
    </table>
</body>
</html>