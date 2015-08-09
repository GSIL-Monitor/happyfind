<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>内容价值探索-首页</title>
<link href="${request.contextPath}/CVE.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${request.contextPath}/js/jquery-1.3.2.min.js"></script>
</head>


<script type="text/javascript">
jQuery(document).ready(function(){
	
	$("#submitbtid").click(function(){
	$("#formid").submit();
	});
	
	$("#cancelbtid").click(function(){
	 	parent.hiddeniframe(); 
	});
});
</script>

<body>
<form id="formid" name="uploadfileForm" action="crAction!uploadfile.action" method="post" enctype="multipart/form-data">
	<div class="addbox addcopyright">
    	<div class="title">添加版权数据</div>
        <div class="addcon">
        	<ul>
            	<li>
                    <label>上传频道</label>
                    <select name="channel">
                        <option value="tv">电视剧</option>
                        <option value="movie">电影</option>
                        <option value="variety">综艺</option>
                        <option value="cartoon">动漫</option>
                    </select>
                    <input name="uploadFile" type="file" class="upload"/>  
                </li>
            </ul>
            <p class="ps">*请上传excel文件格式文档</p>
        </div>
        <div class="btncon">
        	<input type="button" id="submitbtid" value="上传" class="save"/>
        	<input type="button" id="cancelbtid" value="取消" class="cancel ml10"/>
        </div>
    </div>
</form>
</body>
</html>
