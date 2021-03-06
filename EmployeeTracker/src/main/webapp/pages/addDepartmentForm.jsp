<%-- 
    Document   : index
    Created on : Aug 22, 2018, 10:27:20 PM
    Author     : Jayandra
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>

<head>
  <title>Add Department</title>
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
        <h1>Add Department</h1>
      
        <form:form action="addDepartment" modelAttribute="Department" method="POST">
        
        <form:hidden path="did"/>  
            <table>
            <!-- <tr>
            <td>
            <label>Id </label></td><td><input type="text" name="id"></td>
            </tr> -->
            <tr>
            <td>
            <label>Department Name </label></td><td><form:input path="deptName" /></td>
             </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Save" class="save"></td>
            </table>
            
        </form:form>
        
        <p>
            <a href="listDepartment">Back to Department List</a>
        </p>
      </div>
    </div>
    <!-- Footer-->
    <jsp:include page="includes/footer.jsp"/>
  </div>
</body>
</html>
