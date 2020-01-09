<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--引入jstl标签库--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<%--定义页面格式--%>
<%@ taglib uri="/tags" prefix="date"%>
<%--引入自定义标签--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" >
<div class="container">
    <%--    创建一个类   container 类用于固定宽度并支持响应式布局的容器 一行--%>
    <div class="nav-title">首页&gt;职业</div>
    <%--    创建一个类 , 文字: 首页 > 职业--%>
    <div class="nav-bar">
        <%--        创建一个类 --%>
        <span class="">方向：</span>
        <%--         span标签  文字: 方向:--%>
        <a class="nav-bar-a a-selected" href="">全部</a>
        <%--         标签 文字:全部--%>
        <a class="nav-bar-a" href="">前端开发</a>
        <%--             标签  文字:  前端开发--%>
        <a class="nav-bar-a" href="">后端开发</a>
        <%--                 标签  文字:  后端开发--%>
        <a class="nav-bar-a" href="">移动开发</a>
        <%--             标签   文字 :  移动开发--%>
        <a class="nav-bar-a" href="">整站开发</a>
        <%--                标签    文字 :  整站开发--%>
        <a class="nav-bar-a" href="">运营维护</a>
        <%--                  标签   文字 : 运营维护--%>
    </div>




    <div class="caption">
        <%--        创建一个类,描述前端开发--%>
        <h4>前端开发方向</h4>
        <%--        文字说明--%>
    </div>

    <div class="row">
        <%--        创建一个类--%>
        <c:forEach items="${listId1}" var="profession">



            <%--            创建一个表格，数据来自profession，每一个对象都是profession--%>
            <div class="col-md-4 col-sm-6 col-xs-12 top-margin">
                    <%--                创建一个样式 ，设置大小--%>
                <div class="warp-border">
                        <%--                    创建一个类--%>
                    <div class="clearfix">
                            <%--                        创建一个类--%>
                        <div class="icon-people"><img src="${pageContext.request.contextPath}${profession.picture}"></div>
                            <%--                        创建一个类 内容是图片 图片链接地址为 profession.picture。--%>
                        <div class="text">
                                <%--                            创建一个类 --%>
                            <h4 class="">${profession.name}</h4>
                                <%--                             第一栏 职业名称 读取数据库中的profession.name--%>
                            <p class="text-present">${profession.introduction}</p>
                                <%--                            第二栏  职业介绍 ，读取数据库中的profession.introduce--%>
                        </div>
                    </div>

                    <div class="warp-class2">
                            <%--                        创建类--%>
                        <div class="warp-class2-text">
                                <%--                            创建类 --%>
                            <div class="iconfont text-padding">门槛
                                    <%--                                创建类  文字:门槛--%>
                                <c:forEach begin="1" end="${profession.sill}">
                                    <%--                                    创建  一个表单 从1开始 ,由profession.sill的数量结束.星星数量--%>
                                    <img src="${pageContext.request.contextPath}/static/image/xx.png">
                                    <%--                                    图像  链接为 根目录下的static的image下的xx.png--%>
                                </c:forEach>
                            </div>
                        </div>
                        <div class="warp-class2-text">
                                <%--                            创建一个类--%>
                            <div class="iconfont text-padding text-border-left">难易程度
                                    <%--                                创建一个类,形容 难易程度--%>
                                <c:forEach begin="1" end="${profession.grade}">
                                    <%--                                    创建一个表单 从 1开始由profession.grade结束 星星的个数--%>
                                    <img src="${pageContext.request.contextPath}/static/image/xx.png">
                                    <%--                                     图像 链接地址为根目录下的 static下的image下的xx.png文件--%>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                    <div class="warp-class2">
                            <%--                        创建一个类--%>
                        <div class="warp-class2-text">
                                <%--                            创建一个类--%>
                            <div class="iconfont text-padding">成长周期 <span class="iconfont-color">${profession.growth}</span>年</div>
                                <%--                            创建一个类来形容成长周期  成长周期 多少年--%>
                        </div>
                        <div class="warp-class2-text">
                                <%--                            创建一个类--%>
                            <div class="iconfont text-padding text-border-left">稀缺程度 <span class="iconfont-color">${profession.scarcity}</span>家公司需要</div>
                                <%--                            创建一个类,来形容稀缺程度，--%>
                        </div>
                    </div>

                    <div class="warp-class2">
                            <%--                        创建类--%>
                        <div class="leftWarp">
                            薪资待遇
                                <%--                            创建类 文字：薪资待遇--%>
                        </div>
                        <div class="rightWarp">
                                <%--                            创建一个类--%>
                            <div class="rightWarp-class">
                                    <%--                                创建一个类--%>
                                <div class="rightWarp-year">0-1年</div>
                                    <%--                                    第一种 0-1年--%>
                                <div class="rightWarp-wages">${profession.salaryOne}/月</div>
                                    <%--                                     第二个类来接受第一种薪资--%>
                            </div>
                            <div class="rightWarp-class">
                                    <%--                                创建一个类--%>
                                <div class="rightWarp-year">1-2年</div>
                                    <%--                                    创建一个类，1-2年--%>
                                <div class="rightWarp-wages">${profession.salaryTwo}/月</div>
                                    <%--                                创建一个类 ，接受1-2年情况下的月薪--%>
                            </div>
                            <div class="rightWarp-class border-bottom">
                                    <%--                                创建一个类--%>
                                <div class="rightWarp-year">2-3年</div>
                                    <%--                                     创建一个类，2-3年的情况下--%>
                                <div class="rightWarp-wages">${profession.salaryThree}/月</div>
                                    <%--                                创建一个类，来接受2-3年的情况下的月薪--%>
                            </div>
                        </div>
                    </div>

                    <div class="warp-class2">
                            <%--                        创建一个类--%>
                        <b class="text-b">有${profession.number}人正在学
                                <%--                            创建一个类来接受 有多少人正在学--%>
                            创建时间: <date:date value="${profession.createTime}"/>
                                <%--                            创建一个一个类  来接受创建的时间 ，从数据库中获取的。--%>
                        </b>

                    </div>
                    <div class="warp-class2">
                            <%--                        创建同一个类--%>
                        <p class="text-p">提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</p>
                            <%--                        元素 文字：提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础--%>
                    </div>

                    <div class="flip-container">
                            <%--                        创建类--%>
                        <p class="flip-title">${profession.name}</p>
                            <%--                            创建一个类 接受职业--%>
                        <p class="flip-text">${profession.introduction}</p>
                            <%--                        创建一个类，来接受职业的介绍--%>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>


    <div class="caption">
        <%--        创建一个类,描述前端开发--%>
        <h4>后端开发方向</h4>
        <%--        文字说明--%>
    </div>

