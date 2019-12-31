<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%--// 定义格式--%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%--// 引入依赖 tiles标签库tiles前缀--%>
<%@ taglib prefix="tittle" uri="http://tiles.apache.org/tags-tiles" %>
<%--//引入依赖  tittle前缀--%>
<!DOCTYPE html>
<html>
<head>
    <title><tiles:insertAttribute name="tittle"/></title>
    <%--    //标题 插入属性 name--%>
    <tiles:insertAttribute name="top" />
    <%--    //插入top.jsp--%>
</head>
<body>
<%--头部--%>
<tiles:insertAttribute name="header" />
<%--//插入 header.jsp  name创建一个definition bean的访问名称 insertAttribute将属性的值插入页面--%>
<%--菜单--%>
<tiles:insertAttribute name="menu"/>
<%--//插入menu.jsp--%>
<%--内容--%>
<tiles:insertAttribute name="body"/>
<%--//插入 body.jsp--%>
<%--尾部--%>
<tiles:insertAttribute name="footer"/>
<%--//插入footer.jsp--%>
</body>
</html>