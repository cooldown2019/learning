<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--//引入依赖，jstl标签库--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"
         isELIgnored="false" %>
<%--//定义页面语言--%>
<div class="main1">
    <div id="myCarousel" class="carousel slide">

        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner">
            <div class="item active">
                <img src="${pageContext.request.contextPath}/static/image/547567.jpg" alt="First slide">
            </div>
            <div class="item">
                <img src="${pageContext.request.contextPath}/static/image/banner-3.jpg" alt="Second slide">
            </div>
            <div class="item">
                <img src="${pageContext.request.contextPath}/static/image/banner-4.jpg" alt="Third slide">
            </div>
        </div>
        <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</div>



<div class="main container">
    <!--第一部分开始 ，大图标-->
    <div class="main-a row">
        <%--        //重新定义一个类--%>
        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
            <%--            //重新定义一个类 定义大小--%>
            <div class="row text-center">
                <%--                //定义类 中心对齐--%>
                <ul class="list-unstyled">
                    <%--                    //无序列表--%>
                    <li class="col-xs-12 up-1">
                        <%--                        //选项 定义大小--%>
                        <img alt="" src="${pageContext.request.contextPath}/static/image/45354312.png">
                        <%--                        //这个选项是一个图片，链接地址根目录下的static下的image下的45354312.png文件--%>
                    </li>
                    <li class="up-2 col-xs-12">高效</li>
                    <%--                     //选项，定义一个大小， 内容文字：高效--%>
                    <li class="up-3 col-xs-12">将三到七年的成长时间,缩短到一年到两年</li>
                    <%--                    //第三个选项，定义大小 ，内容：将三到七年的成长时间,缩短到一年到两年--%>
                </ul>
            </div>
        </div>

        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
            <%--            //创建一个类，定义大小--%>
            <div class="row text-center">
                <%--                //定义一个类，居中对齐--%>
                <ul class="list-unstyled">
                    <%--                    //无序列表 --%>
                    <li class="col-xs-12 up-1">
                        <%--                        这是第一个选项，定义大小--%>
                        <img alt="" src="${pageContext.request.contextPath}/static/image/879789.png">
                        <%--                        内容是一张图片，链接地址为根目录下的static的image下的879789.png文件--%>
                    </li>
                    <li class="up-2 col-xs-12">规范</li>
                    <%--                     第二个选项，定义大小，内容为文字：规范--%>
                    <li class="up-3 col-xs-12">标准到实战教程,不会走弯路</li>
                    <%--                    第三个选项，定义大小，内容为文字：标准到实战教程,不会走弯路--%>
                </ul>
            </div>
        </div>

        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
            <%--            //重新创建一个类，定义大小--%>
            <div class="row text-center">
                <%--                //创建一个类 是一行居中对齐--%>
                <ul class="list-unstyled">
                    <%--                    //无序列表--%>
                    <li class="col-xs-12 up-1">
                        <%--                        这是第一个选项，定义大小--%>
                        <img alt="" src="${pageContext.request.contextPath}/static/image/786453654365.png">
                        <%--                        这是第二个选项，是图片，链接地址为根目录下的static的image下的786453654365.png文件--%>
                    </li>
                    <li class="up-2 col-xs-12">人脉</li>
                    <%--                     第二个选项，定义大小，内容为文字：人脉--%>
                    <li class="up-3 col-xs-12">同班好友,同院学长,技术大师,入学就混职脉圈,为以后铺平道路</li>
                    <%--                    第三个选项，定义大小，内容为文字：同班好友,同院学长,技术大师,入学就混职脉圈,为以后铺平道路--%>
                </ul>
            </div>
        </div>

        <div class="col-xs-12 col-sm-6 col-md-6 col-lg-3 text-center">
            <%--            //新建一个类，定义大小，居中对齐--%>
            <p>
                <img src="${pageContext.request.contextPath}/static/image/453254312.png">${count}<br>
                <%--                第一个内容是图片 链接地址为根目录下的static下的image目录下的423254312.png文件--%>
                <span class="up-3">累计在线学习人数</span>
                <%--                span元素 内容：累计在线学习人数--%>
            </p>
            <p>
                <img src="${pageContext.request.contextPath}/static/image/453254312.png">${number}<br>
                <%--                第二个内容还是图片，链接地址为根目录下的static的image下的423254312.png文件--%>
                <span class="up-3">学员已经找到满意工作</span>
                <%--                span元素 内容 ：学员已经找到满意工作--%>
            </p>
        </div>
    </div>

    <!--第二部分开始-->
    <div class="main-b row">
        <%--        创建一个类 行元素--%>
        <h3 class="text-center main-tab">如何学习</h3>
        <%--         创建类 居中对齐 内容：如何学习--%>
        <ul class="list-unstyled text-center">
            <%--            无序列表 居中对齐--%>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                <%--                第一个选项 一行 显示屏超过1200px显示4个，然后是2个，最少是一个--%>
                <span class="up-1 text-center">1</span>
                <%--                span元素 第一个元素，居中对齐,文字 :1--%>
                <p class="up-2">匹配你现在的个人情况寻找适合自己的岗位</p>
                <%--                    第二个元素 文字: 匹配你现在的个人情况寻找适合自己的岗位--%>
                <span class="up-3"></span>
                <%--                第三个元素   --%>
            </li>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                <%--                //第二个选项 一行 分辨率超过1200px显示4个 然后是2个 最小是一个--%>
                <span class="up-1 text-center">2</span>
                <%--                 span元素 第一个元素 居中对齐 文字:2--%>
                <p class="up-2">了解职业前景薪金待遇，竞争压力等</p>
                <%--                     第二个元素 文字:了解职业前景薪金待遇，竞争压力等--%>
                <span class="up-3"></span>
                <%--                第三个元素--%>
            </li>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                <%--                第三个选项 规定大小 超过1200px显示4个 然后是两个,最少是1个--%>
                <span class="up-1 text-center">3</span>
                <%--                第一个元素  居中对齐 文字:3--%>
                <p class="up-2">掌握行业内顶级技能</p>
                <%--               第二个元素  文字:掌握行业内顶级技能--%>
                <span class="up-3"></span>
                <%--                第三个元素 :--%>
            </li>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                <%--                第四个选项 定义大小 超过1200px显示 4个,然后是显示两个,最少时显示1个--%>
                <span class="up-1 text-center">4</span>
                <%--                第一个元素 居中对齐 文字：4--%>
                <p class="up-2">查看职业目标任务</p>
                <%--                    第二个元素 文字：查看职业目标任务--%>
                <span class="up-3"></span>
                <%--                第三个元素  --%>
            </li>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                <%--                四五个选项  定义大小 --%>
                <span class="up-1 text-center">5</span>
                <%--                 第一个元素 ，居中对齐 文字：5--%>
                <p class="up-2">参考学习资料，掌握技能点，逐个完成任务</p>
                <%--                   第二个元素， 文字：参考学习资料，掌握技能点，逐个完成任务--%>
                <span class="up-3"></span>
                <%--                  第三个元素--%>
            </li>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                <%--                第六个选项，定义大小--%>
                <span class="up-1 text-center">6</span>
                <%--                    第一个元素, 居中对齐 文字:6--%>
                <p class="up-2">加入班级，和小伙伴们互帮互动，一块学习</p>
                <%--                       第二个元素 文字:加入班级，和小伙伴们互帮互动，一块学习--%>
                <span class="up-3"></span>
                <%--                第三个元素--%>
            </li>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                <%--                第七个选项，定义大小--%>
                <span class="up-1 text-center">7</span>
                <%--                     第一个元素，居中对齐 文字：7--%>
                <p class="up-2">选择导师，一路引导，加速自己成长</p>
                <%--                     第二个元素 文字：选择导师，一路引导，加速自己成长--%>
                <span class="up-3"></span>
                <%--                      第三个元素--%>
            </li>
            <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                <%--                第八个选项 ，定义大小--%>
                <span class="up-1 text-center">8</span>
                <%--                  第一个元素，居中对齐 文字：8--%>
                <p class="up-2">完成职业 技能，升级业界大牛</p>
                <%--                   第二个元素 文字：完成职业 技能，升级业界大牛--%>
                <span class="up-3 invisible"></span>
                <%--                第三个元素--%>
            </li>
        </ul>
    </div>

    <!--第三部分开始-->
    <div class="main-c row">
        <%--        创建优秀学员展示--%>
        <h3 class="text-center main-tab">优秀学员展示</h3>
        <%--      居中对齐 文字：优秀学员展示--%>
        <c:forEach items="${studentList}" var="student" >
            <%--            创建一个表单 ，元素是 studentList 每一个对象是student--%>
            <ul class="list-unstyled text-center" style="margin: 0;">
                    <%--                无序列表  居中对齐--%>
                <li class="col-xs-12 col-sm-6 col-md-6 col-lg-3">
                        <%--                    第一个选项 ，定义大小 --%>
                    <div>
                        <img src="${pageContext.request.contextPath}${student.picture}" alt="这是图片">
                            <%--                        图片文件 地址为student.picture--%>
                        <span>${student.company}${student.job}:${student.name}</span>
                            <%--                        student.position(职业)对应student.name，一一对应--%>
                        <p class="text-left">${student.expreience}</p>
                            <%--                        文本靠左对齐，学生的经历--%>
                    </div>
                </li>
            </ul>
        </c:forEach>
    </div>


    <!--第四部分开始-->
    <div class="row main-bottom">
        <%--        战略合作企业栏目（盒子）--%>
        <h3 class="text-center">战略合作企业</h3>
        <%--            文本居中对齐   文本：战略合作企业--%>
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <%--            创建一个类 定义大小--%>
            <ul class="logo">
                <%--                无序列表--%>
                <li>
                    <a href=""><img src="${pageContext.request.contextPath}/static/image/123132.png"></a>
                    <%--                    第一个选项 是图片,链接地址根目录下的static的image下的123132.png文件--%>
                </li>
                <li>
                    <a href=""> <img src="${pageContext.request.contextPath}/static/image/1549865.png"></a>
                    <%--                    第二个选项  是图片  ,链接地址是根目录下的static目录下的image下的1549865.png文件--%>
                </li>
                <li>
                    <a href=""> <img src="${pageContext.request.contextPath}/static/image/785345.png"></a>
                    <%--                    第三个选项  是图片 链接是根目录下的 static目录下的image下的785345.png文件--%>
                </li>
                <li>
                    <a href=""> <img src="${pageContext.request.contextPath}/static/image/1471.png"></a>
                    <%--                    第四个选项是图片   链接是根目录下的static下的image下的1471.png文件--%>
                </li>
                <li>
                    <a href="">  <img src="${pageContext.request.contextPath}/static/image/7861.png"></a>
                    <%--                    第五个选项是 图片 链接时 根目录下的 static目录下的image目录下 的7861.png文件--%>
                </li>
            </ul>
        </div>
    </div>
