<%@ page import="com.bo._8_el.Bean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%--<%--%>
<%--    Bean b = (Bean) request.getAttribute("bean");--%>
<%--%>--%>
<body>
<%--    이름 : <%=b.getName()%><br>--%>
<%--    중간 : <%=b.getMid()%><br>--%>
<%--    기말 : <%=b.getFin()%><br>--%>
<%--    평점 : <%=b.getAvg()%><br>--%>
<%--    등급 : <%=b.getGrade()%><br>--%>
<%--    <hr>--%>
이름 : ${bean.name}<br>
중간 : ${param.mid + 10}<br>
기말 : ${param.fin}<br>
평점 : ${bean.avg}<br>
등급 : ${bean.grade}<br>

<hr>
${a}
<hr>
${b}
<hr>
${c[0]} ${c[1]} ${c[2]}, ${c[3]}
<hr>
${studentsss[0]}
<hr>
1번학생의 이름 / 등급 <br>
${students[0].name} ${students[0].grade}
<hr>
2번학생의 이름 / 평점 / 등급 <br>
${students[1].name} ${students[1].avg} ${students[1].grade}

</body>
</html>
