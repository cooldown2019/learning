<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--//指定页面格式--%>

<footer class="footer">
    <%--    //指定类名footer--%>
    <div class="container height">
        <%--        //class=“container” container 类用于固定宽度并支持响应式布局的容器--%>
        <div class="row">
            <%--            //行元素--%>
            <div class="text-left col-sm-4">
                <%--                //左对齐，小屏幕平板（>=768px）--%>
                <span>技能树 &mdash; 改变你我</span>
                <%--                //html span标签   内容：技能树——改变你我--%>
                <p class="bottom">关于我们 | 联系我们 | 合作企业</p>
                <%--                //底部  内容 关于我们 | 联系我们 |合作企业--%>
            </div>
            <div class="text-center col-sm-4">
                <%--                //居中对齐 小屏幕平板（>=768px）--%>
                <p>旗下网站</p>
                <%--                //一条内容：旗下网站--%>
                <span>草船云孵化器     最强IT特训营</span>
                <%--                //span 标签 ，内容：草船云孵化器    最强IT特训营--%>
                <span>葡萄藤轻游戏     桌游精灵</span>
                <%--                //span标签 ，内容：葡萄藤轻游戏       桌游精灵--%>
            </div>
            <div class="text-right col-sm-4">
                <%--                //右对齐 ，小屏幕平板（>=768px）--%>
                <p>微信公众号</p>
                <%--                //一条信息 ：微信公众号--%>
                <img src="${pageContext.request.contextPath}/static/image/2524.jpg">
                <%--                //图片 链接为根目录下的static目录的image目录的2524.jpg文件--%>
            </div>
        </div>
    </div>

    <div class="footer-bottom">
        <%--        //底部元素--%>
        Copyright&reg;2015技能树 &nbsp; www.jnshu.com &nbsp;&nbsp;All &nbspRights&nbsp;Reserved丨京ICP备13005880号
        <%--        //内容：Copyright®2015技能树 &nbsp; www.jnshu.com &nbsp;&nbsp;All &nbspRights&nbsp;Reserved丨京ICP备13005880号--%>
    </div>
</footer>