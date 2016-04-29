<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page import="io.github.didriklind.javaClasses.*, java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>A base look of page for my blog</title>

<link rel="stylesheet" type="text/css" href="css/myCss.css">

</head>
<body>

	<!-- JSTL instead of jsp action -->
	<c:import url="/header.html" /> <!-- <jsp:include page="/header.html" /> -->
	<c:import url="/navigation.html" /> <!-- <jsp:include page="/navigation.html" /> -->
	
	<!-- JSP-Expression -->
	<%= displayBlogs() %>
	
	
	<!-- java-method -->
	<!-- adding id right into the url while looping in an ugly? way -->
	<!-- java-method in an JSP-Declaration -->
	<%!
		public String displayBlogs() {
			
			
			ArrayList<BlogBean> blogList = DBAndDAOImitation.getAllBlogs();
			StringBuilder strBuilder = new StringBuilder();
			for(int i=0; i<blogList.size(); i++) {
				strBuilder.append(
					"<article>" +
					"<h3>" + blogList.get(i).getHeader() + "</h3>" +
					"<i>" + blogList.get(i).getAuthor() + " , " + blogList.get(i).getDate() + "<i/>" +
					"<p>" + blogList.get(i).getText().substring(0,30) + "......." + "</p>" +
					"<br><br>" +
					"<a href='blog.jsp?id=" + (i) + "'>" + "READ MORE<a/>" +
					"</article>"
				);
			}
			return strBuilder.toString();
		}
	%>
	
</body>
</html>