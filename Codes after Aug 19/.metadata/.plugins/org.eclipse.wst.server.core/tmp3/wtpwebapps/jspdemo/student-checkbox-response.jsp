<html>
<head>
<title>Student Confirmation title</title>
</head>

<body>
	The student is confirmed: ${param.firstName} ${param.lastName}
	<br /> Favorite Programming Language:
	<br />

	<!--  display list of "favoriteLanguage" -->
	<ul>
		<%
			String[] langs = request.getParameterValues("favoriteLanguage");
 			if (langs != null) {
				for (String tempLang : langs) {
					out.println("<li>" + tempLang + "</li>");
				}
			}
		%>
	</ul>
</body>

</html>