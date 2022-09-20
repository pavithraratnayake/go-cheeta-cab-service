<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer</title>
</head>
<body>

  <%
  String user = null;
  if(session.getAttribute("sessionusername") == null){
    response.sendRedirect("admin-login.jsp");
    
  }
  else user = (String) session.getAttribute("sessionusername");
  
  String userName = null;
  String sessionID = null;
  Cookie[] cookies = request.getCookies();
  if(cookies !=null){
  for(Cookie cookie : cookies){
    if(cookie.getName().equals("sessionusername")) userName = cookie.getValue();
    if(cookie.getName().equals("JSESSIONID")) sessionID = cookie.getValue();
  }
  }
  %>
  
  <jsp:include page="nav.jsp" />

  <main style="margin-top: 20px">
    <div class="container pt-4">
      <h2 class="text-center">Manage Customers</h2>
      
      <ul class="nav nav-tabs" style="margin-top: 20px;">
        <li class="nav-item">
          <a class="nav-link" aria-current="page" href="getCustomer?action=all">All Customers</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="search-edit-customer.jsp">Search Customer</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="add-customer.jsp">Add Customer</a>
        </li>
      </ul>
  
  <p>${message}</p>
  
  <div class="container">
  	<form action = "addCustomer" method="post">
  		<label for="fname" class="form-label">First Name</label>
  		<input type="text" id="fname" class="form-control" name="fname"/>

      <label for="lname" class="form-label">Last Name</label>
  		<input type="text" id="lname" class="form-control" name="lname"/>

      <label for="address" class="form-label">User Name</label>
  		<input type="text" id="address" class="form-control" name="address"/>

      <label for="contact" class="form-label">Contact</label>
  		<input type="text" id="contact" class="form-control" name="contact"/>
      

  		<input type="hidden" name="action" value="add"/>
  		
      <label for="email" class="form-label">Email</label>
  		<input type="email" id="email" class="form-control" name="email"/>
  		
  		<label for="password" class="form-label">Password</label>
  		<input type="password" id=password" class="form-control" name="password"/> <br>

		<button type="submit" class="btn btn-primary"> Add Customer</button>
		
  	</form>
  
  </div>
  
  
</body>
</html>