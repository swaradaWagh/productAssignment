
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<jsp>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
   <spring:url value="/resources/js/jquery-3.1.1.js" var="jqueryJs" />
    <script src="${jqueryJs}"></script>
   <title>Add Users using ajax</title>
       
        <script type="text/javascript">
        
        jQuery(document).ready(function($) {
          alert("in ready");
        	
        });
        
        function editProduct(p){
        	alert("sdsdsd"+1);
        	  $.ajax({
            contentType : "application/json",
        	type: "POST",
        	url: "/showEditProduct",
            data: "productId="+p,
            success: function(response){
            alert("Success");
                },
                error: function(e){
                alert('Error: ' + e);
                }
                });
        }
        </script>
        
</head>
<body>

<table border="1">
<tr>
  <th>PRODUCT NAME</th>
  <th>DESCRIPTION</th>
  <th>BRAND</th>
  <th>PRICE</th>
  <th>Action</th>
</tr>
<c:forEach items="${productList}" var="product">
<tr>
  <td>${product.name} </td>
  <td>${product.description}</td>
  <td>${product.brandName}</td>
  <td>${product.price}</td>
  <td><input type="BUTTON" value="EDIT" onclick='editProduct(${product.productId})'/><input type="BUTTON" value="DELETE" onclick="deleteProduct"/></td>
<tr>		
</c:forEach>
</table>
</body>
</jsp>