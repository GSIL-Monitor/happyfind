<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>内容价值探索-首页</title>
<link href="${request.contextPath}/CVE.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${request.contextPath}/js/jquery-1.3.2.min.js"></script>
</head>
<script type="text/javascript">
$(document).ready(function(){

         $("#navigationid li").click(function(){
          $(this).addClass("current");
          $(this).siblings().removeClass("current");
          
		  	var navigation = $(this).attr("id");
		  	
		  	var url="crAction!list.action?channel=";
		  	
		  	if(navigation=='tv'){url=url+"tv"; }
		  	
		  	else if(navigation=='movie'){url=url+"movie"; }
		  	else if(navigation=='variety'){url=url+"variety"; }
		  	else if(navigation=='cartoon'){url=url+"cartoon"; }
		  	
		  	$("#iframe_id").attr("src",url);
		  	
           });
          });
</script>
<body id="copyRgt">
	<#include "../top.ftl">
    <div class="content">
        <div class="subNav">
            <ul id="navigationid">
                <li style="left:15px;" class="current" id="tv">电视剧</li>
                <li style="left:90px;" id="movie">电影</li>
                <li style="left:150px;" id="variety">综艺</li>
                <li style="left:210px;" id="cartoon">动漫</li>
            </ul>
        </div>
    	<iframe frameborder="0" id="iframe_id" scrolling="no" src="crAction!list.action?channel=tv" class="cpRgt"></iframe>
    </div>
</body>
</html>
