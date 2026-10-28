<%@page import="java.util.HashMap"%>
<%@page import="java.util.logging.Handler"%>
<%@page import="java.util.Map"%>
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
	
		String[] sp = request.getParameterValues("sport");
		String sp2 = "";
		String koreanResult = "";
		
		if (sp != null) {
			for (String s : sp) {
				//if(s.equals("soccer")){
				//	koreanResult = "축구"; 
				//	sp2 += koreanResult + " ";
				//}
			//	if(s.equals("basketball")){
			//		koreanResult = "농구"; 
			//		sp2 += koreanResult + " ";
			//	}
			//	if(s.equals("badminton")){
			//		koreanResult = "배드민턴"; 
			//		sp2 += koreanResult + " ";
			//	}
				switch (s) {
				case "soccer" : 
					koreanResult += " 축구 |";
					break;
				case "basketball" : 
					koreanResult += " 농구 |";
					break;
				case "badminton" : 
					koreanResult += " 배드민턴 |";
					break;
				}
				
				sp2 += s + " ";
		}
		}else {
		sp2 = "관심사 없음.";
	}
	%>

   	 		<h2>관심 스포츠 : <%=sp2 %></h2><hr>
   	 		<h2>관심 스포츠 : <%=koreanResult %></h2><hr>
   	 		
   	 		version2
   	 		<hr>
   	 		<%
   	 			Map<String, String> vals = new HashMap();
   	 			vals.put("soccer", "축구");
   	 			vals.put("basketball", "농구");
   	 			vals.put("badminton", "배드민턴");
   	 		
   	 			for(String s : sp){ %>
   	 				<h2><%=vals.get(s) %></h2>
   	 		<%	}
   	 		%>
   	 		
   	 		
   	 		
   	 		
   	 		
   	 		
   	 		
</body>
</html>