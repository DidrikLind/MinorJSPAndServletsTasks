<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


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
	
	
	
	<!-- we have blog from servlet now -->
	<c:forEach var="tempBlog" items="${BLOG_LIST}"> <!-- forEach tag can handle java collections, e.g a list -->
	
		<!-- set up a link to a specific blog -->
		<!-- looks like: BlogControllerServlet?userId= -->
		
		<!-- building an url like " BlogControllerServlet?blogId='number' "-->
		<c:url var="blogLink" value="BlogControllerServlet">
			<c:param name="blogId" value="${tempBlog.id}" /> <!-- will automatically call get method. -->
			<c:param name="someOtherQS" value="JUST FOR LOOK BRO :)"></c:param>
		</c:url>
	
		<article>
		
			<h3>${tempBlog.header}</h3> <!-- will call for my getHeader() method -->
			<i>${tempBlog.author}, ${tempBlog.date}</i>
			<p>${fn:substring(tempBlog.text, 1, 30)} . . .</p>
			<br><br>
			<a href="${blogLink}"> READ MORE</a>
			<br><br><br>
			[For learning reasons, this is how the READ MORE link look like]: ${blogLink}
			
		</article>
	
	
	</c:forEach>
	
</body>
</html>