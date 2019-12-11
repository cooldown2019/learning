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
    <title>修改论文</title>
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
                    <small>修改</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="" name="userForm">
        <input type="hidden" name="id" value="${student.id}"/>
        编号：<input type="text" name="id" value="${student.id}"/>
        </br>
        姓名：<input type="text" name="name" value="${student.name}"/>
        </br>
        QQ：<input type="text" name="qq" value="${student.qq}"/>
        </br>
        修真类型：<input type="text" name="jnshutype" value="${student.jnshutype}"/>
        </br>
        入学时间：<input type="text" name="jointime" value="${student.jointime}"/>
        </br>
        线上学号：<input type="text" name="onlineid" value="${student.onlineid}"/>
        </br>
        日报链接：<input type="text" name="dailyurl" value="${student.dailyurl}"/>
        </br>
        宣言：<input type="text" name="slogan" value="${student.slogan}"/>
        </br>
        师兄：<input type="text" name="counsellor" value="${student.counsellor}"/>
        </br>
        来源：<input type="text" name="knownpath" value="${student.knownpath}"/>
        <input type="button" value="提交" onclick="updateStudent()"/>
    </form>
    <script type="text/javascript">
        function updateStudent() {
            var form = document.forms[0];
            form.action = "<%=basePath %>student/updateStudent";
            form.method = "post";
            form.submit();
        }
    </script>
</div>
</body>
</html>