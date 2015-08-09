<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>内容价值探索-首页</title>
<script type="text/javascript" src="${request.contextPath}/js/jquery-1.3.2.min.js"></script>
<link href="${request.contextPath}/CVE.css" rel="stylesheet" type="text/css" />
</head>

<script type="text/javascript">

function openRoleaddPage(){
  	var url="${request.contextPath}/roleAction!openRoleaddPage.action";
  	openiframe(url,400,500);
}

function updatePage(id){
  	var url="${request.contextPath}/roleAction!updatepage.action?id="+id;
  	openiframe(url,400,500);
}

function closeRgh(id){
	$("#submitbtid").click(function(){
	$.ajax({
                cache: true,
                type: "POST",
                url:"${request.contextPath}/userAction!closeRgh.action?id=${id}",
                data:$('#formid').serialize(), // 你的formid
                async: false,
                error: function(request) {
                    alert("失败，请联系管理员！");
                },
                success: function(data) {
                	parent.hiddeniframe(); 
                	submitform();
                }
            });
	});
}

function submitform(){
	$("#formid").submit()
}

function updaterolemenu(idd){
  	var url="${request.contextPath}/roleAction!updatepage.action?id="+idd;
  	openiframe(url,400,500);
}

</script>

<body id="index">
	<#include "../top.ftl">
	    <div class="content">
	<#include "usermenu.ftl">
    	<div class="model">
    	<div class="oprate">
                <ul class="search fl">
                    <li class="br">
                    	<input type="addrolebtid" onclick="openRoleaddPage()" value="添加角色"/>  
                    </li>
                </ul> 
            </div>
            <div class="space"></div>
            <div class="datatbl">
                <table>
                    <tr class="bg">
                        <th>角色名称</th>
                        <th>角色权限</th>
                        <th>操作</th>
                    </tr>
                    <#list list as role>
                    <tr>
                        <td>${role.rolename!}</td>
                        <td>
                        <#if role.menus??>
						  <#list role.menus as m>
						  	${m.menuname!}&nbsp;
						  </#list>
						</#if>
                        </td>
                        <th>
                        <a href="roleAction!delete.action?id=${role.roleid?string('#')}" class="ml10" >删除</a>
                        <a href="javascript:void(0)" onclick="updaterolemenu('${role.roleid}')" >编辑</a>
                        </th>
                    </tr>
                     </#list>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
