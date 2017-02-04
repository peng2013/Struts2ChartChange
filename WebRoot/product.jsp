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
    
    <title>My JSP 'product.jsp' starting page</title>
 

  </head>
  
  <body>
      <s:form action="product">
         <s:textfield label="请输入产品信息" name="product"/>
         <s:submit value="提交"/>
      </s:form>
  </body>
</html>