<div class="row">
    <%--        创建一个类--%>
    <c:forEach items="${listId2}" var="profession">



        <%--            创建一个表格，数据来自profession，每一个对象都是profession--%>
        <div class="col-md-4 col-sm-6 col-xs-12 top-margin">
                <%--                创建一个样式 ，设置大小--%>
            <div class="warp-border">
                    <%--                    创建一个类--%>
                <div class="clearfix">
                        <%--                        创建一个类--%>
                    <div class="icon-people"><img src="${pageContext.request.contextPath}${profession.picture}"></div>
                        <%--                        创建一个类 内容是图片 图片链接地址为 profession.picture。--%>
                    <div class="text">
                            <%--                            创建一个类 --%>
                        <h4 class="">${profession.name}</h4>
                            <%--                             第一栏 职业名称 读取数据库中的profession.name--%>
                        <p class="text-present">${profession.introduction}</p>
                            <%--                            第二栏  职业介绍 ，读取数据库中的profession.introduce--%>
                    </div>
                </div>

                <div class="warp-class2">
                        <%--                        创建类--%>
                    <div class="warp-class2-text">
                            <%--                            创建类 --%>
                        <div class="iconfont text-padding">门槛
                                <%--                                创建类  文字:门槛--%>
                            <c:forEach begin="1" end="${profession.sill}">
                                <%--                                    创建  一个表单 从1开始 ,由profession.sill的数量结束.星星数量--%>
                                <img src="${pageContext.request.contextPath}/static/image/xx.png">
                                <%--                                    图像  链接为 根目录下的static的image下的xx.png--%>
                            </c:forEach>
                        </div>
                    </div>
                    <div class="warp-class2-text">
                            <%--                            创建一个类--%>
                        <div class="iconfont text-padding text-border-left">难易程度
                                <%--                                创建一个类,形容 难易程度--%>
                            <c:forEach begin="1" end="${profession.grade}">
                                <%--                                    创建一个表单 从 1开始由profession.grade结束 星星的个数--%>
                                <img src="${pageContext.request.contextPath}/static/image/xx.png">
                                <%--                                     图像 链接地址为根目录下的 static下的image下的xx.png文件--%>
                            </c:forEach>
                        </div>
                    </div>
                </div>
                <div class="warp-class2">
                        <%--                        创建一个类--%>
                    <div class="warp-class2-text">
                            <%--                            创建一个类--%>
                        <div class="iconfont text-padding">成长周期 <span class="iconfont-color">${profession.growth}</span>年</div>
                            <%--                            创建一个类来形容成长周期  成长周期 多少年--%>
                    </div>
                    <div class="warp-class2-text">
                            <%--                            创建一个类--%>
                        <div class="iconfont text-padding text-border-left">稀缺程度 <span class="iconfont-color">${profession.scarcity}</span>家公司需要</div>
                            <%--                            创建一个类,来形容稀缺程度，--%>
                    </div>
                </div>

                <div class="warp-class2">
                        <%--                        创建类--%>
                    <div class="leftWarp">
                        薪资待遇
                            <%--                            创建类 文字：薪资待遇--%>
                    </div>
                    <div class="rightWarp">
                            <%--                            创建一个类--%>
                        <div class="rightWarp-class">
                                <%--                                创建一个类--%>
                            <div class="rightWarp-year">0-1年</div>
                                <%--                                    第一种 0-1年--%>
                            <div class="rightWarp-wages">${profession.salaryOne}/月</div>
                                <%--                                     第二个类来接受第一种薪资--%>
                        </div>
                        <div class="rightWarp-class">
                                <%--                                创建一个类--%>
                            <div class="rightWarp-year">1-2年</div>
                                <%--                                    创建一个类，1-2年--%>
                            <div class="rightWarp-wages">${profession.salaryTwo}/月</div>
                                <%--                                创建一个类 ，接受1-2年情况下的月薪--%>
                        </div>
                        <div class="rightWarp-class border-bottom">
                                <%--                                创建一个类--%>
                            <div class="rightWarp-year">2-3年</div>
                                <%--                                     创建一个类，2-3年的情况下--%>
                            <div class="rightWarp-wages">${profession.salaryThree}/月</div>
                                <%--                                创建一个类，来接受2-3年的情况下的月薪--%>
                        </div>
                    </div>
                </div>

                <div class="warp-class2">
                        <%--                        创建一个类--%>
                    <b class="text-b">有${profession.number}人正在学
                            <%--                            创建一个类来接受 有多少人正在学--%>
                        创建时间: <date:date value="${profession.createTime}"/>
                            <%--                            创建一个一个类  来接受创建的时间 ，从数据库中获取的。--%>
                    </b>

                </div>
                <div class="warp-class2">
                        <%--                        创建同一个类--%>
                    <p class="text-p">提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</p>
                        <%--                        元素 文字：提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础--%>
                </div>

                <div class="flip-container">
                        <%--                        创建类--%>
                    <p class="flip-title">${profession.name}</p>
                        <%--                            创建一个类 接受职业--%>
                    <p class="flip-text">${profession.introduction}</p>
                        <%--                        创建一个类，来接受职业的介绍--%>
                </div>
            </div>
        </div>
    </c:forEach>
