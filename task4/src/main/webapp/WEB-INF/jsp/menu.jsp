<%@ page language="java" pageEncoding="UTF-8"%>
<%--//页面格式--%>
<nav class="navbar navbar-default">
    <%--    //html nav标签定义导航链接的部分（ie8及之前不支持nav）--%>
    <div class="container">
        <%--        //container 类用于固定宽度并支持响应式布局的容器--%>
        <div class="navbar-header">
            <%--            //定义类 导航条头部--%>
            <a href="#" class="navbar-brand">
                <%--                // 导航条 指向#--%>
                <img src="${pageContext.request.contextPath}/static/image/logo.png" alt="Brand" class="img-responsive">
                <%--                //内容图片  链接地址根目录下的static目录下的image目录下的logo.png文件，alt 属性是一个必需的属性，它规定在图像无法显示时的替代文本。--%>
            </a>
            <button data-target="#open-nav" data-toggle="collapse" class="navbar-toggle btn-primary collapsed" aria-expanded="false">
                <%--                //html button标签 当缩小浏览器屏幕的时候，导航条会隐藏，右边会出来三条横杠，你点击这个导航条就会向下显示出来，默认为白色横杠！--%>
                <span class="icon-bar"></span>
                <%--                //span标签 图标栏--%>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
        </div>
        <div id="open-nav" class="navbar-collapse collapse" aria-expanded="false" style="height: 1px;">
            <ul class="nav navbar-nav navbar-right text-center list-inline">
                <%--                //html ul标签 无序列表 所有元素都在一行--%>
                <li><a href="${pageContext.request.contextPath}/home">首页</a></li>
                <%--                //<li>标签定义列表项目  链接指向根目录下的home文件   文字为首页--%>
                <li><a href="${pageContext.request.contextPath}/u/profession">职业</a></li>
                <%--                //<li> 标签定义列表项目 链接指向根目录下的profession文件 文字为职业--%>
                <li><a href="">推荐</a></li>
                <%--                //<li> 标签定义列表项目   文字为 推荐--%>
                <li><a href="">关于</a></li>
                <%--                //<li> 标签定义列表项目   文字为  关于--%>
            </ul>
        </div>
    </div>
</nav>
