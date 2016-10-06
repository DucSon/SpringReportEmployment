<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<html>
 <head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <title>Department List</title>
 </head>
 <body>
     <div align="center">
         <h1>Department List</h1>
         <table border="1">
             <th>No</th>
             <th>Dept No</th>
             <th>Dept Name</th>
             <th>Location</th> 
             <th>Date</th> 
            
             <c:forEach var="dept" items="${departments}" varStatus="status">
             <tr>
                 <td>${status.index + 1}</td>
                 <td>${dept.deptNo}</td>
                 <td>${dept.deptName}</td>
                 <td>${dept.location}</td>      
                 <td>${dept.date}</td>                          
             </tr>
             </c:forEach>                
         </table>
     </div>
 </body>
</html>