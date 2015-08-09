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
	 jQuery("#userjobid").focus(function(){
  	 this.value="";
  	 this.removeClass("defText");
	 });
	 jQuery("#emailid").focus(function(){
	 this.value="";
  	 this.removeClass("defText");
	});
	
	$("#submitbtid").click(function(){
	var chk_value ="";    
  	$('input[name="channelStrList"]:checked').each(function(){ 
  	 chk_value+=($(this).val())+",";    
 	 });  
 	 
 	 if(chk_value.length > 0) 
        chk_value = chk_value.substring(0, chk_value.length - 1);
		$("#applychannelid").attr("value",chk_value);
	$.ajax({
                cache: true,
                type: "POST",
                url:"${request.contextPath}/userAction!apply.action",
                data:$('#applyformid').serialize(),// 你的formid
                async: false,
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
                	alert('申请成功，请等待管理员审核，注意查收邮件！');
                	parent.hiddeniframe(); 
                }
            });
	});
	
	$("#cancelbtid").click(function(){
	 	parent.hiddeniframe(); 
	});
});
</script>
<body>

<div class="addbox userApply">
    	<div class="title">申请权限<a href="login.html" target="_self" class="fr mr10">用户登陆</a></div>
   <form id="applyformid" action="${request.contextPath}/userAction!apply.action" method="post">
    	<input type="hidden" id="applychannelid" name="user.applychannel" value=""/>
        <div class="addcon">
        	<ul>
            	<li>
                	<label>邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱：</label>
                    <input name="user.email" id="emailid" type="text" value="公司邮箱前缀" class="user defText"/>
                </li>
            	<li class="mt10">
                	<label>工作职能：</label>
                	<select id="sel_deptid" name="user.deptid">
                        	<option value='0'>所属团队</option>
						    <#list deptList as dept>
						          <option value='${dept.deptid}'>${dept.deptname!}</option>
						    </#list>
					    </select>
					    
                    <input name="user.userjob" id="userjobid" type="text" value="工作职位" class="user defText"/>
                    
                </li>
            	<li class="mt10 sel">
                	<label>开通频道：</label>
                    <span class="" id="channelcheckid">
                		<#list channelStrList as channel>
					         <input name="channelStrList" type="checkbox" value="${channel}"/> ${channel}
					    </#list>
                    </span>
                </li>
            	<li class="mt10">
                	<label class="fl">申请原因：</label>
                    <textarea name="user.applydesc" cols="" rows="" class="reason"></textarea>
                </li>
            </ul>
        </div>
        <div class="btncon">
        	<input type="button" id="submitbtid" value="保存" class="save"/>
        	<input type="button" id="cancelbtid" value="取消" class="cancel ml10"/>
        </div>
        </from>
        
    </div>
</body>
</html>
