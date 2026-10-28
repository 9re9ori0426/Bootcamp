<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		
		int a =Integer.parseInt(request.getParameter("age"));
		String msg = null;
		
		if(a >= 20 ){
			msg = "안녕하세요";
		}else{
			msg = "안녕";
		}
	%>
	
	<h1><%=msg %></h1>
</body>
</html>