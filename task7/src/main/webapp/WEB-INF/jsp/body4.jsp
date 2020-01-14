<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript">
    function checkPhone() {
        var phone = document.getElementById('phone').value;
        console.log("手机号码 = " + phone);
        var partten = /^1[3,5,6,7,8]\d{9}$/;
        if (partten.test(phone)) {
            return true;
        } else {
            alert('请使用手机号码');
        }
    }

    function sendPhone() {
        var phone = document.getElementById('phone').value;
        console.log("sendPhone: phone = " + phone);
        $.ajax({
            url: 'phone',
            type: 'post',
            data: {
                'phone': phone
            },
            dataType: 'text',
            success: function (data) {
                alert(data);
                console.log("sendCaptcha ==> success: data = " + (data));
            },
            error: function (data) {
                console.log("sendCaptcha ==> error: data = " + (data));
            }
        });
    }
</script>
<html>
<head>
    <title>注册</title>
</head>
<body>
<h1>手机注册</h1>
<ul>
    <li class="active">
        <a href="/toEmailRegister" style="color:blue" class="t-2b">选择邮箱注册</a>
    </li>
</ul>
<form action="/register" method="post">
    用户名<input type="text" name="username"></br>
    密 码<input type="password" name="password"></br>
    手机号:<input type="text" name="phone" onchange="checkPhone()" id="phone">
    <button type="button" onclick="sendPhone()">获取手机验证码</button>
    <br>
    短信验证码<input type="text" name="code"></br>
    <input type="submit" name="注册">
    </br>  <a class="a-style" href="/toLogin"> <input type="button" style="color:blue" value="已有账号？去登录"></a>
    </br></br></br></br></br>
</form>
</body>
</html>
