<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'productview.jsp' starting page</title>
   
  </head>
  
  <body>
  呵呵呵<br>
       <s:property value="product.name"/><p/>
       <s:property value="product.price"/><p/>
       <s:property value="product.count"/><p/>
  </body>
</html>
