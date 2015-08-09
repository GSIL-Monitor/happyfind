<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>内容价值探索-首页</title>
<link href="${request.contextPath}/CVE.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${request.contextPath}/js/jquery-1.3.2.min.js"></script>
</head>

<script type="text/javascript">

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

<body>
<div id="qwindow_mask_id" class="qwindow_mask hidden" style="opacity: 0.5;z-index:30000;width:1349px;height:800px;background-color: rgb(84, 84, 84);"></div>
<div id="qwindow_id" class="qwindow hidden" style="top:71px; left:393px;z-index:30000;opacity:1;visibility:visible;">
<iframe frameborder="0" id="iframe_window_id" scrolling="no" src="window/addincome.html" width="500" height="200"></iframe>
</body>
</html>
