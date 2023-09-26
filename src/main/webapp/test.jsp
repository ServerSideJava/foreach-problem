<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: monke
  Date: 9/25/2023
  Time: 11:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello ${result.getRepo_name()} ${result.CountStudent()}</h1>
<ul>
    <c:forEach var='item' items="${result}">

        <li>${item.getName()}</li>

    </c:forEach>
</ul>
</body>
</html>
