<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>内容价值探索-首页</title>

<link href="${request.contextPath}/CVE.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/jquery-1.3.2.min.js"></script>
</head>
<script type="text/javascript">

$(document).ready(function(){
	$("#submitbtid").click(function(){
	var showids='';
	//取得当前所选择的showid
	 $("span[id]").each(function(){
          showids+=$(this).attr("id")+",";  
	});
	
	var page="${page?default('overview')}";
	var siteid="${siteid?default('1')}";
	
	var url="rpAction!report.action?showids="+showids+"&siteid="+siteid+"&page="+page;
	
	alert(url);
	 $("#iframe_id").attr("src",url);
	});
});

function showreport(page)
{
	var page="${page?default('overview')}";
	var siteid="${siteid?default('1')}";
	
	var url="rpAction!report.action?showids="+showids+"&siteid="+siteid+"&page="+page;
	
	alert(url);
	 $("#iframe_id").attr("src",url);
}

$("#ID >div").each(function(){
          alert($(this).attr("id"));  //打印子div的ID
});

function openRghpage(id){
  	var url="${request.contextPath}/userAction!openRghpage.action?id="+id;
  	openiframe(url,400,500);
}

function submitform(){
	$("#formid").submit()
}

</script>
<body id="value">
	<#include "../top.ftl">
    <div class="content">

	<div class="left">
        	<div class="tab">
            	<ul>
                	<li class="current">电视剧</li>
                    <li>电影</li>
                    <li>综艺</li>
                    <li>动漫</li>
                </ul>
            </div>
            <div class="space"></div>
            <!--片库剧-->
            <div class="showList old">
            	<ul>
                	<li class="addshow">+ 添加剧集</li>
                    <li class="inputshow hidden">
                    	<input name="" type="text" />
                        <div class="inputList">
                        	<dl>
                            	<dd><a href="#" title="那些年我们一起追过的女孩">那些年我们一起追过的女孩完整版DVD</a></dd>
                            	<dd><a href="#" title="那些年我们一起追过的女孩">那些年我们一起追过的女孩完整版DVD</a></dd>
                            	<dd><a href="#" title="那些年我们一起追过的女孩">那些年我们一起追过的女孩完整版DVD</a></dd>
                            	<dd><a href="#" title="那些年我们一起追过的女孩">那些年我们一起追过的女孩完整版DVD</a></dd>
                            </dl>
                        </div>
                    </li>
                    <li class="ctg"><p>热播剧</p></li>
                	<li><span id="1">何以笙箫何</span><i class="one"></i><em></em></li>
                	<li><span id="2">千金女贼</span><i class="two"></i><em></em></li>
                	<li><span id="3">武媚娘传奇</span><i class="three"></i><em></em></li>
                	<li><span id="4">石敢当</span><i class="four"></i><em></em></li>
                	<li><span id="5">封神英雄</span><i class="five"></i><em></em></li>
                	
                    <li class="ctg"><p>片库</p></li>
                	<li><span>何以笙箫何以</span><i class="one"></i><em></em></li>
                	<li><span>千金女贼</span><i class="two"></i><em></em></li>
                	<li><span>武媚娘传奇</span><i class="three"></i><em></em></li>
                	<li><span>石敢当</span><i class="four"></i><em></em></li>
                	<li><span>封神英雄</span><i class="five"></i><em></em></li>
                	
                </ul>
                <div class="data hidden">
                	<p class="ml10 alydata current">时间:<span>2015年02月-2015年03月</span><i></i></p>
                    <div class="dataSel">
                    	<p><span class="ml10">起始:</span><select name="" class="ml10"><option>2013年</option></select><select name="" class="ml10"><option>1月</option></select></p>
                    	<p class="mt10"><span class="ml10">结束:</span><select name="" class="ml10"><option>2013年</option></select><select name="" class="ml10"><option>1月</option></select></p>
                        <p class="center mt10"><input type="button" class="btn" value="确定"/><input type="button" class="btn ml10" value="取消"/></p>
                    </div>
                </div>
            </div>
            <div class="selectShow">
            	<input type="button" id="submitbtid" class="btn" value="查&nbsp;&nbsp;&nbsp;询"/>
          </div>
      </div>
      <div class="right">
      	<div class="dataCon">
        	<div class="download down-hover">下载</div>
        	<div class="tab">
            	<ul>
                	<li class="current">价值总览</li>
                	<li> 流量</li>
                	<li>用户</li>
                	<li>收益</li>
                </ul>
            </div>
            <div class="space"></div>
            
            <div class="mode">
            	<div class="theme">
                	<span class="title">内容价值评估结果总览</span>
                    <span class="yt">查看平台：</span>
                    <a href="#" class="youku"></a>
                    <a href="#" class="tudou-h"></a>
                </div>
        		<iframe frameborder="0" id="iframe_id" scrolling="no" src="rpAction!report.action?page=traffic" class="cpRgt"></iframe>       
            </div>
        </div>
      </div>
    </div>
</body>
</html>
