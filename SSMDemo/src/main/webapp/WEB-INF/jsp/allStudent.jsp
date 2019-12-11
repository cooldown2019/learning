<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<html>
<head>
    <title>Paper列表</title>
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
                    <small>列表 —— 显示所有</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${path}/student/toAddStudent">新增</a>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>编号</th>
                    <th>姓名</th>
                    <th>QQ</th>
                    <th>修真类型</th>
                    <th>入学时间</th>
                    <th>毕业学校</th>
                    <th>线上学号</th>
                    <th>日报链接</th>
                    <th>宣言</th>
                    <th>师兄</th>
                    <th>来源</th>
                    <th>创建时间</th>
                    <th>更新时间</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="student" items="${requestScope.get('list')}" varStatus="status">
                    <tr>
                        <td>${student.id}</td>
                        <td>${student.name}</td>
                        <td>${student.qq}</td>
                        <td>${student.jnshutype}</td>
                        <td>${student.jointime}</td>
                        <td>${student.school}</td>
                        <td>${student.onlineid}</td>
                        <td>${student.dailyurl}</td>
                        <td>${student.slogan}</td>
                        <td>${student.counsellor}</td>
                        <td>${student.knownpath}</td>
                        <td>${student.createtime}</td>
                        <td>${student.updatetime}</td>
                        <td>
                            <a href="${path}/student/toUpdateStudent?id=${student.id}">更改</a> |
                            <a href="<%=appPath%>/student/del/${student.id}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>