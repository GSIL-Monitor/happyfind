<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>乐寻管理平台-添加领赏信息</title>
<script type="text/javascript" src="${request.contextPath}/js/jquery-1.3.2.min.js"></script>
<script language="javascript" type="text/javascript" src="${request.contextPath}/js/My97DatePicker/WdatePicker.js"></script>
<link href="${request.contextPath}/CVE.css" rel="stylesheet" type="text/css" />
<style>
.addPrice{width:700px;height:600px;}
</style>
</head>

<body>
	<div class="addbox addPrice">
    	<div class="title">添加领赏信息</div>
    	 <form id="getrewardform"  method="post">
        <div class="addcon">
        	<ul id="litable">
        	 <input name="grf.moduser" value="admin" class="hide" >
        	 <input name="grf.id" value="${grf.id!}" class="hide" >
        	  <input name="grf.rewardId" value="${rewardId!}" class="hide" >
        	 <div class="datatbl">
                	<table>
                    	<tr class="bg">
                        	<th>领赏人姓名</th>
                        	<td> <input name="grf.getrewardname" class="defText1" value="${grf.getrewardname!}"></td>
                        	<th>领赏人联系方式</th>
                        	<td> <input name="grf.getrewardnumber" class="defText1" value='${grf.getrewardnumber!}'></td>
                        </tr>
                        <tr class="bg">
                        	<th>领赏人填写被悬赏人联系方式1</th>
                        	<td> <input name="grf.contactnumber1" class="defText1" value="${grf.contactnumber1!}"></td>
                        	<th>领赏人填写被悬赏人联系方式2</th>
                        	<td> <input name="grf.contactnumber2" class="defText1" value="${grf.contactnumber2!}"></td>
                        </tr>
                         <tr class="bg">
                        	<th>领赏人填写被悬赏人联系方式1</th>
                        	<td> <input name="grf.contactnumber3" class="defText1" value="${grf.contactnumber3!}"></td>
                        	<th> </th>
                        	<td> </td>
                        </tr>                      
                    </table>
                </div>
            </ul>
        </div>
        <div class="btncon">
        	<input type="button" value="保存" class="cancel ml10" onclick="subGetReward();"/>
        	<input type="button" value="取消" class="cancel ml10" onclick="window.parent.hiddeniframes()"/>
        </div>
        </form>
    </div>
</body>
</html>
<script>
	function subGetReward(){
		$.ajax({
	                cache: true,
	                type: "POST",
	                url:"${request.contextPath}/GetRewardAction!addGetReward.action",
	                data:$('#getrewardform').serialize(),// 你的formid
	                async: false,
	                error: function(request) {
	                    alert("添加失败！");
	                },
	                success: function(data) {
	                	alert('添加成功！');
	                	window.parent.hiddeniframesandsub(); 
	                }
	            });
		}
</script>
