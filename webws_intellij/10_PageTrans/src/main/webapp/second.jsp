<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    int a = Integer.parseInt(request.getParameter("a"));
    int b = Integer.parseInt(request.getParameter("b"));

    request.setAttribute("cc", a+b);

//    response.sendRedirect("third.jsp");
    RequestDispatcher rd = request.getRequestDispatcher("third.jsp");
    rd.forward(request, response);


%>
<body>
<h1>Second Page</h1>
<%=a + b%>
<a href="index.jsp">뒤로</a>
</body>
</html>
