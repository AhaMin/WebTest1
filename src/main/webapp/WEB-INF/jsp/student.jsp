<%--
  Created by IntelliJ IDEA.
  User: ewang
  Date: 2017/12/4
  Time: 下午5:58
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${list}" var="o">
    <p>姓名：<c:out value="${o.name}" />,年龄：${o.age},专业：<c:out value="${o.major}" />
</c:forEach>
</body>
</html>
