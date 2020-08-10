<%
	int amount=(Integer)request.getAttribute("amt");
	int interest=(Integer)request.getAttribute("intr");
	int net=(Integer)request.getAttribute("net");
%>


<html>
<body>
	<h3>Interest Details</h3>
	<hr>
		<pre>
		Amount		<%=amount%>
		Interest	<%=interest%>
		Net		<%=net%>
		</pre>		
	<hr>
</body>
</html>