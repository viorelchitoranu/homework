<%--
  Created by IntelliJ IDEA.
  User: Viorel
  Date: 29.10.2025
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Devmind Spring MVC</title>
</head>
<body>
<div>
    <h1>Hello, primul meu proiect Spring MVC</h1>
    <h2><P>Timpul pe server este: ${serverTime}.</p></h2>

</div>
<%--	acesta este un action form care inregistreaza un user name--%>
<form action="user" method="post">
    <label>Nume</label>
        <input type="text" name="userName"><br>

    <label>Email</label>
        <input type="text" name="email"><br>


    <label>Telefon</label><br>
        <input type="text" name="telefon"><br>

    <label>Data nasterii</label>
        <input type="text" name="dateOfBirth"><br>

    <input type="submit" value="Login">
</form>
<a href="${pageContext.request.contextPath}/about">About Page</a>
</body>
</html>
