<%-- 
    Document   : index
    Created on : Aug 22, 2018, 10:27:20 PM
    Author     : Jayandra
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>

<head>
  <title>Add Employee</title>
 <!-- Head file-->  
 <jsp:include page="includes/headInclude.jsp" />
</head>

<body>
  <div id="main">
    <!--  header file--> 
    <jsp:include page="includes/header.jsp"/>
    <div id="site_content">
        <!-- Side Bar-->
        <jsp:include page="includes/rightCol.jsp"/>
      <div id="content">
        <!-- insert the page content here -->
        <h1>Add Employee</h1>
      
        <form:form action="addEmployee" modelAttribute="Employee" method="POST">
        
        <form:hidden path="id"/>  
            <table>

            <tr>
            <td>
            <label>Employee Name </label></td><td><form:input path="empName" /></td>
             </tr>
            <tr>
            <td>
            <label>Employee Email </label></td><td><form:input path="empEmail"/></td>
            </tr>
            
            <tr>
            <td>
            <label>Department Id</label></td>
            <td>
	            
				<form:select path="department">
                	 <c:forEach var="tempDept" items="${DeptDropList}">
   						<form:option value="${tempDept.did}" label="${tempDept.deptName}"/>	
           		 	</c:forEach>
				</form:select>        
            
            </td>
            </tr>            
            
            <tr>
                <td></td>
                <td><input type="submit" value="Save" class="save"></td>
            </table>
            
        </form:form>
        
        <p>
            <a href="listEmployee">Back to Employee List</a>
        </p>
        <p>
        TO SHOW IDS
        ${Employee}
        </p>
      </div>
    </div>
    <!-- Footer-->
    <jsp:include page="includes/footer.jsp"/>
  </div>
</body>
</html>
