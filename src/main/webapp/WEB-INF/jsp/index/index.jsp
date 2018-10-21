<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<c:import url="header.jsp" />
	
	<div>
		${saudacao}!!
	</div>
	
	<div>
		<a href=${linkTo[LoginController].login}>Entrar</a>
	</div>
	
	<c:import url="footer.jsp" />
</body>
</html>