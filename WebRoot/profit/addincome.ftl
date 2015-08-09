<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>内容价值探索-首页</title>
<script type="text/javascript" src="../js/jquery-1.3.2.min.js"></script>
<link href="../CVE.css" rel="stylesheet" type="text/css" />
<style>
.addincome{width:700px;height:600px;}
</style>
<script type="text/javascript">
$(function(){
$("#submitbtids").click(function(){
	$("#fileType").val("income");
	$("#formids").submit();
	})
})	
</script>
</head>
<body>
<form id="formids" name="uploadfileForm" action="profitAction!uploadfile.action" method="post" enctype="multipart/form-data">
	<div class="addbox addincome">
    	<div class="title">添加衍生/其它收入</div>
    	<input type="text" class="hidden" id="fileType" name="fileType" >
        <div class="addcon">
        	<ul>
            	<li>
                	<input name="uploadFile" type="file" class="upload">
                </li>
            </ul>
            <p class="ps">*请上传excel文件格式文档</p>
        </div>
        <div class="btncon">
        	<input type="button" id="submitbtids" value="上传" class="save" onclick="aa();"/>
        	<input type="button" value="取消" class="cancel ml10" onclick="window.parent.hiddeniframes()"/>
        </div>
    </div>
</form>
</body>
</html>
<script>
function aa(){
alert(1);
}
</script>
