<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 
		+,-,*,/
		
		총 합이 10이 넘을때만 결과화면 나오게
	 -->
	<%!
		public int getMok(int a, int b) {
		return a / b;
	}
		
	%>
	<%	
	
		int x = Integer.parseInt(request.getParameter("xx"));
		int y = Integer.parseInt(request.getParameter("yy"));
	
		int plus = x + y;
		int min = x - y;
		int multy = x * y;
		int divide = x / y;
		
		if(x + y > 10){ %>
			<h1><%=x%> + <%=y%> = <%=plus %></h1>
			<h1><%=x%> - <%=y%> = <%=min %></h1>
			<h1><%=x%> * <%=y%> = <%=multy %></h1>
			<h1><%=x%> / <%=y%> = <%=getMok(x,y) %></h1>
	<% 	}
		
		
		
		
	%>


</body>
</html>