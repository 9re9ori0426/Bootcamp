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
		// post방식 한글처리
		request.setCharacterEncoding("utf-8");
	
		String i = request.getParameter("id");
		String p = request.getParameter("pw");
		
		
		String status = null;
		if(i.equals("gi")) {
			if(p.equals("gi1004")){ 
				status = "로그인 성공!";
		}else { 
			status = "password error";
		} 
		}else { 
			status = "존재하지 않는 회원입니다";
 	}
			
	
		
	%>
	<h1>ID : <%=i %></h1>
	<h1>PW : <%=p %></h1>
	<h2 style="color: red"><%= status %></h2>

	

</body>
</html>