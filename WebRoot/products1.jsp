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
    
    <title>My JSP 'products1.jsp' starting page</title>


  </head>
  
  <body>
    <s:form action="products1">
       <s:textfield label="产品数组[0]" name="products"></s:textfield>
       <s:textfield label="产品数组[1]" name="products"></s:textfield>
       <s:textfield label="产品数组[2]" name="products"></s:textfield>
       <s:submit value="提交"/>
    </s:form>
  </body>
</html>
