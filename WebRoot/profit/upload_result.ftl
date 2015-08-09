<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>内容价值探索-首页</title>
<link href="${request.contextPath}/CVE.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${request.contextPath}/js/jquery-1.3.2.min.js"></script>
</head>

<body>
	<div class="addbox addcopyright">
    	<div class="title">上传结果</div>
    	<div class="addcon">
        	<ul>
            	<li>
                    <label>${returnmsg}</label>
                </li>
            </ul>
        </div>
        <div class="btncon">
        	<input type="button" id="submitbtid" value="确定" class="save" onclick="window.parent.hiddeniframesandsub()"/>
        </div>
    </div>
</body>
</html>
