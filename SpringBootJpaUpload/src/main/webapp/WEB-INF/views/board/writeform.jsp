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
<div style="margin: 100px 100px; width: 500px;">
   <form action="add" method="post" enctype="multipart/form-data">
      <table class="table table-bordered">
         <tr>
            <th class="table-warning" width="120">작성자</th>
            <td>
               <input type="text" name="writer" required="required"
                      class="form-control" style="width: 130px;">
            </td>
         </tr>

         <tr>
            <th class="table-warning" width="120">제목</th>
            <td>
               <input type="text" name="subject" required="required"
                      class="form-control" style="width: 280px;">
            </td>
         </tr>

         <tr>
            <th class="table-warning" width="120">사진</th>
            <td>
               <input type="file" name="upload"
                      class="form-control" style="width: 250px;">
            </td>
         </tr>
         <tr>
            <td colspan="2">
            <textarea style="width: 480px; height: 150px;"
                      name="content" required="required" class="form-control"></textarea>
            </td>
         </tr>

         <tr>
            <td colspan="2" align="center">
               <button type="submit" class="btn btn-info" style="width: 100px;">저장</button>
               <button type="button" class="btn btn-info" style="width: 100px;"
                       onclick="location.href='list'">목록</button>
            </td>
         </tr>
      </table>
   </form>
</div>
</body>
</html>