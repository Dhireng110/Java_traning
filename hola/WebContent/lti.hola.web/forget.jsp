<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form method="get">
<h1>ForgetPage</h1>
Enter Email id:
<input type="email" id="email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$  " required>
<br><br>
Enter Favourite Movie Name:
<input type="password" id="movie" name="movie" pattern=".{8,20}"><br><br>
<input type="submit" value="Submit"><br>



</form>



</body>
</html>