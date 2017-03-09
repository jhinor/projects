<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<html>
<head>
    <title>System Login</title>
    <base href="${path}">
    <link rel="stylesheet" href="${path}/webjars/layui/1.0.7/css/layui.css">
</head>
<body>
<form class="layui-form layui-form-pane" action="">
    <div class="layui-form-item">
        <label class="layui-form-label">长输入框</label>
        <div class="layui-input-block">
            <input type="text" name="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">短输入框</label>
        <div class="layui-input-inline">
            <input type="text" name="username" lay-verify="required" placeholder="请输入" autocomplete="off"
                   class="layui-input">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-inline">
            <label class="layui-form-label">日期选择</label>
            <div class="layui-input-block">
                <input type="text" name="date" id="date" autocomplete="off" class="layui-input"
                       onclick="layui.laydate({elem: this})">
            </div>
        </div>
        <div class="layui-inline">
            <label class="layui-form-label">行内表单</label>
            <div class="layui-input-inline">
                <input type="number" name="number" autocomplete="off" class="layui-input">
            </div>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">密码</label>
        <div class="layui-input-inline">
            <input type="password" name="password" placeholder="请输入密码" autocomplete="off" class="layui-input">
        </div>
        <div class="layui-form-mid layui-word-aux">请务必填写用户名</div>
    </div>
    <div class="layui-form-item">
        <button class="layui-btn" lay-submit="" lay-filter="demo2">跳转式提交</button>
    </div>
</form>

</body>
</html>
