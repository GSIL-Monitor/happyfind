<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>内容价值探索-首页</title>
<link href="${request.contextPath}/CVE.css" rel="stylesheet" type="text/css" />
</head>
<body id="index">
	<div class="top">
    	<div class="logo"></div>
        <div class="login">
        	<a href="#">登录</a>
            <span>|</span>
        	<a href="#">申请权限</a>
        </div>
    </div> 
    <div class="content" style="text-align: center;">
    <form action="sysUserAction!updateUser.action" method="post">
    </br>
    <table>
    <tr><td>user_id:</td><td><input type="text" size="20"  name="user.userId" value="${user.userId}" /></td></tr>
    <tr><td>username:</td><td><input type="text" size="20" name="user.username" value="${user.username}" /></td></tr>
    <tr><td>password:</td><td><input type="text" size="20"  name="user.password" value="${user.password}" /></td></tr>
    <tr><td>email:</td><td><input type="text" size="50"  name="user.email" value="${user.email}" /></td></tr>
    <tr><td colspan="2"><input type="submit" value="提交"/></td></tr>
    </table>
   	</form>
   	</div>
</body>
</html>
