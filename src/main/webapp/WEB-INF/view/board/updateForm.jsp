<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>

<div class="container p-5">
    <div class="card">
        <div class="card-header"><b>익명 글수정 화면입니다</b></div>
        <div class="card-body">
            <form action="/board/${board.id}/update" method="post">
                <div class="mb-3">
                    <input type="text" class="form-control" placeholder="Enter author" name="name" value="${board.name}">
                </div>
                <div class="mb-3">
                    <input type="text" class="form-control" placeholder="Enter title" name="title" maxlength="20" value="${board.title}">
                </div>
                <div class="mb-3">
                    <textarea class="form-control" rows="5" name="content" maxlength="20">${board.content}</textarea>
                </div>
                <button type="submit" class="btn btn-primary form-control">글수정완료</button>
            </form>
        </div>
    </div>
</div>
