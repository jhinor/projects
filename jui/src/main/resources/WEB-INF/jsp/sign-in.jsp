<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>Sign In</title>
    <link rel="stylesheet" href="${path}/webjars/layui/1.0.7/css/layui.css" media="all"/>
    <link rel="stylesheet" href="${path}/webjars/jui/css/sign-in.css"/>
</head>
<body class="jui-sign-in-bg">
<div class="jui-canvas"></div>
<div class="jui-sign-in-box">
    <header>
        <h1><strong>Management System</strong></h1>
    </header>
    <div class="jui-sign-in-main">
        <form action="${path}/sessions" class="layui-form" method="post">
            <div class="layui-form-item">
                <label class="jui-sign-in-icon">
                    <i class="layui-icon">&#xe612;</i>
                </label>
                <input type="text" name="username" lay-verify="username" autocomplete="off" placeholder="username" class="layui-input">
            </div>
            <div class="layui-form-item">
                <label class="jui-sign-in-icon">
                    <i class="layui-icon">&#xe642;</i>
                </label>
                <input type="password" name="password" lay-verify="password" autocomplete="off" placeholder="password" class="layui-input">
            </div>
            <div class="layui-form-item">
                <div class="jui-pull-left jui-sign-in-remember">
                    <label>remember me</label>
                    <input type="checkbox" name="isRemember" value="true" lay-skin="switch" checked title="isRemember">
                </div>
                <div class="jui-pull-right">
                    <button class="layui-btn layui-btn-primary" lay-submit lay-filter="login">
                        <i class="layui-icon">&#xe650;</i> sign in
                    </button>
                </div>
                <div class="jui-clear"></div>
            </div>
        </form>
    </div>
    <footer>
        <p>${copyright}</p>
    </footer>
</div>
<script type="text/javascript" src="${path}/webjars/layui/1.0.7/layui.js"></script>
<script type="text/javascript" src="${path}/webjars/jui/js/modules/sign-in.js"></script>
</body>
</html>