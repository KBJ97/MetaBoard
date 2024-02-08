<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="/WEB-INF/view/board/header.jsp"%>

<div class="container p-5">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>내용</th>
				<th>작성자</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="board" items="${boardList}">
				<tr>
					<td>${board.id}</td>
					<td>${board.title}</td>
					<td>${board.content}</td>
					<td>${board.name}</td>
					<td>
						<div class="d-flex">
							<form action="/board/${board.id}/delete" method="post">
								<button type="submit" class="btn btn-danger">삭제</button>
							</form>
							<form action="/board/${board.id}/updateForm" method="get">
								<button class="btn btn-warning">수정</button>
							</form>
						</div>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<%@ include file="/WEB-INF/view/board/footer.jsp"%>
