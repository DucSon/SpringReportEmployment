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

<script
	src="https://raw.githubusercontent.com/DucSon/SpringReportEmployment/master/SpringReportEmployment/src/main/webapp/WEB-INF/pages/jquery-3.1.1.min.js"></script>
<!-- <script src="https://raw.githubusercontent.com/DucSon/SpringReportEmployment/master/SpringReportEmployment/src/main/webapp/WEB-INF/pages/jstree.min.js"></script> -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jstree/3.3.2/jstree.min.js"></script>

<html>
<style>
#treeview {
	width: 26%;
	height: auto;
	background: white;
	float: left;
}

#tableplan {
	width: 74%;
	height: auto;
	background: white;
	float: left;
	font-family: Times New Roman, Helvetica, sans-serif;
}

#addplan {
	height: 300px;
	width: 100%;
	background: white;
	clear: both
}
</style>

<!-- header('Content-Type: text/html; charset=utf-8') -->

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Weekly Plan</title>
<script type="text/javascript">

var startDate;
var endDate;
var startDateAfter="";
var endDateAfter="";

	$(function() {
		$("#date").datepicker();
		$('#time').timepicker({
			'scrollDefault' : 'now'
		});
		
	    $('#week-picker').datepicker( {
	        showOtherMonths: true,
	        selectOtherMonths: true,
	        onSelect: function(dateText, inst) { 
	            var date = $(this).datepicker('getDate');
	            startDate = new Date(date.getFullYear(), date.getMonth(), date.getDate() - date.getDay());
	            endDate = new Date(date.getFullYear(), date.getMonth(), date.getDate() - date.getDay() + 6);
	            var dateFormat = inst.settings.dateFormat || $.datepicker._defaults.dateFormat;
	            startDateAfter = $.datepicker.formatDate( dateFormat, startDate, inst.settings );
	            endDateAfter = $.datepicker.formatDate( dateFormat, endDate, inst.settings );
	            selectCurrentWeek();
		        document.getElementById("week-picker").value =$.datepicker.formatDate( dateFormat, startDate, inst.settings)+" đến "+$.datepicker.formatDate( dateFormat, endDate, inst.settings );

	        },
	        beforeShowDay: function(date) {
	            var cssClass = '';
	            if(date >= startDate && date <= endDate)
	                cssClass = 'ui-datepicker-current-day';
	            return [true, cssClass];
	        },
	        onChangeMonthYear: function(year, month, inst) {
	            selectCurrentWeek();
	        }
	    });
	    
	    var selectCurrentWeek = function() {
	        window.setTimeout(function () {
	            $('#week-picker').find('.ui-datepicker-current-day a').addClass('ui-state-active')
	        }, 1);
	    }
	    
	    $('#week-picker .ui-datepicker-calendar tr').live('mousemove', function() { $(this).find('td a').addClass('ui-state-hover'); });
	    $('#week-picker .ui-datepicker-calendar tr').live('mouseleave', function() { $(this).find('td a').removeClass('ui-state-hover'); });
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
	<a href="${pageContext.request.contextPath}/weekreport">Báo cáo
		phát triển dịch vụ</a>
	<a href="${pageContext.request.contextPath}/leaderreport">Báo cáo
		cá nhân</a>
	<a href="${pageContext.request.contextPath}/weeklyplan">Kế hoạch
		tuần</a>
	<a href="${pageContext.request.contextPath}/assetmanager">Quản lý tài sản</a>	
	<a href="${pageContext.request.contextPath}/logout">Logout</a>
	<div align="center">
		<h1>Weekly Plan</h1>
		<h2 align="left" style="width: 80%;">
		Kế hoạch chi tiết
		<br>
		<label>Tuần: </label><input id="week-picker">
		</h2>
		<form:form id="weeklyplan" modelAttribute="weeklyplan" method="POST"
			action="${pageContext.request.contextPath}/weeklyplan">
			<div>
				<div id="treeview" align="left">
					<table>
						<tr>
							<td style="width: 100px;">N/V lập biểu mẫu:</td>
							<td style="width: 100px;"><form:input path="username"
									type="text" value="${weeklyplan.username}" style="width:100px;" /><br /></td>
						</tr>
						<tr>
							<td>Ngày lập biểu mẫu:</td>
							<td><input type="text" id="weeklyplan" name="weeklyplan"
								value="${weeklyplan.date}" /></td>
						</tr>
						<tr>
							<td>Nhân viên</td>
							<td></td>
						</tr>
					</table>
					<div id="evts" class="treeview" style="overflow: scrollbar;"></div>
				</div>
				<div id="tableplan" align="right" onload="load();">
					<table border="1" id="table">
						<tr>
							<th style="width: 10%;">Date</th>
							<th style="width: 10%;">Time</th>
							<th style="width: 30%;">Description</th>
							<th style="width: 15%;">Location</th>
							<th style="width: 15%;">Result</th>
							<th style="width: 20%;">Note</th>
							<th style="width: 20%;">Status</th>
							<th><input type="checkbox" id="checkBoxAll"></th>
						</tr>
						<c:if test="${not empty list}">
							<c:forEach var="listWeeklyPlan" items="${list}">
								<tr>
									<td style="width: 10%;">${listWeeklyPlan.date}</td>
									<td style="width: 10%;">${listWeeklyPlan.time}</td>
									<td style="width: 30%;">${listWeeklyPlan.description}</td>
									<td style="width: 15%;">${listWeeklyPlan.location}</td>
									<td style="width: 15%;">${listWeeklyPlan.result}</td>
									<td style="width: 20%;">${listWeeklyPlan.note}</td>
									<td style="width: 20%;">${listWeeklyPlan.status}</td>
									<td><input type="checkbox" class="chkCheckBoxId"
										value="${listWeeklyPlan.weeklyplanid}" name="weeklyplanid"></td>
								</tr>
							</c:forEach>
						</c:if>
					</table>
				</div>
				<div id="addplan">
					<table>
						<tr>
							<td><b>Thêm mới kế hoạch:</b></td>
						</tr>
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
							<td><form:input path="location"
									value="${weeklyplan.location}" style="width:100px;" /></td>
							<td><form:input path="result" value="${weeklyplan.result}"
									style="width:100px;" /></td>
							<td><form:textarea path="note" value="${weeklyplan.note}"
									style="width:200px;" /></td>
						</tr>
					</table>
					<div>
						<br>
						<table>
							<tr>
								<td colspan="2" align="left"><input id="btnSave"
									name="savePlan" type="submit" value="Thêm Kế hoạch"></td>
								<td colspan="2" align="left"><input id="btnDelete"
									name="deletePlan" type="submit" value="deletePlan"></td>
								<td colspan="2" align="left"><input id="btnSend"
									name="sendPlan" type="submit" value="Gửi kế hoạch(Public)"></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
						</table>
					</div>
				</div>
			</div>

		</form:form>
	</div>
	<script type="text/javascript">

	var data2 = ${managerTree};

	$("#evts")
			.on(
					"changed.jstree",
					function(e, data) {
						if (data.selected.length) {
							var username = data.instance.get_node(data.selected[0]).text;
							var monday = "";
							var saturday ="";
							
							var data2 = {
									"username": username,
									"monday": startDateAfter,
									"saturday": endDateAfter 
							};
						
						$.ajax({
								url:'selectNode',
								type:'GET',
								data : data2,
								contentType: "text/html; charset=UTF-8",
								success: function(response) {
									var jsonarray = JSON.parse(response);							
									var rowlast= $('#table tr:last').index();
									for(var i=0; i< rowlast+1;i++){
										$('#table tr:first').remove();
									}
									
									$("#table tbody")
									.append ("<tr> <th style='width: 10%;'>Date</th>"
									+ "<th style='width: 10%;'>Time</th>"
									+ "<th style='width: 30%;'>Description</th>"
									+ "<th style='width: 15%;'>Location</th>"
									+ "<th style='width: 15%;'>Result</th>"
									+ "<th style='width: 20%;'>Note</th>"
									+ "<th style='width: 20%;'>Status</th>"
									+ "<th><input type='checkbox' id='checkBoxAll'></th>");	
									
									for(var i =0;i< jsonarray.length;i++){
										
										$("#table")
										.append ("<tr> <th style='width: 10%;'>"+jsonarray[i].date+"</td>"
										+ "<td style='width: 10%;'>"+jsonarray[i].time+"</td>"
										+ "<td style='width: 30%;'>"+jsonarray[i].description+"</td>"
										+ "<td style='width: 15%;'>"+jsonarray[i].location+"</td>"
										+ "<td style='width: 15%;'>"+jsonarray[i].result+"</td>"
										+ "<td style='width: 20%;'>"+jsonarray[i].note+"</td>"
										+ "<td style='width: 20%;'>"+jsonarray[i].status+"</td>"
										+ "<td><input type='checkbox' class='chkCheckBoxId' value="+jsonarray[i].weeklyplanid+" name='weeklyplanid'></td>");	
										
									}

								},
								error : function(e) {
									console.log("ERROR: ", e);
									display(e);
								},
								done : function(e) {
									console.log("DONE");
								}
							});	
						}
					}).jstree({
				'core' : {
					'multiple' : false,
					'data' : data2,
				}
			});
	
// 	load = function() {

// for (i = 0; i < response.data.length; i++) {
// 					$("#table")
// 							.append (
// 									"<tr class='tr'> <td> "
// 											+ response.data[i].user_name
// 											+ " </td> <td> "
// 											+ response.data[i].email
// 											+ " </td> <td> <a href='#' onclick= edit("
// 											+ i
// 											+ ");> Edit </a>  </td> </td> <td> <a href='#' onclick='delete_("
// 											+ response.data[i].user_id
// 											+ ");'> Delete </a>  </td> </tr>");
// 				}
// 	}
	
</script>
</body>
</head>
</html>