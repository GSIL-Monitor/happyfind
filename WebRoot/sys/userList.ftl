<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>内容价值探索-首页</title>
<link href="${request.contextPath}/CVE.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${request.contextPath}/js/jquery-1.3.2.min.js"></script>
</head>
<script type="text/javascript">

$(document).ready(function(){

	 $("#sel_deptid").val("${user.deptid!}");
	 $("#sel_roleid").val("${user.roleid!}");
	 
	 var namepar='${user.username!}';
	 if(namepar==''){
	 $("#usernameid").val("输入用户姓名或邮箱");
	 }else{
	 $("#usernameid").val("${user.username!}");
	 }
	 
	 $("#submitbtid").click(function(){
		$("#formid").submit()
	 });
	 
	 $("#usernameid").focus(function(){
	 	this.value="";
	 });
});

function openRghpage(id){
  	var url="${request.contextPath}/userAction!openRghpage.action?id="+id;
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

</script>

<body id="index">
	<#include "../top.ftl">
	<div class="content">
	<#include "usermenu.ftl">
    	<div class="model">
        	<!--用户列表-->
        	<form id="formid" action="userAction!list.action" method="post">
            <div class="oprate">
                <ul class="search fl">
                    <li class="show"><input id="usernameid" name="user.username" type="text" value="输入用户姓名或邮箱" class="defText show"/><span></span></li>
                  <!--
                    <li>
                        <select id="sel_deptid" name="user.deptid">
                        	<option value='0'>所属团队</option>
						    <#list deptList as dept>
						          <option value='${dept.deptid}'>${dept.deptname!}</option>
						    </#list>
					    </select>
                    </li>-->
                    
                    <li class="br">
					    <select id="sel_roleid" name="user.roleid">
					    	<option value='0'>用户角色</option>
						    <#list roleList as role>
						          <option value='${role.roleid}'>${role.rolename!}</option>
						    </#list>
					    </select>
                    </li>
                    <li class="br">
                    	<input id="submitbtid" type="button" value="查询"/>
                    	<!--<input type="button" onclick="window.location.href='userAction!addpage.action'" value="添加用户"/> --> 
                    </li>
                </ul>
            </div>
            </form>
            <div class="space"></div>
            <div class="datatbl">
                <table>
                    <tr class="bg">
                        <th>姓名</th>
                        <th>邮箱</th>
                        <th>工作职能</th>
                        <th>开通频道</th>
                        <th>开通状态</th>
                        <th>用户角色</th>
                        <th>操作</th>
                    </tr>
                    <#list list as user>
                    <tr>
                        <th>${user.username}</th>
                        <td>${user.email!}</td>
                        <td>${user.userjob!}</td>
                        <td>${user.applychannel!}</td>
                        <td>
                        <#switch user.status!>
                        		<#case 1>已开通<#break>   
					  			<#case 0>未开通<#break>     
					    		<#default> 未开通
					    </#switch>
                        </td>
                        <td>
                        <#if user.sysRole??>
						  ${user.sysRole.rolename!}
						<#else>
							待分配
						</#if>
                        </td>
                        <th>
                        <#if user.status=0>
                        <a href="javascript:void(0)" onclick="openRghpage('${user.userid}')" >开通</a>
                        <#elseif user.status=1>
                        <a href="javascript:void(0)" onclick="closeRgh('${user.userid}')" >注销</a>
                        </#if>
                        <a href="userAction!delete.action?id=${user.userid?string('#')}" class="ml10">删除</a></th>
                    </tr>
                     </#list>
                </table>
            </div>
        </div>
    </div>

</body>
</html>