</div>

<div class="main-e">
    <%--    友情链接部分--%>
    <h3 class="text-center main-tab ">友情链接</h3>
    <%--    居中对齐   文字:友情链接--%>
    <div class="container">
        <%--        创建一个类 container 类用于固定宽度并支持响应式布局的容器--%>
        <ul class="text-justify">
            <%--            无序列表--%>
            <li><a href="#">手机软件</a></li>
            <%--            第一个选项  文字:手机软件--%>
            <li><a href="#">教师招聘</a></li>
            <%--                第二个选项   文字:教师招聘--%>
            <li><a href="#">找工作</a></li>
            <%--                第三个选项   文字: 找工作--%>
            <li><a href="#">教师招聘</a></li>
            <%--                   第四个选项 文字:教师招聘--%>
            <li><a href="#">找工作</a></li>
            <%--                     第五个选项  文字 :找工作  --%>
            <li><a href="#">手机软件</a></li>
            <%--                       第六个选项   文字:手机软件--%>
            <li><a href="#">教师招聘</a></li>
            <%--                          第七个选项    文字 : 教师招聘--%>
            <li><a href="#">手机软件</a></li>
            <%--                           第八个选项    文字 :手机软件--%>
            <li><a href="#">手机软件</a></li>
            <%--                             第九个选项     文字:手机软件--%>
            <li><a href="#">找工作</a></li>
            <%--                             第十个选项     文字 找工作--%>
            <li><a href="#">手机软件</a></li>
            <%--                          第十一个选项   文字 手机软件--%>
            <li><a href="#">教师招聘</a></li>
            <%--                          第十二个选项   文字 教师招聘--%>
            <li><a href="#">找工作</a></li>
            <%--                            第十三个选项     文字  找工作--%>
            <li><a href="#">教师招聘</a></li>
            <%--                             第十四个选项   文字:教师招聘  --%>
            <li><a href="#">找工作</a></li>
            <%--                             第十五个选项   文字 :找工作--%>
            <li><a href="#">手机软件</a></li>
            <%--                                  第十六个选项  文字 :手机软件--%>
            <li><a href="#">教师招聘</a></li>
            <%--                                 第十七个选项       文字:教师招聘--%>
            <li><a href="#">手机软件</a></li>
            <%--                                  第十八个选项   文字:手机软件--%>
            <li><a href="#">手机软件</a></li>
            <%--                                 第十九个选项     文字: 手机软件--%>
            <li><a href="#">找工作</a></li>
            <%--                             第二十个选项   文字 :找工作--%>
        </ul>
    </div>
</div>