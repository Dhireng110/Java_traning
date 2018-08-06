<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
<form action="submit" method="get">
<h1>Register</h1>
Enter name:
<input type="text" name="name" id="name" required><br>
Enter Email id:
<input type="text" id="email" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$  " required><br>
Enter Password:
<input type="password" id="password" name="password" pattern=".{8,20}""><br>
Enter Age:
<input type="text" id="age" name="age" pattern="[0-9]""><br>
Enter gender:
 <input type="radio" name="gender" value="male" checked> Male<br>
 <input type="radio" name="gender" value="female"> Female<br> 
 enter city
  <input type="text" name="city" value="city"><br>
  enter favorite movie
   <input type="password" name="movie" value=""> 
   enter photo
<input type="file" id="photo" name="photo" accept="image/png, image/jpeg" />
<br>
<input type="button" id="submit" name="submit" value="submit">
   
   
   
  
  
 
</body>
</html>