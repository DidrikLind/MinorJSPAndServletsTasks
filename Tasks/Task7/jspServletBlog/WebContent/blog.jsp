<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="io.github.didriklind.javaClasses.*, java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Blog</title>
</head>
<body>

	<!-- JSTL instead of jsp action -->
	<c:import url="/header.html" /> <!-- <jsp:include page="/header.html" /> -->
	<c:import url="/navigation.html" /> <!-- <jsp:include page="/navigation.html" /> -->

	<article>
		
			<h3>${BLOG.header}</h3> <!-- will call for my getHeader() method -->
			<i>${BLOG.author}, ${BLOG.date}</i>
			<p>${BLOG.text}</p>
			
	</article>
</body>
</html>