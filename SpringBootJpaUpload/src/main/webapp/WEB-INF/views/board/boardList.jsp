<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<div style="margin: 100px 100px; width: 800px;">
    <button type="button" class="btn btn-outline-info"
            onclick="location.href='addform'">글쓰기</button>
    <br><br>
    <h5>총 ${count }개의 게시글이 있습니다</h5>
    <br>
    <table class="table table-bordered">
        <tr class="table-warning">
            <th width="80">번호</th>
            <th width="480">제목</th>
            <th width="180">작성자</th>
            <th width="220">작성일</th>

        </tr>

        <c:if test="${count==0 }">
            <tr>
                <td colspan="4" align="center">
                    <b>등록된 글이 없습니다</b>
                </td>
            </tr>
        </c:if>


        <c:if test="${count>0 }">
            <c:forEach var="dto" items="${list }" varStatus="i">
                <c:set var="n" value="${count-i.index }"/>
                <tr>
                    <td>${n }</td>
                    <td>
                        <a href="detail?num=${dto.num }">${dto.subject }</a>
                        <c:if test="${dto.photo!='no' }">
                            <i class="bi bi-image-fill" style="color: gray;"></i>
                        </c:if>
                    </td>
                    <td>${dto.writer }</td>
                    <td>
                        <fmt:formatDate value="${dto.writeday }" pattern="yyyy-MM-dd HH시"/>
                    </td>
                </tr>
            </c:forEach>
        </c:if>
    </table>
</div>
</body>
</html>