<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="booktickets" method="post">
		<table>
			<tr>
				<td>Date Of Travel</td>
				<td><input name="dateoftravel" />
			</tr>

			<tr>
				<td>Source</td>
				<td><input name="source" />
			</tr>
			<tr>
				<td>Destination</td>
				<td><input name="destination" />
			</tr>
			<tr>
				<td>Number of persons</td>
				<td><input name="noofpersons" />
			</tr>
			<tr>
				<td>Choose flight</td>
				<td><select name="flight" >
						<option value="IndiGo">IndiGo</option>
						<option value="Air India">Air India</option>
						<option value="SpiceJet">SpiceJet</option>
						<option value="Go First">Go First</option>
						<option value="AirAsia India">AirAsia India</option>
						<option value="Vistara">Vistara</option>
						<option value="Alliance Air">Alliance Air</option>
						<option value="TruJet">TruJet</option>
				</select></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Book" /></td>
			</tr>

		</table>
	</form>
	
	
	



</body>
</html>