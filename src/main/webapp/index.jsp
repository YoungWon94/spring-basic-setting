<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<head>
<title>메인 페이지</title>
</head>
<body>
 <%=new Date()%>
 <h2>Hello World</h2>

<ul>
<li><a href="t1">누르면 404</a></li>
<li><a href="t2">링크2</a></li>
<li><a href="t3?name=이순신&age=200">링크3</a></li>
</ul>





</body>