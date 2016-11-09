<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.8.3.js"></script>
<script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>

<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.10.3/jquery-ui.min.js"></script>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jstree/3.3.2/jstree.min.js"></script>
<link href="skin-win8/ui.fancytree.css" rel="stylesheet" type="text/css">

<head>
<title>AddUser</title>
<style>
html {
	margin: 0;
	padding: 0;
	font-size: 62.5%;
}

body {
	max-width: 800px;
	min-width: 300px;
	margin: 0 auto;
	padding: 20px 10px;
	font-size: 14px;
	font-size: 1.4em;
}

h1 {
	font-size: 1.8em;
}

.treeview {
	overflow: auto;
	border: 1px solid silver;
	min-height: 100px;
}
</style>
</head>
<body>
	<h3>Enter user name and repeat password:</h3>
	<div align="left">
		<form:form id="adduser" action="/SpringReportEmployment/addUser"
			modelAttribute="userForm" method='POST'>
			<table>
				<tr>
					<td>User:</td>
					<td><input type='text' name='username' value=''></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type='password' name='password' /></td>
				</tr>
				<tr>
					<td>Repeat Password:</td>
					<td><input type='password' name='repeatpass' /></td>
				</tr>
				<tr>
					<td><input name="submit" type="submit" value="addUser" /></td>
					<td>Manager:</td>
					<td><input type='text' name='managername' value=''></td>
					<td><div id="evts" class="treeview"></div></td>
				</tr>
			</table>
		</form:form>
	</div>
	<script>
var data2 = [{"id":1,"text":"Root node","children":[{"id":2,"text":"Child node 12345"},{"id":3,"text":"Child node 2"}]}];

// interaction and events
$("#evts")
	.on("changed.jstree", function (e, data) {
		if(data.selected.length) {
					    document.getElementById("input").value =  data.instance.get_node(data.selected[0]).text;
		}
	})
	.jstree({
		'core' : {
			'multiple' : false,
			'data' : data2,
		}
	});
 </script>
</body>