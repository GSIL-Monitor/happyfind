<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>内容价值探索-首页</title>
<link href="${request.contextPath}/CVE.css" rel="stylesheet" type="text/css" />

</head>
<body id="index">
	<#include "../top.ftl">
	    <div class="content">
	<#include "usermenu.ftl">
    	<div class="model">
            <div class="oprate">
                <ul class="search fl">
                    <li class="br">
                    	<input type="button" onclick="window.location.href='menuAction!addpage.action'" value="添加菜单"/>  
                    </li>
                </ul> 
            </div>
            <div class="space"></div>
            <div class="datatbl">
                <table>
                    <tr class="bg">
                        <th>菜单名称</th>
                        <th>菜单描述</th>
                        <th>菜单级别</th>
                        <th>操作</th>
                    </tr>
                    <#list list as menu>
                    <tr>
                        <td>
                        <#if menu.lever=2>&nbsp;&nbsp;&nbsp;&nbsp;</#if>
                        ${menu.menuname!}
                        </td>
                        <td>${menu.menudesc!}</td>
                        <td>${menu.lever!}</td>
                        <th>
                        <a href="menuAction!delete.action?id=${menu.menuid?string('#')}" class="ml10">删除</a></th>
                    </tr>
                     </#list>
                </table>
            </div>
        </div>
    </div>
</body>

<script type="text/javascript">
    $(document).ready(function(){
    });
</script>
</html>
