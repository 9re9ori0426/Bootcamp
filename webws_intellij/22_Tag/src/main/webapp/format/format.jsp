<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${a}
<br>
<fmt:formatNumber value="${a}"></fmt:formatNumber>
<br>
<fmt:formatNumber value="${a}" type="currency" currencySymbol="$"></fmt:formatNumber>
<br>
<fmt:formatNumber value="${b}" />
<br>
<fmt:formatNumber value="${b}" type="percent"/>
<br>
<fmt:formatNumber value="${b}" pattern="0.00000"/>
<br>
<fmt:formatNumber value="${b}" pattern="#.#####"/>
<br>
<fmt:formatNumber value="${b}" pattern="#,##.###"/>
<br>
<fmt:formatNumber value="${b}" pattern="0,00.000"/>
<br>
<fmt:formatNumber value="${c}" pattern="#,##.0000000"/>
<hr>

${d}
<br>
<fmt:formatDate value="${d}"/>
<br>
<fmt:formatDate value="${d}" type="date" dateStyle="short"/>
<br>
<fmt:formatDate value="${d}" type="date" dateStyle="long"/>
<br>
<fmt:formatDate value="${d}" type="time" timeStyle="short"/>
<br>
<fmt:formatDate value="${d}" type="time" timeStyle="long"/>
<br>
<fmt:formatDate value="${d}" type="both" dateStyle="short" timeStyle="long"/>
<br>
<fmt:formatDate value="${d}" type="both" dateStyle="long" timeStyle="short"/>
<br>
<fmt:formatDate value="${d}" pattern="yyyy-MM-dd / hh:mm"/>
<hr>

<c:forEach items="${snack}" var="snack" varStatus="st">
    ${st.count} ${snack.name}   <fmt:formatNumber value="${snack.price}" pattern="￦###,###"/>  <fmt:formatDate value="${snack.date}" pattern="yyyy-MM-dd"/>
    <br>
</c:forEach>
</body>
</html>
