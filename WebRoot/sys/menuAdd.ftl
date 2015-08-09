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
    <form action="menuAction!addMenu.action" method="post">
    </br>
    <table>
    <tr><td>菜单名称:</td><td><input type="text" size="20" id="menunameid" name="menulist[0].menuname"/></td></tr>
    <tr><td>菜单描述:</td><td><input type="text" size="50" id="menudescid" name="menulist[0].menudesc"/></td></tr>
    <tr><td>父级别:</td><td>
    <select name="menulist[0].parentid">
	     <option value='0'>根目录</option>
	    <#list list as menu>
	          <option value='${menulist[0].menuid}'>${menulist[0].menuname}</option>
	    </#list>
    </select>
    </td></tr>
    <tr><td>菜单名称:</td><td><input type="text" size="20" id="menunameid" name="menulist[1].menuname"/></td></tr>
    <tr><td>菜单描述:</td><td><input type="text" size="50" id="menudescid" name="menulist[1].menudesc"/></td></tr>
    <tr><td>父级别:</td><td>
    <select name="menulist[1].parentid">
	     <option value='0'>根目录</option>
	    <#list list as menu>
	          <option value='${menulist[1].menuid}'>${menulist[1].menuname}</option>
	    </#list>
    </select>
    </td></tr>
    <tr><td colspan="2"><input type="submit" value="提交"/></td></tr>
    </table>
   	</form>
   	</div>
</body>
</html>
