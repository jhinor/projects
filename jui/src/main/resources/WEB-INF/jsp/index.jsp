<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>System Index</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="${path}/webjars/layui/1.0.7/css/layui.css" media="all"/>
    <link rel="stylesheet" href="${path}/webjars/jui/css/index.css" media="all"/>
</head>
<body>
<div>
    <ul class="layui-nav">
        <li class="layui-nav-item"><em>Management System</em></li>
    </ul>
</div>
    <div class="layui-side-scroll layui-bg-black">

        <ul class="layui-nav layui-nav-tree site-demo-nav">

            <li class="layui-nav-item layui-nav-itemed">
                <a class="javascript:;" href="javascript:;">开发工具</a>
                <dl class="layui-nav-child">
                    <dd>
                        <a href="/demo/">调试预览</a>
                    </dd>
                </dl>
            </li>

            <li class="layui-nav-item layui-nav-itemed">
                <a class="javascript:;" href="javascript:;">基本元素</a>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="/demo/button.html">按钮组</a>
                    </dd>
                    <dd class="">
                        <a href="/demo/form.html">表单集合</a>
                    </dd>
                    <dd class="layui-this">
                        <a href="/demo/nav.html">导航与面包屑</a>
                    </dd>
                    <dd class="">
                        <a href="/demo/tab.html">选项卡</a>
                    </dd>
                    <dd class="">
                        <a href="/demo/progress.html">进度条</a>
                    </dd>
                    <dd class="">
                        <a href="/demo/collapse.html">折叠面板</a>
                    </dd>
                    <dd class="">
                        <a href="/demo/table.html">基本表格</a>
                    </dd>
                    <dd class="">
                        <a href="/demo/auxiliar.html">简单辅助元素</a>
                    </dd>
                </dl>
            </li>

            <li class="layui-nav-item layui-nav-itemed">
                <a class="javascript:;" href="javascript:;">组件示例</a>
                <dl class="layui-nav-child">
                    <dd class="">
                        <a href="/demo/layer.html">
                            <i class="layui-icon" style="top: 3px;">&#xe638;</i><cite>弹出层</cite>
                        </a>
                    </dd>
                    <dd class="">
                        <a href="/demo/layim.html">
                            <i class="layui-icon" style="position: relative; top: 3px;">&#xe63a;</i>
                            <cite>即时通讯</cite>
                        </a>
                    </dd>
                    <dd class="">
                        <a href="/demo/laydate.html">
                            <i class="layui-icon" style="top: 1px;">&#xe637;</i><cite>日期时间选择</cite>
                        </a>
                    </dd>
                    <dd class="">
                        <a href="/demo/laypage.html">
                            <i class="layui-icon">&#xe633;</i><cite>多功能分页</cite>
                        </a>
                    </dd>
                    <dd class="">
                        <a href="/demo/laytpl.html">
                            <i class="layui-icon">&#xe628;</i><cite>模板引擎</cite>
                        </a>
                    </dd>
                    <dd class="">
                        <a href="/demo/layedit.html">
                            <i class="layui-icon">&#xe639;</i>
                            <cite>富文本编辑器</cite>
                        </a>
                    </dd>
                    <dd class="">
                        <a href="/demo/upload.html">
                            <i class="layui-icon">&#xe62f;</i>
                            <cite>文件上传</cite>
                        </a>
                    </dd>
                    <dd class="">
                        <a href="/demo/tree.html">
                            <i class="layui-icon">&#xe62e;</i>
                            <cite>树形菜单</cite>
                        </a>
                    </dd>
                    <dd class="">
                        <a href="/demo/util.html">
                            <i class="layui-icon">&#xe631;</i>
                            <cite>工具块</cite>
                        </a>
                    </dd>
                    <dd class="">
                        <a href="/demo/flow.html">
                            <i class="layui-icon">&#xe636;</i>
                            <cite>流加载</cite>
                        </a>
                    </dd>
                    <dd class="">
                        <a href="/demo/code.html">
                            <i class="layui-icon" style="top: 1px;">&#xe635;</i>
                            <cite>代码修饰器</cite>
                        </a>
                    </dd>
                </dl>
            </li>

            <li class="layui-nav-item" style="height: 30px; text-align: center"></li>
        </ul>

    </div>
<script type="text/javascript" src="${path}/webjars/layui/1.0.7/layui.js"></script>
<script type="text/javascript" src="${path}/webjars/jui/js/modules/index.js"></script>
</body>
</html>