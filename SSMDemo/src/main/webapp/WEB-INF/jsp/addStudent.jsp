<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <title>新增</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                   报名系统
                </h1>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="" name="userForm">
        名称：<input type="text" name="name"> <span>${namemsg}</span><br><br><br>
        编号：<input type="text" name="id"> <span>${idmsg}</span><br><br><br>
        QQ：<input type="text" name="qq"><br><br><br>
        修真类型：<input type="text" name="jnshutype"><br><br><br>
        入学时间：<input type="text" name="jointime"><br><br><br>
        毕业学校：<input type="text" name="school"><br><br><br>
        线上学号：<input type="text" name="onlineid"><br><br><br>
        日报链接：<input type="text" name="dailyurl"><br><br><br>
        宣言：<input type="text" name="slogan"><br><br><br>
        师兄：<input type="text" name="counsellor"><br><br><br>
        来源：<input type="text" name="knownpath"><br><br><br>
        <input type="button" value="添加" onclick="addStudent()">
    </form>

    <script type="text/javascript">
        function addStudent() {
            var form = document.forms[0];
            form.action = "<%=basePath %>student/addStudent";
            form.method = "post";
            form.submit();
        }
    </script>
</div>
</body>
</html>