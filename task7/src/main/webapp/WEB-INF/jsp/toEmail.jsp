<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript">
    function checkEmail() {
        var email = document.getElementById('email').value;
        console.log("邮箱 = " + email);
        var partten = /^[A-Za-z\d]+([-_.][A-Za-z\d]+)*@([A-Za-z\d]+[-.])+[A-Za-z\d]{2,4}$/;
        if (partten.test(email)) {
            return true;
        } else {
            alert('邮箱格式不对');
        }
    }

    function sendEmail() {
        var email = document.getElementById('email').value;
        console.log("sendEmail: email = " + email);
        $.ajax({
            url: 'email',
            type: 'post',
            data: {
                'email': email
            },
            dataType: 'text',
            success: function (data) {
                alert(data);
            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                // 状态码
                console.log(XMLHttpRequest.status);
                // 状态
                console.log(XMLHttpRequest.readyState);
                // 错误信息
                console.log(textStatus);
                console.log(errorThrown);
            }
        });
    }
</script>
<html>
<head>
    <title>邮箱注册</title>
</head>
<body>
<h1>邮箱注册</h1>
<div>
    <ul>
        <li class="active">
            <a href="/toRegister" style="color:blue" class="t-2b">选择手机注册</a>
        </li>
    </ul>
    <form action="/emailRegister"  method="post">
        用户名:<input type="text" name="username"><br>
        邮 箱:<input type="text" name="email" onchange="checkEmail()" id="email">
        <button type="button" onclick="sendEmail()">获取邮箱验证码</button>
        <br>
        验证码:<input type="text" name="code" value="" placeholder="请输入邮箱验证码"><br>
        密 码:<input type="password" name="password"><br>
        <input type="submit" value="注册">
    </form>
    <br>
    <a class="a-style" href="/toLogin"> <input type="button"  style="color:blue"  value="已有账号？去登录"></a>
    </br></br></br></br></br></br>
</div>
</body>
</html>
