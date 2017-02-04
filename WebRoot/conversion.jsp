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
    
    <title>信息显示页面</title>

  </head>
  
  <body>
    <b>产品</b><br/>
    <s:property value="products[0]"/>
    <s:property value="products[1]"/>
    <s:property value="products[2]"/><p/>
    <b>数字</b><p/><br/ >
    <s:property value="numbers[0]"/>
    <s:property value="numbers[1]"/>
    <s:property value="numbers[2]"/>
    <b>集合</b><p/>
    <s:property value="collections[0]"/>
    <s:property value="collections[1]"/>
    <s:property value="collections[2]"/>
  </body>
</html>
