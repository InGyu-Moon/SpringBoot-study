<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
    <title>Insert title here</title>
</head>
<body>
<div style="margin: 100px 100px;">
    <h2>Market정보 입력하기</h2>
    <form action="update" method="post" enctype="multipart/form-data">
        <input type="hidden" name="num" value="${dto.num}">
        <table class="table table-bordered" style="width: 500px;">
            <tr>
                <th width="100" class="table-light">상품명</th>
                <td>
                    <input type="text" name="sang" class="form-control"
                           style="width: 130px;" required="required" value="${dto.sang}">
                </td>
            </tr>

            <tr>
                <th width="100" class="table-light">단가</th>
                <td>
                    <input type="text" name="dan" class="form-control"
                           style="width: 150px;" value="${dto.dan}" required="required">
                </td>
            </tr>

            <tr>
                <th width="100" class="table-light">상품이미지</th>
                <td>
                    <input type="file" name="photo" class="form-control"
                           style="width: 200px;" value="../photo/${dto.photoname}">
                </td>
            </tr>

            <tr>
                <td colspan="2" align="center">
                    <button type="submit" class="btn btn-info">저장</button>
                    <button type="button" class="btn btn-success"
                            onclick="location.href='list'">목록</button>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>