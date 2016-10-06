<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users Added using Ajax</title>
</head>
<body style="color: green;">
    The following are the users added in the list :
    <br>
    <ul>
        <c:forEach items="${Users}" var="user">
            <li>Name: <c:out value="${user.name}" />; Education: <c:out
                    value="${user.education}" /></li>
        </c:forEach>
    </ul>
</body>
</html>