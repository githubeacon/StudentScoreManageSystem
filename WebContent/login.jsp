<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>

<script type="text/javascript" src="dist/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="dist/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="dist/css/bootstrap.min.css">
<style type="text/css">
body {
	background: url(dist/images/bg.png) no-repeat;
	position: relative;
}

.jz {
	margin: 0 auto;
}

.zuo {
	float: left;
}

.you {
	float: right;
}

.clear {
	clear: both;
}

.div-form {
	background: rgba(255, 255, 255, 0.5);
	width: 480px;
	height: 300px;
	position: absolute;
	top: 50px;
	right: 400px;;
	padding: 10px;
}

label {
	height: 34px;
	line-height: 34px;
}

.form-group input {
	width: 319px;
}

#validateCode {
	width: 120px;
}
</style>
</head>
<body>
	<div class="div-form jz">
		<form action="/sms1/login_login.action" method="post" id="f1">
			<table style="margin-top: 50px; margin-left: 80px">
				<tr>
					<td><label for="">用户名:</label></td>
					<td><input type="text" name="userName" id="userName"
						class="form-control" value="" placeholder="请输入用户名" /></td>
				</tr>
				<tr>
					<td><label for="">密码:</label></td>
					<td><input type="password" name="password" id="password"
						class="form-control" placeholder="请输入密码" value="" /></td>
				</tr>
				<tr>
					<td><label for="">验证码:</label></td>
					<td><input type="text" name="validateCode" id="validateCode"
						class="form-control" value="" 
						placeholder="请输入验证码" /></td>
					<td><img src="/sms1/ValidateCode?action=generate"
						id="validateImage" onclick="changeCode()"
						style="margin-left: -50px" alt="点击更换验证码" /></td>
				</tr>
				<tr>
					<td><div class="btn btn-primary" id="login">登录</div></td>
					<td><div class="btn btn-default"  onclick="reset()">重置</div></td>
				</tr>
			</table>
			<!--<div class="form-group">
					<label for="userName" class="col-sm-3">用户名:</label>
					<input type="text" name="" id="" value="" class="form-control" placeholder="请输入用户名"/>	
				</div>
				<div class="form-group">
					<label for="password" class="col-sm-3">密码:</label>
					<input type="password" name="" id="" value="" class="form-control" placeholder="请输入密码"/>	
				</div>
				<div class="form-group">
					<label for="validateCode" class="col-sm-3">验证码:</label>
					<input type="text"  class="zuo form-control"id="validateCode" placeholder="请输入验证码" />
					<img src="" class="zuo" alt="点击更换验证码"  />
				</div>
				<div class="form-group clear ">
					<input type="button" name="" id="" value="登录" class="btn btn-primary " />
				</div>-->
		</form>
	</div>

</body>
<script type="text/javascript">
	$(function() {
		$("#login").on("click", function() {
			var userName = $("#userName").val();
			var password = $("#password").val();
			var validateCode = $("#validateCode").val();
			if (userName == null || userName.trim() == "") {
				alert("用户名不能为空!");
				return;
			}
			if (password == null || password.trim() == "") {
				alert("密码不能为空!");
				return;
			}
			if (validateCode == null || validateCode.trim() == "") {
				alert("验证码不能为空!");
				return;
			}
			var data = {
				"userName" : userName,
				"password" : password,
				"validateCode" : validateCode
			};
			 $.post("/sms1/login_check.action", data, function(data) {
				if (data != null && data.trim() != "") {
					alert(data);
					reset();
					changeCode();
					
				} else {
					$("#f1").submit();
				}

			}); 
		
		});
	});
	function reset(){
		$("#userName").val("");
		$("#password").val("");
		$("#validateCode").val("");
		}
	function changeCode() {
		$("#validateImage").attr("src",
				"/sms1/ValidateCode?action=generate&random=" + Math.random());
	}

</script>
</html>