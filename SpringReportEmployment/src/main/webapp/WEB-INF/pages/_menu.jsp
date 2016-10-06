<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<div style="border: 1px solid #ccc;padding:5px;margin-bottom:20px;">
 
  <a href="${pageContext.request.contextPath}/welcome">Home</a>
  | &nbsp; 
   <a href="${pageContext.request.contextPath}/userInfo">Nhan vien</a>
  | &nbsp;
  <a href="${pageContext.request.contextPath}/leader">To truong</a>
  | &nbsp;
  <a href="${pageContext.request.contextPath}/districtDirector">Giam doc huyen</a>
    | &nbsp;
  <a href="${pageContext.request.contextPath}/provinceDirector">Giam doc tinh</a>  
  
  <c:if test="${pageContext.request.userPrincipal.name != null}">
 
     | &nbsp;
     <a href="${pageContext.request.contextPath}/logout">Logout</a>
  </c:if>
  
</div>