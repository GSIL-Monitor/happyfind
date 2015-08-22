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
                	<li class="current">领赏列表</li> 
                </ul>
     </div>
     <div class="space"></div>
    	<div class="mode">
	    	<div class="theme">
	    	<form id="getrewardForm" method="post" action="${request.contextPath}/GetRewardAction!toPageList?pageName=getreward">
	    	<span class="title">
	                	姓名：<input name="grf.name" type="text" value="${grf.name!}" class="defText1">
	                	身份证号码：<input name="grf.idCard" type="text" value="${grf.idCard!}" class="defText1">
	                	</span>
            			<input type="button" id="submitbtidborrow" class="btn" value="查&nbsp;&nbsp;&nbsp;询" onclick="subgetreward()"/>
            			<input type="button" id="submitbtidborrow" class="btn " value="添加信息"  onclick="addgetreward()"/>
            </form>
            	
	         </div>
                <div class="datatbl">
                	<table>
                    	<tr class="bg">
                        	<th>姓名</th>
                        	<th>身份证号码</th>
                        	<th>悬赏金额</th>
                        	<th>领赏人填写被悬赏人联系方式1</th>
                        	<th>领赏人填写被悬赏人联系方式2</th>
                        	<th>领赏人填写被悬赏人联系方式3</th>
                        	<th>操作</th>
                        </tr>
                        <#list getrewardlist as getreward>
                    <tr>
                        <td>${getreward.name!}</td>
                        <td>${getreward.idCard!}</td>
                        <td>${getreward.rewardamount!}</td>
                        <td>${getreward.contactnumber1!}</td>
                        <td>${getreward.contactnumber2!}</td>
                        <td>${getreward.contactnumber3!}</td>
                        <td><img src="image/0812309.png" class="update" onclick="updategetreward('${getreward.id!}')" title="修改"></img>
                        		<img src="image/delete.png" class="delete" onclick="deletegetreward('${getreward.id!}')"  title="删除"></img></td>
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
function subgetreward(){
	$("#getrewardForm").submit();
}

function addgetreward(){
			var url="${request.contextPath}/RewardAction!toPage?pageName=addReward";
			$('#iframe_window_idt').attr("src",url).width(700).height(300);
			$('#qwindow_maskt').show();
			$('#qwindowt').show();
}

function deletegetreward(getrewardid){
			$.ajax({
	                cache: true,
	                type: "POST",
	                url:"${request.contextPath}/GetRewardAction!deleteGetReward.action?getrewardId="+getrewardid,
	                async: false,
	                error: function(request) {
	                    alert("删除失败！");
	                },
	                success: function(data) {
	                	alert('删除成功！');
	                	$("#getrewardForm").submit();
	                }
	            });
}

function updategetreward(getrewardid){
	var url="${request.contextPath}/GetRewardAction!toPage?pageName=update&getrewardId="+getrewardid;
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
				$("#getrewardForm").submit();
}
</script>
