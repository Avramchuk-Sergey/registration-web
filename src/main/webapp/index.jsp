<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here </title>
</head>
<body>
 <form action="Controller" method="get">
       <input type="hidden" name="command" value="forward"/>
       Enter login:<br/>     
       <input type="text" name="login" value=""/><br/>
       Enter password:<br/>
       <input type="password" name="password" value=""/><br/>
       <input type="submit" value="sign in"><br/>
       
  </form>

    <form action="registration" method="post">
		<input type="submit" value="registration" />
	</form>
 
</body>
</html>