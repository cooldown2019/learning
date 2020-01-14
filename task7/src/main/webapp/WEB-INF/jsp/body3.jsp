<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h1>登录</h1>
<form action="/login" method="post">
    用户名<input type="text" name="username"></br>
    密 码<input type="password" name="password"></br>
    <input type="submit" name="登录"></br>
    <a class="a-style" href="/toRegister"> <input type="button"  style="color:blue" value="没有账号？立即注册"></a>
    </br></br></br></br></br></br>
</form>
</body>
</html>
