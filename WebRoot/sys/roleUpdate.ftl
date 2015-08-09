<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>内容价值探索-首页</title>
<link href="${request.contextPath}/CVE.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${request.contextPath}/js/jquery-1.3.2.min.js"></script>
</head>

<script type="text/javascript">
jQuery(document).ready(function(){
	
	$("#submitbtid").click(function(){
	$.ajax({
                cache: true,
                type: "POST",
                url:"${request.contextPath}/roleAction!roleupdatemenu.action",
                data:$('#formid').serialize(), // 你的formid
                async: false,
                error: function(request) {
                    alert("添加失败，请联系管理员！");
                },
                success: function(data) {
                	parent.hiddeniframe(); 
                	parent.window.location.href="${request.contextPath}/roleAction!list.action";
                }
            });
	});
	
	$("#cancelbtid").click(function(){
	 	parent.hiddeniframe(); 
	});
});
</script>
<body>
 <form id="formid" action="roleAction!roleupdatemenu.action" method="post">
	<div class="addbox userRight">
    	<div class="title">角色权限管理</div>
        <div class="addcon">
        	<ul>
            	<li>
                	<label>角色名称：</label>
                    <input name="role.roleid" type="hidden" value="${role.roleid}" class="user defText"/>
                    <input name="role.rolename" type="text" value="${role.rolename}" class="user defText"/>
                </li>
                <#list menulist as menu>
                <li class="mt10">
                	<span class="title">${menu.menudesc!}</span>
        			<input name="menuids" type="checkbox" <#if menu.roles?size=1 > checked="true"</#if>
        			 value="${menu.menuid?string('#')}" id="rem" class="check"/><label for="rem">${menu.menuname!}</label>
                </li>
                 </#list>
            </ul>
        </div>
        <div class="btncon">
        	<input id="submitbtid" type="button" value="保存" class="save"/>
        	<input id="cancelbtid" type="button" value="取消" class="cancel ml10"/>
        </div>
    </div>
    </form>
</body>
</html>