<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>ProductID</th>
			<th>Product Name</th>
		</tr>
		<c:forEach var="Product" items="${product}">
			<tr>
				<td>${Product.productid}</td>
				<td>${Product.productname}</td>


			</tr>
		</c:forEach>
	</table>
	
	<a href="Home.html">Home </a>


</body>
</html>