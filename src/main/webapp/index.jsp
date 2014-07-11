<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>初始页面</title>
    <%
        String path = request.getContextPath();
    %>
</head>
<body>

<form method="post" action="<%=path%>/easyPay/userInfo.do">
 <input type="submit" value="显示列表">
</form>

</body>
</html>