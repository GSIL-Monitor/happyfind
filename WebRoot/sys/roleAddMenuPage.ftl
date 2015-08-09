<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>内容价值探索-首页</title>
<link href="${request.contextPath}/CVE.css" rel="stylesheet" type="text/css" />

<script type="javascript">
	function search(){  
		var ids=checkbox();
		var hrefpath="menuAction!roleAddmenu.action?id=${role.roleid}&menuids"+ids;  
        window.location.href= hrefpath;
		}
    function checkbox()
		{
			var str=document.getElementsByName("menuids");
			var objarray=str.length;
			var chestr="";
			for (i=0;i<objarray;i++)
			{
			  if(str[i].checked == true)
			  {
			   chestr+=str[i].value+",";
			  }
			}
			if(chestr == "")
			{
			  alert("请至少选择一项！");
			  return;
			}
			 chestr = chestr.substring(0,chestr.length-1);
			return chestr;
		}
</script>

</head>
<body id="index">
	<#include "../top.ftl">
	    <div class="content">
	<#include "usermenu.ftl">
	 <form action="roleAction!roleAddmenu.action" method="post">
	    <input type="hidden" name="id" value="${role.roleid}"/>
    	<div class="model">
            <div class="oprate">
                <ul class="search fl">
                    <li class="br">
                    	<input type="submit" value="添加菜单"/>  
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
                        <th>选择</th>
                    </tr>
                    <#list menulist as menu>
                    <tr>
                        <td>
                        <#if menu.lever=2>&nbsp;&nbsp;&nbsp;&nbsp;</#if>
                        ${menu.menuname!}
                        </td>
                        <td>${menu.menudesc!}</td>
                        <td>${menu.lever!}</td>
                        <th><input name="menuids" type="checkbox" value="${menu.menuid?string('#')}" /></th>
                    </tr>
                     </#list>
                </table>
            </div>
        </div>
        </form>
    </div>
</body>

<script type="text/javascript">
    $(document).ready(function(){
        alert("aaabbb");
    });
</script>
</html>
