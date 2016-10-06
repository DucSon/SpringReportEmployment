<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <title>ReportForm of Employment</title>
 <body>
		<div align="center">
		<h1>ReportForm of Employment</h1>
<form name='f' action="${pageContext.request.contextPath}/j_spring_security_check" method='POST'>
		<table>
<%-- <form:hidden path="id"/> --%>
			<tr>
				<td>Stt</td>
				<td>Dich Vu</td>
				<td>Phat Trien(TB)</td>
				<td>Khoi Phuc (TB)</td>
				<td>Cat Giam (TB)</td>
				<td>Tam Dung (TB)</td>
				<td>Thue bao ton TTVT chua lap dat</td>
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
				<td><input type='text' name='abc1' value=''></td>
				<td><input type='text' name='abc2' value=''></td>
				<td><input type='text' name='abc3' value=''></td>
				<td><input type='text' name='abc4' value=''></td>
				<td><input type='text' name='abc5' value=''></td>
				<td><input type='text' name='abc6' value=''></td>
				<td><input type='text' name='abc7' value=''></td>
			</tr>
			<tr>
				<td>2</td>
				<td>Di dong tra sau+ezpost</td>
				<td><input type='text' name='abc11' value=''></td>
				<td><input type='text' name='abc12' value=''></td>
				<td><input type='text' name='abc13' value=''></td>
				<td><input type='text' name='abc14' value=''></td>
				<td><input type='text' name='abc15' value=''></td>
				<td><input type='text' name='abc16' value=''></td>
				<td><input type='text' name='abc17' value=''></td>
			</tr>
			<tr>
				<td>3</td>
				<td>Co dinh</td>
				<td><input type='text' name='abc21' value=''></td>
				<td><input type='text' name='abc22' value=''></td>
				<td><input type='text' name='abc23' value=''></td>
				<td><input type='text' name='abc24' value=''></td>
				<td><input type='text' name='abc25' value=''></td>
				<td><input type='text' name='abc26' value=''></td>
				<td><input type='text' name='abc27' value=''></td>
			</tr>			
			<tr>
				<td>4</td>
				<td>Gphone</td>
				<td><input type='text' name='abc31' value=''></td>
				<td><input type='text' name='abc32' value=''></td>
				<td><input type='text' name='abc33' value=''></td>
				<td><input type='text' name='abc34' value=''></td>
				<td><input type='text' name='abc35' value=''></td>
				<td><input type='text' name='abc36' value=''></td>
				<td><input type='text' name='abc37' value=''></td>
			</tr>			
			<tr>
				<td>5</td>
				<td>Fiber Vnn</td>
				<td><input type='text' name='abc41' value=''></td>
				<td><input type='text' name='abc42' value=''></td>
				<td><input type='text' name='abc43' value=''></td>
				<td><input type='text' name='abc44' value=''></td>
				<td><input type='text' name='abc45' value=''></td>
				<td><input type='text' name='abc46' value=''></td>
				<td><input type='text' name='abc47' value=''></td>
			</tr>			
			<tr>
				<td>6</td>
				<td>Mega Vnm</td>
				<td><input type='text' name='abc51' value=''></td>
				<td><input type='text' name='abc52' value=''></td>
				<td><input type='text' name='abc53' value=''></td>
				<td><input type='text' name='abc54' value=''></td>
				<td><input type='text' name='abc55' value=''></td>
				<td><input type='text' name='abc56' value=''></td>
				<td><input type='text' name='abc57' value=''></td>
			</tr>			
			<tr>
				<td>7</td>
				<td>MyTV</td>
				<td><input type='text' name='abc61' value=''></td>
				<td><input type='text' name='abc62' value=''></td>
				<td><input type='text' name='abc63' value=''></td>
				<td><input type='text' name='abc64' value=''></td>
				<td><input type='text' name='abc65' value=''></td>
				<td><input type='text' name='abc66' value=''></td>
				<td><input type='text' name='abc67' value=''></td>
			</tr>			
			<tr>
				<td>8</td>
				<td>VNPT CA-IVAN</td>
				<td><input type='text' name='abc71' value=''></td>
				<td><input type='text' name='abc72' value=''></td>
				<td><input type='text' name='abc73' value=''></td>
				<td><input type='text' name='abc74' value=''></td>
				<td><input type='text' name='abc75' value=''></td>
				<td><input type='text' name='abc76' value=''></td>
				<td><input type='text' name='abc77' value=''></td>
			</tr>
					<tr>
				<td>9</td>
				<td>VnEdu</td>
				<td><input type='text' name='abc91' value=''></td>
				<td><input type='text' name='abc92' value=''></td>
				<td><input type='text' name='abc93' value=''></td>
				<td><input type='text' name='abc94' value=''></td>
				<td><input type='text' name='abc95' value=''></td>
				<td><input type='text' name='abc96' value=''></td>
				<td><input type='text' name='abc97' value=''></td>
			</tr>
					<tr>
				<td>10</td>
				<td>The</td>
				<td><input type='text' name='abc81' value=''></td>
				<td><input type='text' name='abc82' value=''></td>
				<td><input type='text' name='abc83' value=''></td>
				<td><input type='text' name='abc84' value=''></td>
				<td><input type='text' name='abc85' value=''></td>
				<td><input type='text' name='abc86' value=''></td>
				<td><input type='text' name='abc87' value=''></td>
			</tr>
					<tr>
				<td>11</td>
				<td>Thu cuoc truoc</td>
				<td><input type='text' name='abc101' value=''></td>
				<td><input type='text' name='abc102' value=''></td>
				<td><input type='text' name='abc103' value=''></td>
				<td><input type='text' name='abc104' value=''></td>
				<td><input type='text' name='abc105' value=''></td>
				<td><input type='text' name='abc106' value=''></td>
				<td><input type='text' name='abc107' value=''></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Save"></td>
			</tr>
		</table>
		</form>
	</div>
</body>
 </head>
</html>