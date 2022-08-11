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
			<th>ProductId</th>
			<th>Product Name</th>
			<th>Product price</th>
		</tr>
		<c:forEach var="product" items="${PRODUCT_LIST}" >
			<tr>
				<td>${product.productid}</td>
				<td>${product.productname}</td>
				<td>${product.productprice}</td>
			</tr>
		</c:forEach>
	</table>
	
	<a href="Home.html">Home</a>

</body>
</html>