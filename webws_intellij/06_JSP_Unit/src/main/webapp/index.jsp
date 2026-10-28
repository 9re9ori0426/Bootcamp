<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
  <link href="index.css" rel="stylesheet">
</head>
<body>
<%
  String type = request.getParameter("convert_type");
  double value = Double.parseDouble( request.getParameter("convert_value") );
  String start_unit = null;
  String ret_unit = null;

  String font_color = "";
  String back_color = "";

  double ret = 0;
  switch (type){
    case "CtoI" :
      ret = value/2.54;
      start_unit="cm";
      ret_unit = "inch";

      font_color = "tomato";
      back_color = "violet_back";
      break;
    case "MtoP" :
      ret = value*0.3025;
      start_unit="㎡";
      ret_unit = "평";

      font_color = "green";
      back_color = "green_back";
      break;
    case "CtoF" :
      ret = (value*1.8 ) +32;
      start_unit="℃";
      ret_unit = "℉";

      font_color = "yellow";
      back_color = "yellow_back";
      break;
    case "KtoM" :
      ret = value*0.621371;
      start_unit="km/h";
      ret_unit = "mi/h";

      font_color = "pink";
      back_color = "red_back";
      break;
  }
%>

  <div class="flex-box <%=back_color%>">
    <div>변환 결과</div>
    <div class="flex-row">
      <div><%=value%></div>
      <div class="<%=font_color%>"><%=start_unit%></div>
    </div>
    <div class="arrow">⬇</div>
    <div class="flex-row">
      <div><%=String.format("%.1f", ret)%></div>
      <div class="<%=font_color%>"><%=ret_unit%></div>
    </div>

    <button class="back_btn" onclick="location.href='index.html'">돌아가기</button>
  </div>
</body>
<script>
  const back_btn = document.querySelector(".back_btn");
  back_btn.focus();
</script>
</html>