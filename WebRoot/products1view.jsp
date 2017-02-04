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
    
    <title>My JSP 'products1view.jsp' starting page</title>

  </head>
  
  <body>
    <s:iterator id="product" status="i" value="products">
       产品数组[ ${i.index} ]<p/>
       名称：${product.name}&nbsp;&nbsp;
       价格：${product.price}&nbsp;&nbsp;
       数量：${product.count}<p/>
    </s:iterator>
  </body>
</html>
