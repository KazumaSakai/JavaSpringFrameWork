<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
	<!-- Head -->
	<head>
		<title>Home</title>
		<meta charset="utf-8">
		<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet"/>
	</head>
	
	<!-- Body -->
	<body>
		<!-- Header -->
		<header>
			<p class="siteTitle">ChatService</p>
			
			<ul class="headerMenu">
				<li onclick="location.href='./'">ホーム</li>
				<li>
					<ul class="dropDownMenu">
						<li onclick="location.href='./'">チャットルーム</li>
						<li onclick="location.href='./'">雑談</li>
						<li onclick="location.href='./'">コンピューター</li>
						<li onclick="location.href='./'">プログラミング</li>
					</ul>
				</li>
				<li>
					<ul class="dropDownMenu">
						<li onclick="location.href='./'">ユーザー</li>
						<li onclick="location.href='./'">ログイン</li>
						<li onclick="location.href='./'">ログアウト</li>
					</ul>
				</li>
			</ul>
		</header>
		
		<!-- Main -->
		<div id="main">
			<div>
				
			</div>
		</div>
		
		<!-- Footer -->
		<footer>
			This WebSite created by KazumaSakai
		</footer>
	</body>
</html>
