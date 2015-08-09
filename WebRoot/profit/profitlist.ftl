<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>内容价值探索-首页</title>
<script type="text/javascript" src="${request.contextPath}/js/jquery-1.3.2.min.js"></script>
<link href="${request.contextPath}/CVE.css" rel="stylesheet" type="text/css" />
<script>
$(document).ready(function(){
			$('#tiepianMan').click(function(){
				$('#tiepianManDiv').show();
				$('#otherManDiv').hide();
				$('#tiepianMan').addClass("current");
				$('#otherMan').removeClass("current");
				$("#pageType").val("tiepianMan");
			});
			$('#otherMan').click(function(){
				$('#tiepianManDiv').hide();
				$('#otherManDiv').show();
				$('#otherMan').addClass("current");
				$('#tiepianMan').removeClass("current");
				$("#pageType").val("otherMan");
			});
			$('#addTP').click(function(){
				var url="${request.contextPath}/profit/addPrice.ftl";
				$('#iframe_window_idt').attr("src",url).width(700).height(300);
				$('#qwindow_maskt').show();
				$('#qwindowt').show();
			});
			
			$('#addSr').click(function(){
				var url="${request.contextPath}/profit/addincome.ftl";
				$('#iframe_window_idt').attr("src",url).width(700).height(300);
				$('#qwindow_maskt').show();
				$('#qwindowt').show();
			});
			var pagev = '${pageType!}';
			if(pagev=='otherMan'){
				$("#otherMan").trigger("click")
			}else{
				$("#tiepianMan").trigger("click")
			}
			
		});
		
		function hiddeniframes(){
				$('#qwindow_maskt').hide();
				$('#qwindowt').hide();
			}
			
		function hiddeniframesandsub(){
				$('#qwindow_maskt').hide();
				$('#qwindowt').hide();
				$("#incomeForm").submit();
		}
		
			
		
</script>
</head>
  <body id="user">
	<#include "../top.ftl">
    <div class="content">
        <div class="subNav">
            <ul>
                <li id="tiepianMan" style="left:15px;" class="current" >贴片单价管理</li>
                <li id="otherMan" style="left:130px;"  >衍生/其它收入</li>
            </ul>
        </div>
         <form id="incomeForm" method="post" action="${request.contextPath}/profitAction!profitlist">
         <input class="hidden" id="pageType" value="${pageType!}" name="pageType">
    	<div class="model" >
            <!--贴片单价管理-->
            <div id="tiepianManDiv" >
        	<div class="oprate">
                <ul class="subOpr">
                    <li id="addTP" class="hover" >添加贴片单价</li>
                    <li class="br">下载单价</li>
                </ul> 
                <ul class="search">
                    <li>
                    	<select name="dictAdPrice.channelId" id="channelId" onchange="sumbchaxun()">
                        	<option value="1" >电视剧</option>
		                	<option value="2">电影</option>
		                	<option value="3">动漫</option>
		                	<option value="4">综艺</option>
		                	<option value="5">PGC</option>
                        </select>
                    </li>
                    <li>
                    	<select name="dictAdPrice.systypeId" id="systypeId" onchange="sumbchaxun()"><option value='1'>PC web</option>
		                	<option value='2'>移动 web</option>
		                	<option value='3'>PC app</option>
		                	<option value='4'>移动 app</option>
		                </select>
                    </li>
                     <li><input name="dictAdPrice.startTime" type="text" value="${dictAdPrice.endTime!}" class="data defText" /></li>
	                 <li> <input name="dictAdPrice.endTime" type="text" value="${dictAdPrice.endTime!}" class="data defText"/></li>
                </ul> 
                </form>
            </div>
            <div class="space"></div>
            <div class="datatbl">
                <table>
                    <tr class="bg">
                    	<th>站点</th>
                        <th>频道</th>
                        <th>终端</th>
                        <th>生效日期</th>
                        <th>失效日期</th>
                        <th>贴片单价(元)</th>
                    </tr>
                     <#list list as dict>
                    <tr>
                        <td>${dict.siteName!}</td>
                        <td>${dict.channelName!}</td>
                         <td>${dict.systypeName!}</td>
                        <td>${dict.startTime!}</td>
                        <td>${dict.endTime!}</td>
                        <td>${dict.price!}</td>
                        <th>
                    </tr>
                     </#list>
                </table>
            </div>
            <div class="space"></div>
            </div>
            
            <!--其它/衍生收入管理-->
            <div id="otherManDiv" class="hidden">
            <div class="oprate">
                <ul class="subOpr">
                    <li class="hover" id="addSr">添加收入</li>
                    <li class="br">下载单价</li>
                </ul> 
                <ul class="search">
                    <li>
                    	<select name="income.channelId" id="channelId" onchange="sumbchaxun()">
                        	<option value="1" >电视剧</option>
		                	<option value="2">电影</option>
		                	<option value="3">动漫</option>
		                	<option value="4">综艺</option>
		                	<option value="5">PGC</option>
                        </select>
                    </li>
                    <li><input name="income.stratTime" type="text" value="${income.stratTime!}" class="defText data"/></li>
                    <li><input name="income.endTime" type="text" value="${income.endTime!}" class="defText data"/></li>
                    <li class="br show"><input name="income.showName" type="text" value="输入节目名称" class="defText show"/><span></span></li>
                </form>
                </ul> 
            </div>
            <div class="space"></div>
            <div class="datatbl">
                <table>
                    <tr class="bg">
                        <th>剧集</th>
                        <th>频道</th>
                        <th>生效日期</th>
                        <th>失效日期</th>
                        <th>收入(元)</th>
                    </tr>
                     <#list incomelist as income>
                    <tr>
                        <td>${income.showName!}</td>
                        <td>${income.channelName!}</td>
                        <td>${income.startTime!}</td>
                        <td>${income.endTime!}</td>
                        <td>${income.income!}</td>
                        <th>
                    </tr>
                     </#list>
                </table>
            </div>
        </div>
        </div>
    </div>
    <div id="qwindow_maskt" class="qwindow_mask " style="opacity: 0.5;z-index:30000;width:1349px;height:800px;background-color: rgb(84, 84, 84);"></div>
    <div id="qwindowt" class="qwindow " style="top:71px; left:393px;z-index:30000;opacity:1;visibility:visible;">
    	<iframe id="iframe_window_idt" frameborder="0" scrolling="no" src="" ></iframe>
    </div>
</body>
</html>
<script>
function sumbchaxun(){
	$("#incomeForm").submit();
}
</script>

