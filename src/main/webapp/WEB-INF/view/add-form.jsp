<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add product</title>
</head>
<body>
<form:form action="result" modelAttribute="product" method="post">
    ID: <form:input path="id" />
    Title: <form:input path="title" />
    Cost:<form:input path="cost"/>
    <input type="submit" value="Save" />
</form:form>
</body>
</html>
