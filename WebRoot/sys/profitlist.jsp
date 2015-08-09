<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>内容价值探索-首页</title>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/jquery.js"></script>
  <head>
    <title>My JSP 'profitlist.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="CVE.css" rel="stylesheet" type="text/css" />
	<script>
		$(function(){ 
			$('#tiepianMan').click(function(){
				$('#tiepianManDiv').show();
				$('#otherManDiv').hide();
			});
			$('#otherMan').click(function(){
				$('#tiepianManDiv').hide();
				$('#otherManDiv').show();
			});
			$('#addTP').click(function(){
				$('#qwindow_mask').show();
				$('#qwindow').show();
			});
		});
	</script>
  </head>
  <body id="user">
	<jsp:include page="../top.jsp"></jsp:include>
    <div class="content">
        <div class="subNav">
            <ul>
                <li id="tiepianMan" style="left:15px;" class="current">贴片单价管理</li>
                <li id="otherMan" style="left:130px;">衍生/其它收入</li>
            </ul>
        </div>
    	<div class="model" >
            <!--贴片单价管理-->
            <div id="tiepianManDiv">
        	<div class="oprate">
                <ul class="subOpr">
                    <li id="addTP" class="hover">添加贴片单价</li>
                    <li class="br">下载单价</li>
                </ul> 
                <ul class="search">
                    <li>
                    	<select name="">
                        	<option>全部频道</option>
                        	<option>电视剧</option>
                        	<option>电影</option>
                        	<option>综艺</option>
                        	<option>动漫</option>
                        </select>
                    </li>
                    <li>
                    	<select name="">
                        	<option>全部终端</option>
                        	<option>移动</option>
                        	<option>PC</option>
                        </select>
                    </li>
                    <li><input name="" type="text" value="生效时间" class="defText data"/></li>
                    <li><input name="" type="text" value="失效时间" class="defText data"/></li>
                </ul> 
            </div>
            <div class="space"></div>
            <div class="datatbl">
                <table>
                    <tr class="bg">
                        <th>频道</th>
                        <th>生效日期</th>
                        <th>失效日期</th>
                        <th>PC贴片单价(元)</th>
                        <th>移动贴片单价(元)</th>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                </table>
            </div>
            <div class="space"></div>
            </div>
            
            <!--其它/衍生收入管理-->
            <div id="otherManDiv" class="hidden">
            <div class="oprate">
                <ul class="subOpr">
                    <li class="hover">添加收入</li>
                    <li class="br">下载单价</li>
                </ul> 
                <ul class="search">
                    <li>
                    	<select name="">
                        	<option>全部频道</option>
                        	<option>电视剧</option>
                        	<option>电影</option>
                        	<option>综艺</option>
                        	<option>动漫</option>
                        </select>
                    </li>
                    <li><input name="" type="text" value="生效时间" class="defText data"/></li>
                    <li><input name="" type="text" value="失效时间" class="defText data"/></li>
                    <li class="br show"><input name="" type="text" value="输入节目名称" class="defText show"/><span></span></li>
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
                        <th>收入类型</th>
                    </tr>
                    <tr>
                        <th></th>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                </table>
            </div>
        </div>
        </div>
    </div>
    <div id="qwindow_mask" class="qwindow_mask hidden" style="opacity: 0.5;z-index:30000;width:1349px;height:800px;background-color: rgb(84, 84, 84);"></div>
    <div id="qwindow" class="qwindow hidden" style="top:71px; left:393px;z-index:30000;opacity:1;visibility:visible;">
    	<iframe frameborder="0" scrolling="no" src="sys/addPrice.html" width="500" height="200"></iframe>
    </div>
</body>
</html>

