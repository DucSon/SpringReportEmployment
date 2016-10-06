<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.8.3.js"></script>
<script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
<script
	src="http://jonthornton.github.io/jquery-timepicker/jquery.timepicker.js"></script>
<link rel="stylesheet" type="text/css"
	href="http://jonthornton.github.io/jquery-timepicker/jquery.timepicker.css" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Weekly Plan</title>
<script type="text/javascript">
	$(function() {
		$("#date").datepicker();
		$('#time').timepicker({
			'scrollDefault' : 'now'
		});
	});
	
	$(document).ready(function(){
		$('#checkBoxAll').click( function(){
			if($(this).is(":checked"))
				$('.chkCheckBoxId').prop('checked', true);
			else 
				$('.chkCheckBoxId').prop('checked', false);
		});
	});

</script>
<body>
	<div align="center">
		<h1>Weekly Plan</h1>
		<h2 align="left" style="width: 80%;">Kế hoạch chi tiết</h2>
		<h3>Kế hoạch tuần từ:${monday} đến ${saturday}</h3>
		<form:form id="weeklyplan" modelAttribute="weeklyplan" method="POST"
			action="/SpringReportEmployment/weeklyplan">
			<table border="1">
				<tr>
					<th>Date</th>
					<th>Time</th>
					<th>Description</th>
					<th>Location</th>
					<th>Result</th>
					<th>Note</th>
					<th><input type="checkbox" id="checkBoxAll"></th>
				</tr>
				<c:if test="${not empty list}">
					<c:forEach var="listWeeklyPlan" items="${list}">
						<tr>
							<td style="width: 100px;">${listWeeklyPlan.date}</td>
							<td style="width: 100px;">${listWeeklyPlan.time}</td>
							<td style="width: 400px;">${listWeeklyPlan.description}</td>
							<td style="width: 150px;">${listWeeklyPlan.location}</td>
							<td style="width: 100px;">${listWeeklyPlan.result}</td>
							<td style="width: 200px;">${listWeeklyPlan.note}</td>
							<td><input type ="checkbox" class="chkCheckBoxId" value="${listWeeklyPlan.weeklyplanid}" name="weeklyplanid"></td>
						</tr>
					</c:forEach>
				</c:if>
			</table>              
        <table>
				<tr> 	
					<td style="width: 100px;">Người lập kế hoạch:</td>
					<td style="width: 100px;"><form:input path="username"
							value="${weeklyplan.username}" style="width:100px;" /><br /></td>
				</tr>
				<tr>
					<td>Ngày lập kế hoạch:</td>
					<td><input type="text" id="weeklyplan" name="weeklyplan"
						value="${weeklyplan.date}" /></td>
				</tr>
				<tr></tr>
				<tr>
					<td>Stt</td>
					<td>Ngày</td>
					<td>Thời gian</td>
					<td>Nội dung công việc</td>
					<td>Địa điểm</td>
					<td>Kết quả dự kiến</td>
					<td>Ghi chú</td>
					<td></td>
				</tr>
				<tr>
					<td>1</td>
					<td><form:input path="date" value="${weeklyplan.date}"
							style="width:100px;" /></td>
					<td><form:input path="time" value="${weeklyplan.time}"
							style="width:100px;" /></td>
					<td><form:textarea path="description"
							value="${weeklyplan.description}" style="width:200px;" /></td>
					<td><form:input path="location" value="${weeklyplan.location}"
							style="width:100px;" /></td>
					<td><form:input path="result" value="${weeklyplan.result}"
							style="width:100px;" /></td>
					<td><form:textarea path="note" value="${weeklyplan.note}"
							style="width:200px;" /></td>
				</tr>
			</table>
			<br/>
			<br/>
			<tr>
				<td colspan="2" align="left"><input id="btnSave"
					name="savePlan" type="submit" value="Thêm Kế hoạch"></td>
				<td colspan="2" align="left"><input id="btnDelete"
					name="deletePlan" type="submit" value="deletePlan"></td>
				<td colspan="2" align="left"><input id="btnSend"
					name="sendPlan" type="submit" value="Gửi kế hoạch"></td>
			</tr>
			<br />
			<br />
		</form:form>
	</div>
</body>
</head>
</html>