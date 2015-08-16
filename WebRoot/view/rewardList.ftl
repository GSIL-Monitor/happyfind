<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>乐寻平台管理后台</title>
<link href="CVE.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${request.contextPath}/js/jquery-1.3.2.min.js"></script>
</head>
<body id="value">
<div class="dataCon">
	<div class="tab">
            	<ul>
                	<li class="current">悬赏列表</li> 
                </ul>
     </div>
     <div class="space"></div>
    	<div class="mode">
	    	<div class="theme">
	    	
            <input type="button" id="submitbtidborrow" class="btn " value="添加信息"  onclick="addReward()"/>		
	         </div>
                <div class="datatbl">
                	<table>
                    	<tr class="bg">
                        	<th>姓名</th>
                        	<th>ID</th>
                        	<th>状态</th>
                        	<th>时间</th>
                        	<th>来源</th>
                        	<th>操作</th>
                        </tr>
                        <#list rewardlist as reward>
                    <tr>
                        <td>${reward.id!}</td>
                        <td>${reward.id!}</td>
                        <td>${reward.id!}</td>
                        <td>${reward.id!}</td>
                        <td>${reward.id!}</td>
                        <td><img src="image/0812309.png" class="update" onclick="updateborrow('${borrow.id!}')" title="修改"></img>
                        		<img src="image/delete.png" class="delete" onclick="deleteborrow('${borrow.id!}')"  title="删除"></img></td>
                    </tr>
                     </#list>
                    </table>
                </div>
            </div>
  </div>
</div>
<div id="qwindow_maskt" class="qwindow_mask " style="opacity: 0.5;z-index:30000;width:1349px;height:800px;background-color: rgb(84, 84, 84);"></div>
    <div id="qwindowt" class="qwindow " style="top:120px; left:393px;z-index:30000;opacity:1;visibility:visible;">
    	<iframe id="iframe_window_idt" frameborder="0" scrolling="no" src="" ></iframe>
    </div>
  </body>
</html>
<script>
function subborrow(){
	$("#borrowForm").submit();
}

function addReward(){
			var url="${request.contextPath}/viewAction!toPage?pageName=addReward";
			$('#iframe_window_idt').attr("src",url).width(700).height(300);
			$('#qwindow_maskt').show();
			$('#qwindowt').show();
}

function deleteborrow(borrowid){
			$.ajax({
	                cache: true,
	                type: "POST",
	                url:"${request.contextPath}/mangerAction!deleteBorrow.action?borrowId="+borrowid,
	                async: false,
	                error: function(request) {
	                    alert("删除失败！");
	                },
	                success: function(data) {
	                	alert('删除成功！');
	                	$("#borrowForm").submit();
	                }
	            });
}

function updateborrow(borrowid){
	var url="${request.contextPath}/mangerAction!toPage?pageName=update&borrowId="+borrowid;
			$('#iframe_window_idt').attr("src",url).width(700).height(300);
			$('#qwindow_maskt').show();
			$('#qwindowt').show();
}


	
function hiddeniframes(){
				$('#qwindow_maskt').hide();
				$('#qwindowt').hide();
}
			
function hiddeniframesandsub(){
				$('#qwindow_maskt').hide();
				$('#qwindowt').hide();
				$("#borrowForm").submit();
}
$(function(){
	$('#source').val('${bf.source!}');
	$('#status').val('${bf.status!}');
})
</script>
