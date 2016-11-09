<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>

<html>
<head>
<title>${title}</title>
</head>
<body>

	<h2>Leader Page</h2>
	<h3>Welcome : ${pageContext.request.userPrincipal.name}</h3>
	<a href="${pageContext.request.contextPath}/dailyreport">Report of
		Group</a>
	<a href="${pageContext.request.contextPath}/weekreport">WeekReport
		of Leader</a>
	<a href="${pageContext.request.contextPath}/weeklyplan">WeeklyPlan
		of Leader</a>
	<b>This is protected page!</b>
</body>
</html>