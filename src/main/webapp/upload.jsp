<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>上传</title>
</head>
<body>
<form action="upload" enctype="multipart/form-data" method="post" align="center">
    <input type="file" name="filename">
    <br>
    <button type="submit">上传</button>
    <br>
    <p >上传状态：${requestScope.message}</p>
</form>
</body>
</html>
