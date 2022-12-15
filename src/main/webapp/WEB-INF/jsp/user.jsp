<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome</h1>
<br/>
    <jsp:useBean id="user" class="by.it.avramchuk.bean.User" scope="request" />

	<jsp:getProperty property="firstName" name="user" />
	<jsp:getProperty property="lastName" name="user" />
	
	 <form action="index.jsp" method="get">
		<input type="submit" value="sign in" />
	</form>
</body>
</html>