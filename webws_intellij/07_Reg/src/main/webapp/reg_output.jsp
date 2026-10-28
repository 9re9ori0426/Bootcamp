<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="reg.css">
</head>
<%
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String gender = request.getParameter("gender");
	String addr = request.getParameter("addr");
	String[] interests  = request.getParameterValues("interest");
	String introduce = request.getParameter("introduce").replaceAll("\n", "<br>");

	String interest_str = "없음";
	if( interests != null ){
		for(int i = 0; i < interests.length; i++){
			interest_str += interests[i];
			if( i != interests.length - 1){
				interest_str += ", ";
			}
		}
	}
%>
<body>
	<form>
		<div class="signup-row">
			<div>Name</div>
			<%=name%>
		</div>
		<div class="signup-row">
			<div>ID</div>
			<%=id%>
		</div>
		<div class="signup-row">
			<div>PW</div>
			<%=pw%>
		</div>
		<div class="signup-row">
			<div>Gender</div>
			<%=gender%>
		</div>
		<div class="signup-row">
			<div>Addr</div>
			<%=addr%>
		</div>
		<div class="signup-row">
			<div>Interest</div>
			<%=interest_str%>
		</div>
		<div class="signup-row">
			<div>Introduce</div>
			<%=introduce%>
		</div>

		<button type="button" onclick="location.href='index.html';">뒤로</button>
	</form>
</body>
</html>