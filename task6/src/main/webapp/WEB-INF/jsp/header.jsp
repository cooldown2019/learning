<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="com.task.utils.JwtUtil" %>
<%@ page import="java.util.Map" %>
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
        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-6 text-left" style="color: #204d74">
            <%! private boolean result = false;
                String value = null;
                private JwtUtil jwtUtil = new JwtUtil();
            %>
            <% String token = null;
                if (null != request.getCookies()) {
                    for (Cookie cookie : request.getCookies()) {
                        if (cookie.getName().equals("token")) {
                            token = cookie.getValue();
                            Map<String, Object> map = jwtUtil.parseToken(token);
                            value = (String) map.get("username");
                            result = true;
                        }
                    }
                } else {
                    result = false;
                }
            %>
            <c:choose>
                <c:when test="<%=result%>">
                    <a style="padding-left: 300px"></a><%=value%>,欢迎您! </i>
                    <a href="/logout">| 注销</a>
                </c:when>
                <c:otherwise>
                    <a href="/toLogin" style="padding-left: 300px">登录</a>
                    <a href="/toRegister">| 注册</a>
                </c:otherwise>
            </c:choose>
        </div>
    </div>