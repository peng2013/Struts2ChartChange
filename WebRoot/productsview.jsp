<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'productsview.jsp' starting page</title>

  </head>
  
  <body>
    <b>产品1</b><p/>
    名称：<s:property value="product1.name"/><br>
    价格：<s:property value="product1.price"/><br>
    数量：<s:property value="product1.count"/><p/>
    <b>产品2</b><p/>
    名称：<s:property value="product2.name"/><br>
    价格：<s:property value="product2.price"/><br>
    数量：<s:property value="product2.count"/><br>
  </body>
</html>
