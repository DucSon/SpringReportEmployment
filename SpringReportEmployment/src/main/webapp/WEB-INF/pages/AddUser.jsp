AddUser.jsp
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<title>Add Users using ajax</title>
<script src="/AjaxWithSpringMVC2Annotation/js/jquery.js"></script>
<script type="text/javascript">
    function doAjaxPost() {
        // get the form values
        alert('doAjaxPost');
        var name = $('#name').val();
        alert('name');
        var education = $('#education').val();

        $.ajax({
            type : "POST",
            url : "/SpringReportEmployment/AddUser.htm",
            data : "name=" + name + "&education=" + education,
            success : function(response) {
                // we have the response
                $('#info').html(response);
                $('#name').val('');
                $('#education').val('');
            },
            error : function(e) {
                alert('Error: ' + e);
            }
        });
    }
</script>
</head>
<body>
    <h1>Add Users using Ajax ........</h1>
    <table>
        <tr>
            <td>Enter your name :</td>
            <td><input type="text" id="name" name="name"><br /></td>
        </tr>
        <tr>
            <td>Education :</td>
            <td><input type="text" id="education"><br /></td>
        </tr>
        <tr>
            <td colspan="2"><input type="button" value="Add Users"
                onclick="doAjaxPost()"><br /></td>
        </tr>
        <tr>
            <td colspan="2"><div id="info" style="color: green;"></div></td>
        </tr>
    </table>
    <a href="/SpringReportEmployment/showUsers.htm">Show All
        Users</a>
</body>
</html>