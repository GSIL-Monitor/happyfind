<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>乐寻平台管理后台</title>
<link href="CVE.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script>
function openiframe(id,url){
	$("#iframe_id").attr("src",url);
	$("#"+id).addClass("current");
}

</script>
</head>

<body id="value">
	<div class="top">
    	<div class="logo"><h1>乐寻平台管理后台</h1></div>
    </div>
    <div class="content">
  	  <div class="left">
        	<div class="tab">
            	<ul>
                	<li class="current">=====管-理-菜-单=====</li>
                </ul>
            </div>
            <div class="space"></div>
            <!--片库剧-->
            <div class="showList old">
            	<ul>
                	<li onclick='openiframe("xindai","mangerAction!toPageList?pageName=borrow")'><span  id="xindai" >信贷信息录入</span><i class="four"></i></li>
                	<li><span>滚动数据设置</span><i class="four"></i></li>
                	<li><span>平台会员管理</span><i class="four"></i></li>
                	<li><span>个人举报审核</span><i class="four"></i></li>
                	<li><span>领赏信息审核</span><i class="four"></i></li>
                	<li><span>企业收费管理</span><i class="four"></i></li>
                	<li><span>平台账户查看</span><i class="four"></i></li>
                	<li><span>==========================</li>
                	<li onclick='openiframe("xindai","viewAction!toPageList?pageName=reward")'><span  id="xindai" >信贷信息录入</span><i class="four"></i></li>
                	
                </ul>
            </div>
      </div>
      
      <div class="right">
            <iframe src="" width="100%"  height="200px" frameborder="0" id="iframe_id" scrolling="no" class="cpRgt"></iframe>
      </div>
     
    </div>
</body>
</html>
<script>
$("#xindai").trigger("click");
$("#xindai").addClass("current");
</script>
