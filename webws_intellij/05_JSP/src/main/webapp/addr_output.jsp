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
		
		String a = request.getParameter("addr");
		String city = null;
		
		if(a.equals("seoul")){
			city = "서울";
		}else if(a.equals("gyeongju")){
			city = "경주";
		}else if(a.equals("busan")){
			city = "부산";
		}
	%>

<h1>당신의 주소는 <%=city %> 입니다.</h1>
</body>
</html>