<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>修改画品</title>
	<link href="style/common.css" type="text/css" rel="stylesheet">
        <link href="style/add.css" type="text/css" rel="stylesheet">
</head>
<body>
	<div class="header">
			<div class="logo f1">
				<img src="image/logo.png">
			</div>
			<div class="auth fr">
				
			</div>
	</div>
        <div class="content">
		<div class="addwrap">
			<div class="addl fl">
				<header>修改画品</header>
				
				<form action="UpdateArtServlet" method="POST"  enctype="multipart/form-data">
					<div class="additem">
						<label>画品名称</label><input type="text"  name="art_name" placeholder="请输入商品名称" value="${sessionScope.art.art_name }">
						<input type="hidden"  name="art_id" value="${sessionScope.art.art_id }">
					</div>
					<div class="additem">
						<label>价值</label><input type="text" name="art_price" value="${sessionScope.art.art_price }">
					</div>
					<div class="additem">
						<label>缩略图</label>
						<input type="hidden" name = "file_name" value = "${sessionScope.art.art_cover }">
						<input type="file" name="art_cover" >
					</div>
					<div class="additem textwrap">
						<label class="ptop">画品简介</label><textarea name="art_introduction">${sessionScope.art.art_introduction }</textarea>
					</div>
					<div class="additem textwrap">
						<label class="ptop">画品详情</label><textarea  name="art_detail">${sessionScope.art.art_detail }</textarea>
					</div>
					<button type="submit">发布</button>
				</form>
				
			</div>
			<div class="addr fr">
				<img src="image/index_banner.png">
			</div>
		</div>
		
	</div>
        <div class="footer">
            <p><span>M-GALLARY</span>©2017 POWERED BY IMOOC.INC</p>
        </div>

</body>
</html>