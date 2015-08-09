<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>内容价值探索-首页</title>
<link href="${request.contextPath}/CVE.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${request.contextPath}/js/jquery.js"></script>
</head>
<script type="text/javascript">
jQuery(document).ready(function(){
	$("#submitbtid").click(function(){
	$.ajax({
                cache: true,
                type: "POST",
                url:"${request.contextPath}/userAction!openrgh.action?id=${id}",
                data:$('#formid').serialize(), // 你的formid
                async: false,
                error: function(request) {
                    alert("失败，请联系管理员！");
                },
                success: function(data) {
                	parent.hiddeniframe(); 
                	parent.submitform(); 
                }
            });
	});
	$("#cancelbtid").click(function(){
	 	parent.hiddeniframe(); 
	});
});
</script>
<body>
	<form id="formid" action="${request.contextPath}/userAction!openrgh.action" method="post">
	<input type="hidden" id="userid" name="user.userid" value="${id}"/>
	<input type="hidden" id="userid" name="user.status" value="1"/>
	<div class="addbox openRgh">
    	<div class="title">开通权限</div>
        <div class="addcon">
        	<ul>
            	<li class="mt10 sel">
                	<label>开通频道：</label>
                    <select id="sel_roleid" name="user.roleid">
					    	<option value='0'>用户角色</option>
						    <#list roleList as role>
						          <option value='${role.roleid}'>${role.rolename!}</option>
						    </#list>
					    </select>
                </li>
            </ul>
        </div>
        <div class="btncon">
            <input type="button" id="submitbtid" value="保存" class="save"/>
        	<input type="button" id="cancelbtid" value="取消" class="cancel ml10"/>
        </div>
    </div>
    </form>
</body>
</html>
