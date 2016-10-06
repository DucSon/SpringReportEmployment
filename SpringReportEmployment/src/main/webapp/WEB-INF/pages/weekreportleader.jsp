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
    
    <h1>Report of Employment</h1>
    <h3>Nhan vien:${dailyreport.username}</h3>
	<form:form id="searchForm" modelAttribute="searchForm" method="POST"
		action="/SpringReportEmployment/weekreport">
		<table>
			<tr>
				<td>Tu Ngay:</td>
				<td><input type="text" id="fromDate" name="fromDate"
					value="${searchForm.fromDate}" /></td>
				<td>Den Ngay:</td>
				<td><input type="text" id="toDate" name="toDate"
					value="${searchForm.toDate}" /></td>
				<td>Nhan vien:</td>
				<td><input type="text" id="username" name="username"
					value="${searchForm.username}" /></td>
			</tr>

		</table>
		<tr>
			<td colspan="2" align="left"><input id="btnSearch"
				name="searchReport" type="submit" value="searchReport"></td>
			<td colspan="2" align="left"><input id="btnExport"
				name="expReport" type="submit" value="expReport"></td>
		</tr>
	</form:form>

	<table border=1>
				<tr>
				<td>Stt</td>
				<td>Dich Vu</td>
				<td>Phat trien (TB)</td>
				<td>Khoi Phuc (TB)</td>
				<td>Cat Giam (TB)</td>
				<td>Tam Dung (TB)</td>
				<td>Thuc tang (TB)</td>
				<td>TB (ko lap kip)</td>
				<td>TB (ko d/u dc)</td>
			</tr>
			<tr>
				<td>1</td>
				<td>2</td>
				<td>3</td>
				<td>4</td>
				<td>5</td>
				<td>6</td>
				<td>7=(3+4)-(5+6)</td>
				<td>9</td>
				<td>10</td>
			</tr>
			<tr>
				<td>1</td>
				<td>Di dong tra truoc</td>
				<td>${dailyreport.prepaidDevelop}</td>
				<td>${dailyreport.prepaidRestore}</td>
				<td>${dailyreport.prepaidCut}</td>
				<td>${dailyreport.prepaidStop}</td>
				<td>${dailyreport.prepaidIncrease}</td>
				<td>${dailyreport.prepaidUninstall}</td>
				<td>${dailyreport.prepaidUnresponsive}</td>
			</tr>
			<tr>
				<td>2</td>
				<td>Di dong tra sau+ezpost</td>
				<td>${dailyreport.postpaidDevelop}</td>
				<td>${dailyreport.postpaidRestore}</td>
				<td>${dailyreport.postpaidCut}</td>
				<td>${dailyreport.postpaidStop}</td>
				<td>${dailyreport.postpaidIncrease}</td>
				<td>${dailyreport.postpaidUninstall}</td>
				<td>${dailyreport.postpaidUnresponsive}</td>
			</tr>	
			<tr>
				<td>3</td>
				<td>Co dinh</td>
				<td>${dailyreport.fixedDevelop}</td>
				<td>${dailyreport.fixedRestore}</td>
				<td>${dailyreport.fixedCut}</td>
				<td>${dailyreport.fixedStop}</td>
				<td>${dailyreport.fixedIncrease}</td>
				<td>${dailyreport.fixedUninstall}</td>
				<td>${dailyreport.fixedUnresponsive}</td>
			</tr>			
			<tr>
				<td>4</td>
				<td>Gphone</td>
				<td>${dailyreport.gphoneDevelop}</td>
				<td>${dailyreport.gphoneRestore}</td>
				<td>${dailyreport.gphoneCut}</td>
				<td>${dailyreport.gphoneStop}</td>
				<td>${dailyreport.gphoneIncrease}</td>
				<td>${dailyreport.gphoneUninstall}</td>
				<td>${dailyreport.gphoneUnresponsive}</td>
			</tr>
			<tr>
				<td>5</td>
				<td>Fiber Vnn</td>
				<td>${dailyreport.fiberDevelop}</td>
				<td>${dailyreport.fiberRestore}</td>
				<td>${dailyreport.fiberCut}</td>
				<td>${dailyreport.fiberStop}</td>
				<td>${dailyreport.fiberIncrease}</td>
				<td>${dailyreport.fiberUninstall}</td>
				<td>${dailyreport.fiberUnresponsive}</td>
			</tr>			
			<tr>
				<td>6</td>
				<td>Mega Vnm</td>
				<td>${dailyreport.megaDevelop}</td>
				<td>${dailyreport.megaRestore}</td>
				<td>${dailyreport.megaCut}</td>
				<td>${dailyreport.megaStop}</td>
				<td>${dailyreport.megaIncrease}</td>
				<td>${dailyreport.megaUninstall}</td>
				<td>${dailyreport.megaUnresponsive}</td>
			</tr>			
		<tr>
				<td>7</td>
				<td>MyTV</td>
				<td>${dailyreport.mytvDevelop}</td>
				<td>${dailyreport.mytvRestore}</td>
				<td>${dailyreport.mytvCut}</td>
				<td>${dailyreport.mytvStop}</td>
				<td>${dailyreport.mytvIncrease}</td>
				<td>${dailyreport.mytvUninstall}</td>
				<td>${dailyreport.mytvUnresponsive}</td>
			</tr>	
			<tr>
				<td>8</td>
				<td>VNPT CA-IVAN</td>
				<td>${dailyreport.ivanDevelop}</td>
				<td>${dailyreport.ivanRestore}</td>
				<td>${dailyreport.ivanCut}</td>
				<td>${dailyreport.ivanStop}</td>
				<td>${dailyreport.ivanIncrease}</td>
				<td>${dailyreport.ivanUninstall}</td>
				<td>${dailyreport.ivanUnresponsive}</td>
			</tr>		
			<tr>
				<td>9</td>
				<td>VnEdu</td>
				<td>${dailyreport.vneduDevelop}</td>
				<td>${dailyreport.vneduRestore}</td>
				<td>${dailyreport.vneduCut}</td>
				<td>${dailyreport.vneduStop}</td>
				<td>${dailyreport.vneduIncrease}</td>
				<td>${dailyreport.vneduUninstall}</td>
				<td>${dailyreport.vneduUnresponsive}</td>
			</tr>	
			<tr>
				<td>10</td>
				<td>Card</td>
				<td>${dailyreport.cardDevelop}</td>
				<td>${dailyreport.cardRestore}</td>
				<td>${dailyreport.cardCut}</td>
				<td>${dailyreport.cardStop}</td>
				<td>${dailyreport.cardIncrease}</td>
				<td>${dailyreport.cardUninstall}</td>
				<td>${dailyreport.cardUnresponsive}</td>
			</tr>	
			<tr>
				<td>11</td>
				<td>Thu cuoc truoc</td>
				<td>${dailyreport.chargeDevelop}</td>
				<td>${dailyreport.chargeRestore}</td>
				<td>${dailyreport.chargeCut}</td>
				<td>${dailyreport.chargeStop}</td>
				<td>${dailyreport.chargeIncrease}</td>
				<td>${dailyreport.chargeUninstall}</td>
				<td>${dailyreport.chargeUnresponsive}</td>
			</tr>	
		</table>
</body>
</html>