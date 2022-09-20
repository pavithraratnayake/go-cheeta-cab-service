<%@page import="java.util.List"%>
<%@page import="com.codewithpavi.gocheetacabservicesystem.model.Customer"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="tag" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Manage Customers</title>
      <!-- Font Awesome -->
      <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.11.2/css/all.css" />
      <!-- Google Fonts Roboto -->
      <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700&display=swap" />
      <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.4/Chart.min.js" integrity="sha512-d9xgZrVZpmmQlfonhQUvTR7lMPtO7NkZMkA0ABN3PHCbKA5nqylQ/yWlFAyY6hYgdF1Qh6nYiuADWwKB4C2WSw=="
        crossorigin="anonymous"></script>
    </head>
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
          <a class="nav-link active" aria-current="page" href="getCustomer?action=all">All Customers</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="search-edit-customer.jsp">Search Customer</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="add-customer.jsp">Add Customer</a>
        </li>
      </ul>
      
      <p>${message}</p>
      <p>${deleteMsg}</p>

      <div class="table-responsive">
        <table class="table" style="width:100%">
    
            <tr>
            <th>Customer ID </th>
            <th>First Name</th>
            <th>Last Model</th>
            <th>User Name</th>
            <th>Contact</th>
            <th>Email</th>
            <th>Action</th>
          </tr>
          

            <tag:forEach var="customer" items="${customerList}">
            <tr>
              <td>${customer.getCustomerID()}</td>
              <td>${customer.getfName()}</td>
              <td>${customer.getlName()}</td>
              <td>${customer.getUserName()}</td>
              <td>${customer.getContact()}</td>
              <td>${customer.getEmail()}</td>
              <td>
                <form action="deleteCustomer" method="post">
                  <input type="hidden" name="action" value="delete"/>
                  <input type="hidden" name="customerID" value="${customer.getCustomerID()}"/>
                  <button type="submit" class="btn btn-danger">Delete</button>
                </form>
              
              </td>
            </tr>
            </tag:forEach>

   
        </table>
      </div>
    </div>
  </main>       

</body>

</body>
</html>