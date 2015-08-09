<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>内容价值探索-首页</title>
<link href="${request.contextPath}/CVE.css" rel="stylesheet" type="text/css" />
</head>
<body id="index">
	<#include "../top.ftl">
    <div class="content" style="text-align: center;">
	<#include "usermenu.ftl">
	<div class="model">
    <form action="roleAction!addRole.action" method="post">
    </br>
    <table>
    <tr><td>角色名称:</td><td><input type="text" size="20" id="roleameid" name="role.rolename"/></td></tr>
    <tr><td>角色描述:</td><td><input type="text" size="50" id="roledescid" name="role.roledesc"/></td></tr>
    
    <tr><td colspan="2"><input type="submit" value="提交"/></td></tr>
    </table>
   	</form>
   	</div>
</body>
</html>