</div>


    <div class="caption">
        <%--        创建一个类,描述前端开发--%>
        <h4>移动开发方向</h4>
        <%--        文字说明--%>
    </div>

<div class="row">
    <%--        创建一个类--%>
    <c:forEach items="${listId3}" var="profession">



        <%--            创建一个表格，数据来自profession，每一个对象都是profession--%>
        <div class="col-md-4 col-sm-6 col-xs-12 top-margin">
                <%--                创建一个样式 ，设置大小--%>
            <div class="warp-border">
                    <%--                    创建一个类--%>
                <div class="clearfix">
                        <%--                        创建一个类--%>
                    <div class="icon-people"><img src="${pageContext.request.contextPath}${profession.picture}"></div>
                        <%--                        创建一个类 内容是图片 图片链接地址为 profession.picture。--%>
                    <div class="text">
                            <%--                            创建一个类 --%>
                        <h4 class="">${profession.name}</h4>
                            <%--                             第一栏 职业名称 读取数据库中的profession.name--%>
                        <p class="text-present">${profession.introduction}</p>
                            <%--                            第二栏  职业介绍 ，读取数据库中的profession.introduce--%>
                    </div>
                </div>

                <div class="warp-class2">
                        <%--                        创建类--%>
                    <div class="warp-class2-text">
                            <%--                            创建类 --%>
                        <div class="iconfont text-padding">门槛
                                <%--                                创建类  文字:门槛--%>
                            <c:forEach begin="1" end="${profession.sill}">
                                <%--                                    创建  一个表单 从1开始 ,由profession.sill的数量结束.星星数量--%>
                                <img src="${pageContext.request.contextPath}/static/image/xx.png">
                                <%--                                    图像  链接为 根目录下的static的image下的xx.png--%>
                            </c:forEach>
                        </div>
                    </div>
                    <div class="warp-class2-text">
                            <%--                            创建一个类--%>
                        <div class="iconfont text-padding text-border-left">难易程度
                                <%--                                创建一个类,形容 难易程度--%>
                            <c:forEach begin="1" end="${profession.grade}">
                                <%--                                    创建一个表单 从 1开始由profession.grade结束 星星的个数--%>
                                <img src="${pageContext.request.contextPath}/static/image/xx.png">
                                <%--                                     图像 链接地址为根目录下的 static下的image下的xx.png文件--%>
                            </c:forEach>
                        </div>
                    </div>
                </div>
                <div class="warp-class2">
                        <%--                        创建一个类--%>
                    <div class="warp-class2-text">
                            <%--                            创建一个类--%>
                        <div class="iconfont text-padding">成长周期 <span class="iconfont-color">${profession.growth}</span>年</div>
                            <%--                            创建一个类来形容成长周期  成长周期 多少年--%>
                    </div>
                    <div class="warp-class2-text">
                            <%--                            创建一个类--%>
                        <div class="iconfont text-padding text-border-left">稀缺程度 <span class="iconfont-color">${profession.scarcity}</span>家公司需要</div>
                            <%--                            创建一个类,来形容稀缺程度，--%>
                    </div>
                </div>

                <div class="warp-class2">
                        <%--                        创建类--%>
                    <div class="leftWarp">
                        薪资待遇
                            <%--                            创建类 文字：薪资待遇--%>
                    </div>
                    <div class="rightWarp">
                            <%--                            创建一个类--%>
                        <div class="rightWarp-class">
                                <%--                                创建一个类--%>
                            <div class="rightWarp-year">0-1年</div>
                                <%--                                    第一种 0-1年--%>
                            <div class="rightWarp-wages">${profession.salaryOne}/月</div>
                                <%--                                     第二个类来接受第一种薪资--%>
                        </div>
                        <div class="rightWarp-class">
                                <%--                                创建一个类--%>
                            <div class="rightWarp-year">1-2年</div>
                                <%--                                    创建一个类，1-2年--%>
                            <div class="rightWarp-wages">${profession.salaryTwo}/月</div>
                                <%--                                创建一个类 ，接受1-2年情况下的月薪--%>
                        </div>
                        <div class="rightWarp-class border-bottom">
                                <%--                                创建一个类--%>
                            <div class="rightWarp-year">2-3年</div>
                                <%--                                     创建一个类，2-3年的情况下--%>
                            <div class="rightWarp-wages">${profession.salaryThree}/月</div>
                                <%--                                创建一个类，来接受2-3年的情况下的月薪--%>
                        </div>
                    </div>
                </div>

                <div class="warp-class2">
                        <%--                        创建一个类--%>
                    <b class="text-b">有${profession.number}人正在学
                            <%--                            创建一个类来接受 有多少人正在学--%>
                        创建时间: <date:date value="${profession.createTime}"/>
                            <%--                            创建一个一个类  来接受创建的时间 ，从数据库中获取的。--%>
                    </b>

                </div>
                <div class="warp-class2">
                        <%--                        创建同一个类--%>
                    <p class="text-p">提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</p>
                        <%--                        元素 文字：提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础--%>
                </div>

                <div class="flip-container">
                        <%--                        创建类--%>
                    <p class="flip-title">${profession.name}</p>
                        <%--                            创建一个类 接受职业--%>
                    <p class="flip-text">${profession.introduction}</p>
                        <%--                        创建一个类，来接受职业的介绍--%>
                </div>
            </div>
        </div>
    </c:forEach>
