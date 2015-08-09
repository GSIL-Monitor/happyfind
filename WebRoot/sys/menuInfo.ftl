<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>内容价值探索-首页</title>
<link href="${request.contextPath}/CVE.css" rel="stylesheet" type="text/css" />
</head>

<body id="user">
	<div class="top">
    	<div class="logo"></div>
        <ul>
        	<li>内容探索</li>
        	<li class="current">财务指标管理</li>
        	<li>用户权限管理</li>
        	<li>版权数据同步</li>
        </ul>
        <div class="login">
        	<span class="userIcon"></span>
        	<span>曲滋&nbsp;您好</span>
            <span>|</span>
        	<a href="#">退出</a>
        </div>
    </div>
    <div class="content">
        <div class="subNav">
            <ul>
                <li style="left:15px;" class="current">用户列表</li>
                <li style="left:130px;">用户权限</li>
            </ul>
        </div>
    	<div class="model">
        	<!--用户列表-->
            <div class="oprate">
                <ul class="search fl">
                    <li class="show"><input name="" type="text" value="输入用户姓名/邮箱" class="defText show"/><span></span></li>
                    <li>
                    	<select name="">
                        	<option>所属团队</option>
                        	<option>电视剧</option>
                        	<option>电影</option>
                        	<option>综艺</option>
                        	<option>动漫</option>
                        </select>
                    </li>
                    <li class="br">
                    	<select name="">
                        	<option>用户角色</option>
                        	<option>电视剧</option>
                        	<option>电影</option>
                        	<option>综艺</option>
                        	<option>动漫</option>
                        </select>
                    </li>
                </ul> 
            </div>
            <div class="space"></div>
            <div class="datatbl">
                <table>
                    <tr class="bg">
                        <th>姓名</th>
                        <th>邮箱</th>
                        <th>所属团队</th>
                        <th>开通频道</th>
                        <th>开通状态</th>
                        <th>用户角色</th>
                        <th>操作</th>
                    </tr>
                    <tr>
                        <th>曲滋</th>
                        <td>quzi@youku.com</td>
                        <td>大数据分析</td>
                        <td>电视剧、电影、综艺、动漫、PGC</td>
                        <td>待开通</td>
                        <td>产品经理</td>
                        <th><a href="#">开通</a><a href="#" class="ml10">拒绝</a></th>
                    </tr>
                    <tr>
                        <th>钟智群</th>
                        <td>quzi@youku.com</td>
                        <td>大数据分析</td>
                        <td>电视剧、电影、综艺、动漫、PGC</td>
                        <td>待开通</td>
                        <td>开发经理</td>
                        <th><a href="#">修改</a><a href="#" class="ml10">删除</a><a href="#" class="ml10">失效</a></th>
                    </tr>
                </table>
            </div>
        	<!--用户权限-->
            <div class="oprate">
                <ul class="subOpr">
                    <li class="br">添加用户角色</li>
                </ul> 
            </div>
            <div class="space"></div>
            <div class="datatbl">
                <table style="width:60%">
                    <tr class="bg">
                        <th>角色名称</th>
                        <th>操作</th>
                    </tr>
                    <tr>
                        <th>运营</th>
                        <th><a href="#">修改</a><a href="#" class="ml10">删除</a></th>
                    </tr>
                </table>
            </div>
        </div>
    </div>
    
	<div class="qwindow_mask hidden" style="opacity: 0.5;z-index:30000;width:1349px;height:800px;background-color: rgb(84, 84, 84);"></div>
    <div class="qwindow hidden" style="top:71px; left:393px;z-index:30000;opacity:1;visibility:visible;">
    	<iframe frameborder="0" scrolling="no" src="addincome.html" width="500" height="200"></iframe>
    </div>
</body>
</html>
