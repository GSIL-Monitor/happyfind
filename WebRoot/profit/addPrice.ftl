<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>内容价值探索-首页</title>
<script type="text/javascript" src="../js/jquery-1.3.2.min.js"></script>
<link href="../CVE.css" rel="stylesheet" type="text/css" />
<style>
.addPrice{width:700px;height:600px;}
</style>
</head>

<body>
	<div class="addbox addPrice">
    	<div class="title">添加贴片单价</div>
        <div class="addcon">
        	<ul id="litable">
        	 <form id="priceform"  method="post">
        	 <input name="dictAdPrice.subUser" value="niuxiao">
            	<li>
            		<select name="dictAdPrice.siteId"><option value="1" >优酷</option>
                	<option value="2">土豆</option></select>
                	<select name="dictAdPrice.channelId"><option value="1" >电视剧</option>
                	<option value="2">电影</option>
                	<option value="3">动漫</option>
                	<option value="4">综艺</option>
                	<option value="5">PGC</option></select>
                	<select name="dictAdPrice.systypeId"><option value='1'>PC web</option>
                	<option value='2'>移动 web</option>
                	<option value='3'>PC app</option>
                	<option value='4'>移动 app</option></select>
                    <input name="dictAdPrice.startTime" type="text" value="" class="data defText" />
                    <input name="dictAdPrice.endTime" type="text" value="" class="data defText"/>
                    <input name="dictAdPrice.price" type="text" value="" class="price defText"/>
                </li>
            </ul>
            <p class="addbtn">+添加新单价</p>
        </div>
        <div class="btncon">
        	<input type="button" value="保存" class="cancel ml10" onclick="subPrice();"/>
        	<input type="button" value="取消" class="cancel ml10" onclick="window.parent.hiddeniframes()"/>
        </div>
        </form>
    </div>
</body>
</html>
<script>
	function subPrice(){
		$.ajax({
	                cache: true,
	                type: "POST",
	                url:"${request.contextPath}/profitAction!addprice.action",
	                data:$('#priceform').serialize(),// 你的formid
	                async: false,
	                error: function(request) {
	                    alert("添加失败！");
	                },
	                success: function(data) {
	                	alert('添加成功！');
	                	window.parent.hiddeniframes(); 
	                }
	            });
		}
</script>
