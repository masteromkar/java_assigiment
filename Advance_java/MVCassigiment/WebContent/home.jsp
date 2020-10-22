<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ include file="cache_control.jsp" %>
<%@ include file="header.jsp" %>
<jsp:useBean id="user" class="com.dto.User" scope="session" ></jsp:useBean>
<% 
	if(user !=null && user.getUserId()>0){
		String fname= auser.getFullname();
%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	
		<table align="center" style="background-color: Yellow;font-size: 25px" >
			<thead>
				<tr>
					<th colspan="2" >Home Page</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td colspan="2" style="color: red">Welcome <%=fname%>></td>
					
				</tr>
				<tr>
					<td><a href="logout.jsp" >Log out</a></td>				
				</tr>
				
			</tbody>
		</table>
	
</body>
</html>
<% }else{
	response.sendRedirect("login.jsp");	
	}
	%>
