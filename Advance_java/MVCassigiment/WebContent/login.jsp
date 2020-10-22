<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
	String unm = "";
	Cookie arr[] = request.getCookies();
	if(arr!=null){
		for(Cookie a : arr){
			String cname = a.getName();
			if(cname.equals("user_name")){
				unm = a.getValue();
				break;
			}
		}
	}
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form action="validate.jsp" method="post" >
		<table align="center" style="background-color: yellow;font-size: 25px" >
			<thead>
				<tr>
					<th colspan="2" style="color: red">Login Page</th>
				</tr>
			</thead>
			<tbody>
			
				<tr>
					<td>User Name</td>
					<td><input type="text" name="userName" value="<%=unm%>"  /> </td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="userPass"  /> </td>
				</tr>
				<tr>
					<td><a href="reg_form.jsp" >Sign up</a> </td>
					<td><input type="submit" value="Login"  /> </td>
				</tr>
				<tr>
					<td colspan="2" style="color: red;font-size: 15;text-align: center;" >
					<%=(request.getParameter("error_msg")!=null)? request.getParameter("error_msg"):"" %>
					</td>
					
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>