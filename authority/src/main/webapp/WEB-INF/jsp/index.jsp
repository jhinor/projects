<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%
    pageContext.setAttribute("path", request.getContextPath());
%>
<html>
<head>
    <title>System Index Page</title>
    <base href="${path}">
    <link rel="stylesheet" href="${path}/webjars/layui/1.0.7/css/layui.css">
</head>
<body>
this is a test index page for shiro
<script>
    layui.config({
        dir: '${path}/webjars/layui/1.0.7/layui.js',
        version: false,
        base: '${path}/static/js/modules/' //你的模块目录
    }).use('index'); //加载入口
</script>
</body>
</html>