</div>


    <div class="caption">
        <%--        创建一个类,描述前端开发--%>
        <h4>整站开发方向</h4>
        <%--        文字说明--%>
    </div>

<div class="row">
    <%--        创建一个类--%>
    <c:forEach items="${listId4}" var="profession">



        <%--            创建一个表格，数据来自profession，每一个对象都是profession--%>
        <div class="col-md-4 col-sm-6 col-xs-12 top-margin">
                <%--                创建一个样式 ，设置大小--%>
            <div class="warp-border">
                    <%--                    创建一个类--%>
                <div class="clearfix">
                        <%--                        创建一个类--%>
                    <div class="icon-people"><img src="${pageContext.request.contextPath}${profession.picture}"></div>
                        <%--                        创建一个类 内容是图片 图片链接地址为 profession.picture。--%>
                    <div class="text">
                            <%--                            创建一个类 --%>
                        <h4 class="">${profession.name}</h4>
                            <%--                             第一栏 职业名称 读取数据库中的profession.name--%>
                        <p class="text-present">${profession.introduction}</p>
                            <%--                            第二栏  职业介绍 ，读取数据库中的profession.introduce--%>
                    </div>
                </div>

                <div class="warp-class2">
                        <%--                        创建类--%>
                    <div class="warp-class2-text">
                            <%--                            创建类 --%>
                        <div class="iconfont text-padding">门槛
                                <%--                                创建类  文字:门槛--%>
                            <c:forEach begin="1" end="${profession.sill}">
                                <%--                                    创建  一个表单 从1开始 ,由profession.sill的数量结束.星星数量--%>
                                <img src="${pageContext.request.contextPath}/static/image/xx.png">
                                <%--                                    图像  链接为 根目录下的static的image下的xx.png--%>
                            </c:forEach>
                        </div>
                    </div>
                    <div class="warp-class2-text">
                            <%--                            创建一个类--%>
                        <div class="iconfont text-padding text-border-left">难易程度
                                <%--                                创建一个类,形容 难易程度--%>
                            <c:forEach begin="1" end="${profession.grade}">
                                <%--                                    创建一个表单 从 1开始由profession.grade结束 星星的个数--%>
                                <img src="${pageContext.request.contextPath}/static/image/xx.png">
                                <%--                                     图像 链接地址为根目录下的 static下的image下的xx.png文件--%>
                            </c:forEach>
                        </div>
                    </div>
                </div>
                <div class="warp-class2">
                        <%--                        创建一个类--%>
                    <div class="warp-class2-text">
                            <%--                            创建一个类--%>
                        <div class="iconfont text-padding">成长周期 <span class="iconfont-color">${profession.growth}</span>年</div>
                            <%--                            创建一个类来形容成长周期  成长周期 多少年--%>
                    </div>
                    <div class="warp-class2-text">
                            <%--                            创建一个类--%>
                        <div class="iconfont text-padding text-border-left">稀缺程度 <span class="iconfont-color">${profession.scarcity}</span>家公司需要</div>
                            <%--                            创建一个类,来形容稀缺程度，--%>
                    </div>
                </div>

                <div class="warp-class2">
                        <%--                        创建类--%>
                    <div class="leftWarp">
                        薪资待遇
                            <%--                            创建类 文字：薪资待遇--%>
                    </div>
                    <div class="rightWarp">
                            <%--                            创建一个类--%>
                        <div class="rightWarp-class">
                                <%--                                创建一个类--%>
                            <div class="rightWarp-year">0-1年</div>
                                <%--                                    第一种 0-1年--%>
                            <div class="rightWarp-wages">${profession.salaryOne}/月</div>
                                <%--                                     第二个类来接受第一种薪资--%>
                        </div>
                        <div class="rightWarp-class">
                                <%--                                创建一个类--%>
                            <div class="rightWarp-year">1-2年</div>
                                <%--                                    创建一个类，1-2年--%>
                            <div class="rightWarp-wages">${profession.salaryTwo}/月</div>
                                <%--                                创建一个类 ，接受1-2年情况下的月薪--%>
                        </div>
                        <div class="rightWarp-class border-bottom">
                                <%--                                创建一个类--%>
                            <div class="rightWarp-year">2-3年</div>
                                <%--                                     创建一个类，2-3年的情况下--%>
                            <div class="rightWarp-wages">${profession.salaryThree}/月</div>
                                <%--                                创建一个类，来接受2-3年的情况下的月薪--%>
                        </div>
                    </div>
                </div>

                <div class="warp-class2">
                        <%--                        创建一个类--%>
                    <b class="text-b">有${profession.number}人正在学
                            <%--                            创建一个类来接受 有多少人正在学--%>
                        创建时间: <date:date value="${profession.createTime}"/>
                            <%--                            创建一个一个类  来接受创建的时间 ，从数据库中获取的。--%>
                    </b>

                </div>
                <div class="warp-class2">
                        <%--                        创建同一个类--%>
                    <p class="text-p">提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</p>
                        <%--                        元素 文字：提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础--%>
                </div>

                <div class="flip-container">
                        <%--                        创建类--%>
                    <p class="flip-title">${profession.name}</p>
                        <%--                            创建一个类 接受职业--%>
                    <p class="flip-text">${profession.introduction}</p>
                        <%--                        创建一个类，来接受职业的介绍--%>
                </div>
            </div>
        </div>
    </c:forEach>
