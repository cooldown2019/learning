<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="/tags" prefix="date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--//指定页面的格式--%>
<div class="container  hidden-xs">
    <%--    //html div标签，用来给页面加样式， class=“container” container 类用于固定宽度并支持响应式布局的容器--%>
    <%--    //hidden-xs 针对不同尺寸屏幕隐藏或显示内容。--%>
    <div class="row header-top">
        <%
            Date d = new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String now = df.format(d);
        %>
        <%--     //行元素， header-top头部固定定位--%>
        <p class="col-xs-12 col-sm-6 col-md-6 col-lg-6">客服电话:010-594-78634 时间：<%=now %>
        </p>


        <%--        //元素信息 col-xs- 超小屏幕，手机（<768px）col-sm- 小屏幕，平板(>=768px)--%>
        <%--        //col-md-中等屏幕，桌面显示器（>=992px）col-lg- 大屏幕（>=1200px） 这个样式的信息为客服电话:010-594-78634--%>
        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 text-right">
            <%--            //text-right  设置内部元素右对齐--%>
            <div>
                <a href="#" target="_blank"> <img alt=""
                                                  src="${pageContext.request.contextPath}/static/image/54537.png"></a>
                <a href="#" target="_blank"><img alt=""
                                                 src="${pageContext.request.contextPath}/static/image/45678678.png"></a>
                <a href="#" target="_blank"> <img alt=""
                                                  src="${pageContext.request.contextPath}/static/image/54375483543.png"></a>
                <%--            显示三个小图标--%>
            </div>
        </div>
    </div>
</div>
<div>
    <c:choose>
        <c:when test="${username == null || username == ''}">
            <li class="nav-item t-2a">
                <a href="/toLogin" class="t-2b" style="color:blue" href="#">登录</a>
                <a href="/toRegister" class="t-2b" style="color:blue" href="#"> |注册</a>
            </li>
        </c:when>
        <c:otherwise>
            <c:out value="欢迎! ${username}"/>
            <c:choose>
                <c:when test="${picture != null || picture != ''}">
                    <a target="_blank"> <img width=40rpx; height=40rpx; border-radius: 50%; src="${picture}"></a>
                </c:when>
            </c:choose>
            <li class="nav-item t-2a">
                <a href="/toPhoto" class="t-2b" style="color:blue" href="#">上传头像</a>
                <a href="/logout" class="t-2b" style="color:blue" href="#">注销</a>
            </li>
        </c:otherwise>
    </c:choose>
</div>