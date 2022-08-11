<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List,model.Product"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

List<Product> addproduct = new ArrayList<>();


addproduct.add(new Product("1","Watch","1000"));
addproduct.add(new Product("2","Phone","50000"));
addproduct.add(new Product("3","Mouse","1000"));
addproduct.add(new Product("4","laptop","100000"));


pageContext.setAttribute("myproducts", addproduct);

System.out.println(addproduct);



%>

<h3>Product Details</h3>
	<table>
		<tr>
			<th>ProductId</th>
			<th>Product Name</th>
			<th>Product price</th>
		</tr>
		<c:forEach var="product" items="${myproducts}">
			<tr>
				<td>${product.productid}</td>
				<td>${product.productname}</td>
				<td>${product.productprice}</td>
			</tr>
		</c:forEach>

	</table>


</body>
</html>