<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>内容价值探索-首页</title>
<script type="text/javascript" src="${request.contextPath}/js/jquery-1.3.2.min.js"></script>
<link href="${request.contextPath}/CVE.css" rel="stylesheet" type="text/css" />
</head>

<script type="text/javascript">

$(document).ready(function(){
$("#apply_window_id").click(function(){
  	var url="${request.contextPath}/userAction!applypage.action";
  	openiframe(url,700,400);
  });
});
 
 function openiframe(url,widthval,heightval)
 {
    $("#iframe_window_id").attr("src",url).width(widthval).height(heightval);
    
    $("#qwindow_mask_id").removeClass("hidden");
    $("#qwindow_id").removeClass("hidden");
 }
 
 function hiddeniframe(){
    $("#qwindow_mask_id").addClass("hidden");
    $("#qwindow_id").addClass("hidden");
 }
 
</script>

<body id="value">
	<div class="top">
    	<div class="logo"></div>
        <ul>
        	<li class="current">内容探索</li>
        	<li>财务指标管理</li>
        	<li><a href="userAction!list.action">用户权限管理</a></li>
        	<li>版权数据同步</li>
        </ul>
        <div class="login">
        	<a href="#">登录</a>
            <span>|</span> 
        	<a id="apply_window_id" href="javascript:void(0)">申请权限</a>
        </div>
    </div>
    
    <div id="qwindow_mask_id" class="qwindow_mask hidden" style="opacity: 0.5;z-index:30000;width:1349px;height:800px;background-color: rgb(84, 84, 84);"></div>
    	<div id="qwindow_id" class="qwindow hidden" style="top:71px; left:393px;z-index:30000;opacity:1;visibility:visible;">
    	<iframe frameborder="0" id="iframe_window_id" scrolling="no" src="" width="500" height="200"></iframe>
    </div>
</body>
</html>