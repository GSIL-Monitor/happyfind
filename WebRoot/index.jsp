<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK"%>  
<%  
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";  
%>  
<%@ taglib prefix="s" uri="/struts-tags"%>  
<html>  
<head>  
<base href="<%=basePath%>">  
<title>实训管理系统</title>  
<link rel="stylesheet" type="text/css" href="css/team.css" />  
<script type="text/javascript">      
function changeValidateCode(obj) {      
/*** 
  *   获取当前的时间作为参数，无具体意义    
  *   每次请求需要一个不同的参数，否则可能会返回同样的验证码     
  *   这和浏览器的缓存机制有关系，也可以把页面设置为不缓存，这样就不用这个参数了。   
  */  
var timenow = new Date().getTime();      
     
obj.src="LoginCode.servlet?d="+timenow;      
}      
</script>   
</head>  
<body>  
<div id="top">  
<h1>实训管理系统</h1>  
</div>  
<div id="content">  
<form action="admin/Login" method="post">  
<p>用&nbsp;&nbsp;户：<input type="text" name="admin.name">  
<p>密&nbsp;&nbsp;码：<input type="password" name="admin.password">  
<p>验证码：<input type="text" name="code" size="11"><img src="LoginCode.servlet" onclick="changeValidateCode(this)" title="点击图片刷新验证码"/>  
<p><input type="submit" value="登录"><input type="reset" value="重置"/></p>  
</form>  
</div>  
</body>  
</html> 