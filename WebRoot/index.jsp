<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK"%>  
<%  
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";  
%>  
<%@ taglib prefix="s" uri="/struts-tags"%>  
<html>  
<head>  
<base href="<%=basePath%>">  
<title>ʵѵ����ϵͳ</title>  
<link rel="stylesheet" type="text/css" href="css/team.css" />  
<script type="text/javascript">      
function changeValidateCode(obj) {      
/*** 
  *   ��ȡ��ǰ��ʱ����Ϊ�������޾�������    
  *   ÿ��������Ҫһ����ͬ�Ĳ�����������ܻ᷵��ͬ������֤��     
  *   ���������Ļ�������й�ϵ��Ҳ���԰�ҳ������Ϊ�����棬�����Ͳ�����������ˡ�   
  */  
var timenow = new Date().getTime();      
     
obj.src="LoginCode.servlet?d="+timenow;      
}      
</script>   
</head>  
<body>  
<div id="top">  
<h1>ʵѵ����ϵͳ</h1>  
</div>  
<div id="content">  
<form action="admin/Login" method="post">  
<p>��&nbsp;&nbsp;����<input type="text" name="admin.name">  
<p>��&nbsp;&nbsp;�룺<input type="password" name="admin.password">  
<p>��֤�룺<input type="text" name="code" size="11"><img src="LoginCode.servlet" onclick="changeValidateCode(this)" title="���ͼƬˢ����֤��"/>  
<p><input type="submit" value="��¼"><input type="reset" value="����"/></p>  
</form>  
</div>  
</body>  
</html> 