<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
<title>${title}</title>
</head>
<body>
	<%--     <jsp:include page="_menu.jsp" /> --%>

	<h2>Leader Page</h2>
	<h3>Welcome : ${pageContext.request.userPrincipal.name}</h3>
	<a href="${pageContext.request.contextPath}/dailyreport">DailyReport</a>
	<a href="${pageContext.request.contextPath}/weekreport">WeekReport</a>
	<a href="${pageContext.request.contextPath}/weeklyplan">WeeklyPlan</a>
	<b>This is protected page!</b>
</body>
</html>




