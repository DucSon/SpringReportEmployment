<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
 <link rel="stylesheet" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />
  <script src="http://code.jquery.com/jquery-1.8.3.js"></script>
  <script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show Report Result</title>
</head>

<script type="text/javascript">
	$(function(){
		$("#fromDate").datepicker();
		$("#toDate").datepicker();
	});
</script>

<body>
<%--     <jsp:include page="_menu.jsp"/> --%>
    <a href="${pageContext.request.contextPath}/weekreport">Báo cáo phát triển dịch vụ</a>
    <a href="${pageContext.request.contextPath}/leaderreport">Báo cáo cá nhân</a>
	<a href="${pageContext.request.contextPath}/weeklyplan">Kế hoạch tuần</a>
	<a href="${pageContext.request.contextPath}/logout">Logout</a>
    <h1>Báo Cáo Cá Nhân</h1>
    <h3>Nhan vien:${searchForm.username}</h3>
    
	<form:form id="searchForm" modelAttribute="searchForm" method="POST"
		action="/SpringReportEmployment/leaderreport">
		<table>
			<tr>
				<td>Tu Ngay:</td>
				<td><input type="text" id="fromDate" name="fromDate"
					value="${searchForm.fromDate}" /></td>
				<td>Den Ngay:</td>
				<td><input type="text" id="toDate" name="toDate"
					value="${searchForm.toDate}" /></td>
			</tr>
		</table>
		<tr>
			<td colspan="2" align="left"><input id="btnSearch"
				name="searchReport" type="submit" value="searchReport"></td>
			<td colspan="2" align="left"><input id="btnExport"
				name="expReport" type="submit" value="expReport"></td>
		</tr>
	</form:form>

	<table border="1">
		<tr>
			<th>Username</th>
			<th>DDTS</th>
			<th>Co Dinh</th>
			<th>Gphone</th>
			<th>FTTH</th>
			<th>MegaVnn</th>
			<th>MyTV</th>
			<th>IVan</th>
			<th>VnEdu</th>
			<th>SimVNP</th>
			<th>TheVNP(tr)</th>
		</tr>
		<c:if test="${not empty list}">
			<c:forEach var="personalreport" items="${list}">
				<tr>
					<td style="width: 100px;">${personalreport.username}</td>
					<td style="width: 100px;">${personalreport.postpaidDevelop}</td>
					<td style="width: 400px;">${personalreport.fixedDevelop}</td>
					<td style="width: 150px;">${personalreport.gphoneDevelop}</td>
					<td style="width: 100px;">${personalreport.fiberDevelop}</td>
					<td style="width: 200px;">${personalreport.megaDevelop}</td>
					<td style="width: 150px;">${personalreport.mytvDevelop}</td>
					<td style="width: 100px;">${personalreport.ivanDevelop}</td>
					<td style="width: 200px;">${personalreport.vneduDevelop}</td>
					<td style="width: 150px;">${personalreport.prepaidDevelop}</td>
					<td style="width: 100px;">${personalreport.cardDevelop}</td>
				</tr>
			</c:forEach>
		</c:if>
		<tr>
		<td>Tổng</td>
			<td style="width: 100px;">
			<c:set var="totalPD" value="0"/>
			<c:forEach var="personalreport" items='${list}'>
			    <c:set var="totalPD" value="${totalPD + personalreport.postpaidDevelop}"/>
			</c:forEach>
		<c:out value="${totalPD}"/>
		</td>
					<td style="width: 100px;">
			<c:set var="totalPD" value="0"/>
			<c:forEach var="personalreport" items='${list}'>
			    <c:set var="totalPD" value="${totalPD + personalreport.fixedDevelop}"/>
			</c:forEach>
		<c:out value="${totalPD}"/>
		</td>
					<td style="width: 100px;">
			<c:set var="totalPD" value="0"/>
			<c:forEach var="personalreport" items='${list}'>
			    <c:set var="totalPD" value="${totalPD + personalreport.gphoneDevelop}"/>
			</c:forEach>
		<c:out value="${totalPD}"/>
		</td>
					<td style="width: 100px;">
			<c:set var="totalPD" value="0"/>
			<c:forEach var="personalreport" items='${list}'>
			    <c:set var="totalPD" value="${totalPD + personalreport.fiberDevelop}"/>
			</c:forEach>
		<c:out value="${totalPD}"/>
		</td>
					<td style="width: 100px;">
			<c:set var="totalPD" value="0"/>
			<c:forEach var="personalreport" items='${list}'>
			    <c:set var="totalPD" value="${totalPD + personalreport.megaDevelop}"/>
			</c:forEach>
		<c:out value="${totalPD}"/>
		</td>
					<td style="width: 100px;">
			<c:set var="totalPD" value="0"/>
			<c:forEach var="personalreport" items='${list}'>
			    <c:set var="totalPD" value="${totalPD + personalreport.mytvDevelop}"/>
			</c:forEach>
		<c:out value="${totalPD}"/>
		</td>
					<td style="width: 100px;">
			<c:set var="totalPD" value="0"/>
			<c:forEach var="personalreport" items='${list}'>
			    <c:set var="totalPD" value="${totalPD + personalreport.ivanDevelop}"/>
			</c:forEach>
		<c:out value="${totalPD}"/>
		</td>
		<td style="width: 100px;">
			<c:set var="totalPD" value="0"/>
			<c:forEach var="personalreport" items='${list}'>
			    <c:set var="totalPD" value="${totalPD + personalreport.vneduDevelop}"/>
			</c:forEach>
		<c:out value="${totalPD}"/>
		</td>
					<td style="width: 100px;">
			<c:set var="totalPD" value="0"/>
			<c:forEach var="personalreport" items='${list}'>
			    <c:set var="totalPD" value="${totalPD + personalreport.prepaidDevelop}"/>
			</c:forEach>
		<c:out value="${totalPD}"/>
		</td>
							<td style="width: 100px;">
			<c:set var="totalPD" value="0"/>
			<c:forEach var="personalreport" items='${list}'>
			    <c:set var="totalPD" value="${totalPD + personalreport.cardDevelop}"/>
			</c:forEach>
		<c:out value="${totalPD}"/>
		</td>
		
		</tr>
	</table>
</body>
</html>