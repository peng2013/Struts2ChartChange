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
    
    <title>信息录入</title>

  </head>
  
  <body>
    <s:form action="type_conversion">
       <s:textfield label="产品一" name="products"/>
       <s:textfield label="产品二" name="products"/>
       <s:textfield label="产品三" name="products"/>
       
       <s:textfield label="数字1" name="numbers"/>
       <s:textfield label="数字2" name="numbers"/>
       <s:textfield label="数字3" name="numbers"/>
       
       
       <s:textfield label="集合1" name="collections"/>
       <s:textfield label="集合2" name="collections"/>
       <s:textfield label="集合3" name="collections"/>
       <s:submit value="提交"/>
    </s:form>
  </body>
</html>
