<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Personal Details</h1>
	<p>Check your details before payment</p>
	<b>First Name</b> : ${param.firstname}
	<br />
	<b>Last Name</b> : ${param.lastname}
	<br />
	<b>Age</b> : ${param.age}
	<br />
	<b>ID</b> : ${param.ID}
	<br />
	<b>Ph.Number</b> : ${param.phonenumber}
	<br />
	<b>Date</b> : ${param.dateoftravel}
	<br />
	<b>Source</b> : ${param.source}
	<br />
	<b>Destination</b> : ${param.destination}
	<br />
	<br /> Click
	<a href="BooKingPage.jsp">Confirm</a> if your details are correct.

</body>
</html>