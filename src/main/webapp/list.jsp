<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户信息</title>
</head>
<body>
<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>头衔</td>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
           <td>${user.id}</td>
           <td>${user.name}</td>
           <td>${user.sex}</td>
           <td>${user.age}</td>
           <td>${user.title}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>