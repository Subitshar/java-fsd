

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ProductAddServlet"  method="post">

<table>
			<tr>
				<td>Product Name:</td>
				<td><input name="productname"/></td>
			</tr>
			<tr>
				<td>Product Price:</td>
				<td><input name="productprice "/></td>
			</tr>


			<tr>
				<td />
				<td><input type="submit" value="Add" /></td>
			</tr>


		</table>


</form>


</body>
</html>