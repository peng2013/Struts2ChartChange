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
    
    <title>My JSP 'products.jsp' starting page</title>
 

  </head>
  
  <body>
    <s:form action="products">
       <!-- 提交第1个Product类型的请求参数 -->
       <s:textfield label="产品1" name="product1"/>
       <!-- 提交第2个Product类型的请求参数 -->
       <s:textfield label="产品2" name="product2"/>
       <s:submit value="提交"/>
    </s:form>
  </body>
</html>
