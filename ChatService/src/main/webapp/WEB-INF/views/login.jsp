<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
	<!-- Head -->
	<head>
		<title>Login</title>
		<meta charset="utf-8">
		<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet"/>
	</head>
	<!-- Body -->
	<body>
		<!-- Header -->
		<header>
			<p class="siteTitle">ChatService</p>
			
			<ul class="headerMenu">
				<li onclick="location.href='${root}/'"><label>ホーム</label></li>
				<li>
					<ul class="dropDownMenu">
						<li onclick="location.href='${root}/'"><label>チャットルーム</label></li>
						<li onclick="location.href='${root}/'"><label>雑談</label></li>
						<li onclick="location.href='${root}/'"><label>コンピューター</label></li>
						<li onclick="location.href='${root}/'"><label>プログラミング</label></li>
					</ul>
				</li>
				<li>
					<ul class="dropDownMenu">
						<li onclick="location.href='${root}/"><label>ユーザー</label></li>
						<li onclick="location.href='${root}/User/Login'"><label>ログイン</label></li>
						<li onclick="location.href='${root}/User/Logout'"><label>ログアウト</label></li>
					</ul>
				</li>
			</ul>
		</header>
		
		<!-- Main -->
		<div id="main">
			<div>
				<form action="Login" method="post">
					<table class="inputFormTable">
						<tr>
							<td><input type="text" name="loginId" /></td>
						</tr>
						<tr>
							<td><input type="password" name="password" /></td>
						</tr>
						<tr>
							<td><input type="submit" value="ログイン" /></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		
		<!-- Footer -->
		<footer>
			This WebSite created by KazumaSakai
		</footer>
	</body>
</html>
