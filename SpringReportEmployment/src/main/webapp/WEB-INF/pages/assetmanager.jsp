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
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Weekly Plan</title>
<script type="text/javascript">

var startDate;
var endDate;
var startDateAfter="";
var endDateAfter="";

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
		<h1>Assets Management</h1>
		<h2 align="left" style="width: 80%;">
		Danh sách và trạng thái
		<br>
		</h2>
		<form:form id="asset" modelAttribute="assetInfoForm" enctype="multipart/form-data" method="POST"
			action="${pageContext.request.contextPath}/assetmanager">
			<div>
			 <img src="${pageContext.request.contextPath}/productImage?code=S004" width="100"/>
				<div id="treeview" align="left">
					<table>
						<tr>
							<td style="width: 100px;">N/V quản lý tài sản:</td>
							<td style="width: 100px;"><form:input path="username"
									type="text" value="${asset.username}" style="width:100px;" /><br /></td>
						</tr>
						<tr>
							<td>Ngày thêm tài sản:</td>
							<td><input type="text" id="asset" name="asset"
								value="${asset.nsx}" /></td>
						</tr>
						<tr>
							<td>Nhân viên</td>
							<td></td>
						</tr>
					</table>
					<div id="evts" class="treeview" style="overflow: scrollbar;"></div>
				</div>
				<div id="tableplan" align="right" onload="load();">
				<div>
					<table border="1" id="table">
						<tr>
							<th style="width: 15%;">AssetName</th>
							<th style="width: 10%;">NSX</th>
							<th style="width: 10%;">HSD</th>
							<th style="width: 10%;">Location</th>
							<th style="width: 7%;">Price</th>
							<th style="width: 20%;">Image</th>
							<th style="width: 10%;">StatusAsset</th>
							<th style="width: 5%;">Status</th>
							<th style="width: 17%;">Note</th>
							<th><input type="checkbox" id="checkBoxAll"></th>
						</tr>
						<c:if test="${not empty list}">
							<c:forEach var="listAsset" items="${list}">
								<tr>
									<td style="width: 15%;">${listAsset.assetname}</td>
									<td style="width: 10%;">${listAsset.nsx}</td>
									<td style="width: 10%;">${listAsset.hsd}</td>
									<td style="width: 10%;">${listAsset.location}</td>
									<td style="width: 7%;">${listAsset.price}</td>
									<td style="width: 20%;">${listAsset.image}</td>
									<td style="width: 10%;">${listAsset.statusasset}</td>
									<td style="width: 5%;">${listAsset.status}</td>
									<td style="width: 17%;">${listAsset.note}</td>
									<td><input type="checkbox" class="chkCheckBoxId"
										value="${listAsset.assetid}" name="assetid"></td>
								</tr>
							</c:forEach>
						</c:if>
					</table>
					</div>
					<br>
					<br>
					<div id="addasset">
					<table>
						<tr>
							<td><b>Thêm mới tài sản:</b></td>
						</tr>
						<tr>
							<td>Name</td>
							<td>NSX</td>
							<td>HSD</td>
							<td>Location</td>
							<td>Price</td>
							<td>Image</td>
							<td>StatusAsset</td>
							<td>Note</td>
							<td></td>
						</tr>
						<tr>
							<td><form:input path="assetname" value="${asset.assetname}"
									style="width:170px;" /></td>
							<td><form:input path="nsx" value="${asset.nsx}"
									style="width:100px;" /></td>
							<td><form:input path="hsd" value="${asset.hsd}"
									style="width:100px;" /></td>
							<td><form:input path="location" value="${asset.location}"
									style="width:100px;"/></td>
							<td><form:input path="price" value="${asset.price}"
									style="width:70px;" /></td>
							<td><form:input type="file" path="fileData" value="${asset.fileData}"
									style="width:200px;" /></td>	
							<td><form:input path="statusasset"
									value="${asset.statusasset}" style="width:100px;" /></td>		
							<td><form:input path="note" value="${asset.note}"
									style="width:170px;" /></td>
						</tr>
						
					</table>
					<div align="left">
						<br>
						<table>
							<tr>
								<td colspan="2" align="left"><input id="btnSave"
									name="saveAsset" type="submit" value="Thêm Tài sản"></td>
								<td colspan="2" align="left"><input id="btnDelete"
									name="deleteAsset" type="submit" value="deleteAsset"></td>
								<td colspan="2" align="left"><input id="btnSend"
									name="sendAsset" type="submit" value="Gửi Public Room (Public)"></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
						</table>
					</div>
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
								"username": username
						};
						
						$.ajax({
							url:'selectNodeAsset',
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
								.append ("<tr> <th style='width: 15%;'>AssetName</th>"
								+ "<th style='width: 10%;'>NSX</th>"
								+ "<th style='width: 10%;'>HSD</th>"
								+ "<th style='width: 10%;'>Location</th>"
								+ "<th style='width: 7%;'>Price</th>"
								+ "<th style='width: 20%;'>Image</th>"
								+ "<th style='width: 10%;'>StatusAsset</th>"
								+ "<th style='width: 5%;'>Status</th>"
								+ "<th style='width: 17%;'>Note</th>"
								+ "<th><input type='checkbox' id='checkBoxAll'></th>");	
								
								for(var i =0;i< jsonarray.length;i++){
									
									$("#table")
									.append ("<tr> <th style='width: 15%;'>"+jsonarray[i].assetname+"</td>"
									+ "<td style='width: 10%;'>"+jsonarray[i].nsx+"</td>"
									+ "<td style='width: 10%;'>"+jsonarray[i].hsd+"</td>"
									+ "<td style='width: 10%;'>"+jsonarray[i].location+"</td>"
									+ "<td style='width: 7%;'>"+jsonarray[i].price+"</td>"
									+ "<td style='width: 20%;'>"+jsonarray[i].image+"</td>"
									+ "<td style='width: 10%;'>"+jsonarray[i].statusasset+"</td>"
									+ "<td style='width: 5%;'>"+jsonarray[i].status+"</td>"
									+ "<td style='width: 17%;'>"+jsonarray[i].note+"</td>"
									+ "<td><input type='checkbox' class='chkCheckBoxId' value="+jsonarray[i].assetid+" name='assetid'></td>");	
									
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

</script>
</body>
</head>
</html>