<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<div style="border: 1px solid #ccc; padding: 5px;">
		<a href="${pageContext.request.contextPath}/dailyreport">Report of
			Employment</a> &nbsp;|&nbsp; <a
			href="${pageContext.request.contextPath}/deptList">Dept List</a>
		<c:if test="${pageContext.request.userPrincipal.name != null}">
     | &nbsp;
     <a href="${pageContext.request.contextPath}/logout">Logout</a>
		</c:if>
	</div>
</body>
</html>