<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.8.3.js"></script>
<script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ReportForm of Employment</title>
<script type="text/javascript">


// 	<a href="${pageContext.request.contextPath}/dailyreport">Báo Cáo Tuần</a>
	// $('#drForm')
	// .ajaxForm({
	//     url : '/SpringReportEmployment/dailyreport', // or whatever
	//     dataType : 'json',
	//     success : function (response) {
	//         alert("The server says: " + response);
	//     }
	// });

	$(function() {
		$("#datereport").datepicker();
	});
	
// 	var status = ${dailyreport.status};
// 	console.log(status);
// 	if(status=='DONE'){
// 		 $('#sendReport').hide();
// 	}
</script>
<body>
	<%--     <jsp:include page="_menu.jsp" /> --%>
	<a href="${pageContext.request.contextPath}/dailyreport">Báo cáo
		ngày</a>
	<a href="${pageContext.request.contextPath}/weekreport">Báo cáo
		tuần</a>
	<a href="${pageContext.request.contextPath}/weeklyplan">Kế hoạch
		tuần</a>
	<a href="${pageContext.request.contextPath}/logout">Logout</a>
	<div align="center">
		<h1>Report Form of Employment</h1>

		<form:form id="drForm" modelAttribute="dailyreport" method="POST"
			action="${pageContext.request.contextPath}/dailyreport">
			<table>
				<tr>
					<td style="width: 100px;">Người báo cáo:</td>
					<td style="width: 100px;"><form:input path="username"
							value="${dailyreport.username}" style="width:100px;" /><br /></td>
				</tr>
				<tr>
					<td>Ngày báo cáo:</td>
					<td><input type="text" id="datereport" name="datereport"
						value="${dailyreport.datereport}" /></td>
				</tr>
				<tr></tr>
				<tr>
					<td>Stt</td>
					<td>Dich Vu</td>
					<td>Phat trien (TB)</td>
					<td>Khoi Phuc (TB)</td>
					<td>Cat Giam (TB)</td>
					<td>Tam Dung (TB)</td>
					<td>TB (ko lap kip)</td>
					<td>TB (ko d/u dc)</td>
					<td></td>
				</tr>
				<tr>
					<td>1</td>
					<td>2</td>
					<td>3</td>
					<td>4</td>
					<td>5</td>
					<td>6</td>
					<td>9</td>
					<td>10</td>
				</tr>
				<tr>
					<td>1</td>
					<td>Di dong tra truoc</td>
					<td><form:input path="prepaidDevelop"
							value="${dailyreport.prepaidDevelop}" style="width:100px;" /></td>
					<td><form:input path="prepaidRestore"
							value="${dailyreport.prepaidRestore}" style="width:100px;" /></td>
					<td><form:input path="prepaidCut"
							value="${dailyreport.prepaidCut}" style="width:100px;" /></td>
					<td><form:input path="prepaidStop"
							value="${dailyreport.prepaidStop}" style="width:100px;" /></td>
					<td><form:input path="prepaidUninstall"
							value="${dailyreport.prepaidUninstall}" style="width:100px;" /></td>
					<td><form:input path="prepaidUnresponsive"
							value="${dailyreport.prepaidUnresponsive}" style="width:100px;" /></td>
				</tr>
				<tr>
					<td>2</td>
					<td>Di dong tra sau+ezpost</td>
					<td><form:input path="postpaidDevelop"
							value="${dailyreport.postpaidDevelop}" style="width:100px;" /></td>
					<td><form:input path="postpaidRestore"
							value="${dailyreport.postpaidRestore}" style="width:100px;" /></td>
					<td><form:input path="postpaidCut"
							value="${dailyreport.postpaidCut}" style="width:100px;" /></td>
					<td><form:input path="postpaidStop"
							value="${dailyreport.postpaidStop}" style="width:100px;" /></td>
					<td><form:input path="postpaidUninstall"
							value="${dailyreport.postpaidUninstall}" style="width:100px;" /></td>
					<td><form:input path="postpaidUnresponsive"
							value="${dailyreport.postpaidUnresponsive}" style="width:100px;" /></td>
				</tr>
				<tr>
					<td>3</td>
					<td>Co dinh</td>
					<td><form:input path="fixedDevelop"
							value="${dailyreport.fixedDevelop}" style="width:100px;" /></td>
					<td><form:input path="fixedRestore"
							value="${dailyreport.fixedRestore}" style="width:100px;" /></td>
					<td><form:input path="fixedCut"
							value="${dailyreport.fixedCut}" style="width:100px;" /></td>
					<td><form:input path="fixedStop"
							value="${dailyreport.fixedStop}" style="width:100px;" /></td>
					<td><form:input path="fixedUninstall"
							value="${dailyreport.fixedUninstall}" style="width:100px;" /></td>
					<td><form:input path="fixedUnresponsive"
							value="${dailyreport.fixedUnresponsive}" style="width:100px;" /></td>
				</tr>
				<tr>
					<td>4</td>
					<td>Gphone</td>
					<td><form:input path="gphoneDevelop"
							value="${dailyreport.gphoneDevelop}" style="width:100px;" /></td>
					<td><form:input path="gphoneRestore"
							value="${dailyreport.gphoneRestore}" style="width:100px;" /></td>
					<td><form:input path="gphoneCut"
							value="${dailyreport.gphoneCut}" style="width:100px;" /></td>
					<td><form:input path="gphoneStop"
							value="${dailyreport.gphoneStop}" style="width:100px;" /></td>
					<td><form:input path="gphoneUninstall"
							value="${dailyreport.gphoneUninstall}" style="width:100px;" /></td>
					<td><form:input path="gphoneUnresponsive"
							value="${dailyreport.gphoneUnresponsive}" style="width:100px;" /></td>
				</tr>
				<tr>
					<td>5</td>
					<td>Fiber Vnn</td>
					<td><form:input path="fiberDevelop"
							value="${dailyreport.fiberDevelop}" style="width:100px;" /></td>
					<td><form:input path="fiberRestore"
							value="${dailyreport.fiberRestore}" style="width:100px;" /></td>
					<td><form:input path="fiberCut"
							value="${dailyreport.fiberCut}" style="width:100px;" /></td>
					<td><form:input path="fiberStop"
							value="${dailyreport.fiberStop}" style="width:100px;" /></td>
					<td><form:input path="fiberUninstall"
							value="${dailyreport.fiberUninstall}" style="width:100px;" /></td>
					<td><form:input path="fiberUnresponsive"
							value="${dailyreport.fiberUnresponsive}" style="width:100px;" /></td>
				</tr>
				<tr>
					<td>6</td>
					<td>Mega Vnm</td>
					<td><form:input path="megaDevelop"
							value="${dailyreport.megaDevelop}" style="width:100px;" /></td>
					<td><form:input path="megaRestore"
							value="${dailyreport.megaRestore}" style="width:100px;" /></td>
					<td><form:input path="megaCut" value="${dailyreport.megaCut}"
							style="width:100px;" /></td>
					<td><form:input path="megaStop"
							value="${dailyreport.megaStop}" style="width:100px;" /></td>
					<td><form:input path="megaUninstall"
							value="${dailyreport.megaUninstall}" style="width:100px;" /></td>
					<td><form:input path="megaUnresponsive"
							value="${dailyreport.megaUnresponsive}" style="width:100px;" /></td>
				</tr>
				<tr>
					<td>7</td>
					<td>MyTV</td>
					<td><form:input path="mytvDevelop"
							value="${dailyreport.mytvDevelop}" style="width:100px;" /></td>
					<td><form:input path="mytvRestore"
							value="${dailyreport.mytvRestore}" style="width:100px;" /></td>
					<td><form:input path="mytvCut" value="${dailyreport.mytvCut}"
							style="width:100px;" /></td>
					<td><form:input path="mytvStop"
							value="${dailyreport.mytvStop}" style="width:100px;" /></td>
					<td><form:input path="mytvUninstall"
							value="${dailyreport.mytvUninstall}" style="width:100px;" /></td>
					<td><form:input path="mytvUnresponsive"
							value="${dailyreport.mytvUnresponsive}" style="width:100px;" /></td>
				</tr>
				<tr>
					<td>8</td>
					<td>VNPT CA-IVAN</td>
					<td><form:input path="ivanDevelop"
							value="${dailyreport.ivanDevelop}" style="width:100px;" /></td>
					<td><form:input path="ivanRestore"
							value="${dailyreport.ivanRestore}" style="width:100px;" /></td>
					<td><form:input path="ivanCut" value="${dailyreport.ivanCut}"
							style="width:100px;" /></td>
					<td><form:input path="ivanStop"
							value="${dailyreport.ivanStop}" style="width:100px;" /></td>
					<td><form:input path="ivanUninstall"
							value="${dailyreport.ivanUninstall}" style="width:100px;" /></td>
					<td><form:input path="ivanUnresponsive"
							value="${dailyreport.ivanUnresponsive}" style="width:100px;" /></td>
				</tr>
				<tr>
					<td>9</td>
					<td>VnEdu</td>
					<td><form:input path="vneduDevelop"
							value="${dailyreport.vneduDevelop}" style="width:100px;" /></td>
					<td><form:input path="vneduRestore"
							value="${dailyreport.vneduRestore}" style="width:100px;" /></td>
					<td><form:input path="vneduCut"
							value="${dailyreport.vneduCut}" style="width:100px;" /></td>
					<td><form:input path="vneduStop"
							value="${dailyreport.vneduStop}" style="width:100px;" /></td>
					<td><form:input path="vneduUninstall"
							value="${dailyreport.vneduUninstall}" style="width:100px;" /></td>
					<td><form:input path="vneduUnresponsive"
							value="${dailyreport.vneduUnresponsive}" style="width:100px;" /></td>
				</tr>
				<tr>
					<td>10</td>
					<td>The</td>
					<td><form:input path="cardDevelop"
							value="${dailyreport.cardDevelop}" style="width:100px;" /></td>
					<td><form:input path="cardRestore"
							value="${dailyreport.cardRestore}" style="width:100px;" /></td>
					<td><form:input path="cardCut" value="${dailyreport.cardCut}"
							style="width:100px;" /></td>
					<td><form:input path="cardStop"
							value="${dailyreport.cardStop}" style="width:100px;" /></td>
					<td><form:input path="cardUninstall"
							value="${dailyreport.cardUninstall}" style="width:100px;" /></td>
					<td><form:input path="cardUnresponsive"
							value="${dailyreport.cardUnresponsive}" style="width:100px;" /></td>
				</tr>
				<tr>
					<td>11</td>
					<td>Thu cuoc truoc</td>

					<td><form:input path="chargeDevelop"
							value="${dailyreport.chargeDevelop}" style="width:100px;" /></td>
					<td><form:input path="chargeRestore"
							value="${dailyreport.chargeRestore}" style="width:100px;" /></td>
					<td><form:input path="chargeCut"
							value="${dailyreport.chargeCut}" style="width:100px;" /></td>
					<td><form:input path="chargeStop"
							value="${dailyreport.chargeStop}" style="width:100px;" /></td>
					<td><form:input path="chargeUninstall"
							value="${dailyreport.chargeUninstall}" style="width:100px;" /></td>
					<td><form:input path="chargeUnresponsive"
							value="${dailyreport.chargeUnresponsive}" style="width:100px;" /></td>
					<td><form:input type="hidden" path="dailyReportId"
							value="${dailyreport.dailyReportId}" style="width:100px;" /></td>
				</tr>
			</table>
			<br />
			<br />
			<tr>
				<td colspan="2" align="left"><input id="btnSave"
					name="saveReport" type="submit" value="saveReport"></td>
				<td colspan="2" align="left"><input id="btnEdit"
					name="editReport" type="submit" value="editReport"></td>
				<td colspan="2" align="left"><input id="btnSend"
					name="sendReport" type="submit" value="sendReport"></td>
			</tr>
			<br />
			<br />
		</form:form>
	</div>
</body>
</head>
</html>