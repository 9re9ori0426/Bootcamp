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
		String i = request.getParameter("id");
		String p = request.getParameter("pw");
	%>


	<%
		if(i.equals("gi")) {
			if(p.equals("gi1004")){ %>
				<h2>로그인 성공!</h2>
	<h1>ID : <%=i %></h1>
	<h1>PW : <%=p %></h1>
		<%	}else { %>
			<h2>비번 error</h2>
	<%	} 
		}else { %>
		<h2>존재하지 않는 회원</h2>
 <%	}
			
	
		
	%>

</body>
</html>