</div>


    <div class="caption">
        <%--        创建一个类,描述前端开发--%>
        <h4>运营维护</h4>
        <%--        文字说明--%>
    </div>

<div class="row">
    <%--        创建一个类--%>
    <c:forEach items="${listId4}" var="profession">



        <%--            创建一个表格，数据来自profession，每一个对象都是profession--%>
        <div class="col-md-4 col-sm-6 col-xs-12 top-margin">
                <%--                创建一个样式 ，设置大小--%>
            <div class="warp-border">
                    <%--                    创建一个类--%>
                <div class="clearfix">
                        <%--                        创建一个类--%>
                    <div class="icon-people"><img src="${pageContext.request.contextPath}${profession.picture}"></div>
                        <%--                        创建一个类 内容是图片 图片链接地址为 profession.picture。--%>
                    <div class="text">
                            <%--                            创建一个类 --%>
                        <h4 class="">${profession.name}</h4>
                            <%--                             第一栏 职业名称 读取数据库中的profession.name--%>
                        <p class="text-present">${profession.introduction}</p>
                            <%--                            第二栏  职业介绍 ，读取数据库中的profession.introduce--%>
                    </div>
                </div>

                <div class="warp-class2">
                        <%--                        创建类--%>
                    <div class="warp-class2-text">
                            <%--                            创建类 --%>
                        <div class="iconfont text-padding">门槛
                                <%--                                创建类  文字:门槛--%>
                            <c:forEach begin="1" end="${profession.sill}">
                                <%--                                    创建  一个表单 从1开始 ,由profession.sill的数量结束.星星数量--%>
                                <img src="${pageContext.request.contextPath}/static/image/xx.png">
                                <%--                                    图像  链接为 根目录下的static的image下的xx.png--%>
                            </c:forEach>
                        </div>
                    </div>
                    <div class="warp-class2-text">
                            <%--                            创建一个类--%>
                        <div class="iconfont text-padding text-border-left">难易程度
                                <%--                                创建一个类,形容 难易程度--%>
                            <c:forEach begin="1" end="${profession.grade}">
                                <%--                                    创建一个表单 从 1开始由profession.grade结束 星星的个数--%>
                                <img src="${pageContext.request.contextPath}/static/image/xx.png">
                                <%--                                     图像 链接地址为根目录下的 static下的image下的xx.png文件--%>
                            </c:forEach>
                        </div>
                    </div>
                </div>
                <div class="warp-class2">
                        <%--                        创建一个类--%>
                    <div class="warp-class2-text">
                            <%--                            创建一个类--%>
                        <div class="iconfont text-padding">成长周期 <span class="iconfont-color">${profession.growth}</span>年</div>
                            <%--                            创建一个类来形容成长周期  成长周期 多少年--%>
                    </div>
                    <div class="warp-class2-text">
                            <%--                            创建一个类--%>
                        <div class="iconfont text-padding text-border-left">稀缺程度 <span class="iconfont-color">${profession.scarcity}</span>家公司需要</div>
                            <%--                            创建一个类,来形容稀缺程度，--%>
                    </div>
                </div>

                <div class="warp-class2">
                        <%--                        创建类--%>
                    <div class="leftWarp">
                        薪资待遇
                            <%--                            创建类 文字：薪资待遇--%>
                    </div>
                    <div class="rightWarp">
                            <%--                            创建一个类--%>
                        <div class="rightWarp-class">
                                <%--                                创建一个类--%>
                            <div class="rightWarp-year">0-1年</div>
                                <%--                                    第一种 0-1年--%>
                            <div class="rightWarp-wages">${profession.salaryOne}/月</div>
                                <%--                                     第二个类来接受第一种薪资--%>
                        </div>
                        <div class="rightWarp-class">
                                <%--                                创建一个类--%>
                            <div class="rightWarp-year">1-2年</div>
                                <%--                                    创建一个类，1-2年--%>
                            <div class="rightWarp-wages">${profession.salaryTwo}/月</div>
                                <%--                                创建一个类 ，接受1-2年情况下的月薪--%>
                        </div>
                        <div class="rightWarp-class border-bottom">
                                <%--                                创建一个类--%>
                            <div class="rightWarp-year">2-3年</div>
                                <%--                                     创建一个类，2-3年的情况下--%>
                            <div class="rightWarp-wages">${profession.salaryThree}/月</div>
                                <%--                                创建一个类，来接受2-3年的情况下的月薪--%>
                        </div>
                    </div>
                </div>

                <div class="warp-class2">
                        <%--                        创建一个类--%>
                    <b class="text-b">有${profession.number}人正在学
                            <%--                            创建一个类来接受 有多少人正在学--%>
                        创建时间: <date:date value="${profession.createTime}"/>
                            <%--                            创建一个一个类  来接受创建的时间 ，从数据库中获取的。--%>
                    </b>

                </div>
                <div class="warp-class2">
                        <%--                        创建同一个类--%>
                    <p class="text-p">提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</p>
                        <%--                        元素 文字：提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础--%>
                </div>

                <div class="flip-container">
                        <%--                        创建类--%>
                    <p class="flip-title">${profession.name}</p>
                        <%--                            创建一个类 接受职业--%>
                    <p class="flip-text">${profession.introduction}</p>
                        <%--                        创建一个类，来接受职业的介绍--%>
                </div>
            </div>
        </div>
    </c:forEach>
</div>
</div>