<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>内容价值探索-首页</title>
<link href="CVE.css" rel="stylesheet" type="text/css" />
<title>出错啦~~~</title> 
<link href="css/login1.css" mce_href="css/login1.css" rel="stylesheet" type="text/css" /> 
<script language="javascript" type="text/javascript"> 
var i = 3; 
var intervalid; 
intervalid = setInterval("fun()", 1000); 
function fun() { 
if (i == 0) { 
window.location.href = "login.ftl"; 
clearInterval(intervalid); 
} 
document.getElementById("mes").innerHTML = i; 
i--; 
} 
</script> 
</head> 
<body> 
<div id="errorfrm"> 
<h3>出错啦~~~</h3> 
<div id="error"> 
<img src="images/error.gif" mce_src="images/error.gif" alt="" /> 
<p>系统出错，请联系管理员！</p> 
<p>将在 <span id="mes">5</span> 秒钟后返回首页！</p> 
</div> 

</div> 
</body> 
</html> 