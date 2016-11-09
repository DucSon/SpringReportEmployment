<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>

<html>
<head>
<title>${title}</title>
</head>
<body>
	<jsp:include page="_menu.jsp" />

	<h2>Province Director Page</h2>
	<h3>Welcome : ${pageContext.request.userPrincipal.name}</h3>
	<a href="${pageContext.request.contextPath}/weekreportleader">WeekReport
		of Province</a>
	<a href="${pageContext.request.contextPath}/weeklyplanleader">WeeklyPlan
		of Province</a>
	<b>This is protected page!</b>
</body>
</html>