<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
 
<html>
<head>
<title>${title}</title>
</head>
<body>
    <jsp:include page="_menu.jsp" />
 
    <h2>District Director Page</h2>
    <h3>Welcome : ${pageContext.request.userPrincipal.name}</h3>
    <a href="${pageContext.request.contextPath}/weekreportdistrict">WeekReport of District</a>
    <a href="${pageContext.request.contextPath}/weeklyplandistrict">WeeklyPlan of District</a>
    <b>This is protected page!</b>  
</body>
</html>