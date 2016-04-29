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

	<!-- the request HttpServletRequest object is a so called "Implicit Object"
	read more on:http://www.tutorialspoint.com/jsp/jsp_implicit_objects.htm  -->
	<!-- JSP-Expression -->
	<%= displayBlog(Integer.parseInt(request.getParameter("id"))) %>
	
	<!-- java-method in an JSP-Declaration -->
	<%!
		public String displayBlog(int id) {
			BlogBean blog = DBAndDAOImitation.getBlog(id);
			return
				"<article>" +
				"<h3>" + blog.getHeader() + "</h3>" +
				"<i>" + blog.getAuthor() + " , " + blog.getDate() + "<i/>" +
				"<p>" + blog.getText() + "</p>" +
				"<br><br>" +
				"</article>"
			;
		}
	%>
</body>
</html>