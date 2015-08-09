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
    <form action="userAction!addUser.action" method="post">
    </br>
    <table>
    <tr><td>姓名:</td><td><input type="text" size="20" id="username" name="user.username"/></td></tr>
    <tr><td>邮箱:</td><td><input type="text" size="50" id="email" name="user.email"/></td></tr>
    <tr><td>所属团队:</td><td>
    <select name="user.deptid">
	    <#list deptList as dept>
	          <option value='${dept.deptid}'>${dept.deptname}</option>
	    </#list>
    </select>
    </td></tr>
    <tr><td>开通频道:</td><td><input type="text" size="50" id="channel_id" name="user.chennelid"/></td></tr>
    <tr><td>开通状态:</td><td>
    <select name="user.status">
	          <option value='1'>开通</option>
	          <option value='0'>注销</option>
    </select>
    </td></tr>
    <tr><td>用户角色:</td><td>
    <select name="user.roleid">
	    <#list roleList as role>
	          <option value='${role.roleid}'>${role.rolename}</option>
	    </#list>
    </select>
    </td></tr>
    <tr><td colspan="2"><input type="submit" value="提交"/></td></tr>
    </table>
   	</form>
   	</div>
</body>
</html>
