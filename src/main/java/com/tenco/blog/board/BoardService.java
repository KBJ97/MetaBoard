package com.tenco.blog.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;
    
    // 게시글 전체 불러오기
    public List<BoardDto> getAllBoards() {
        return boardRepository.findAll();
    }
    
    // 게시글 작성
    public void createBoard(BoardDto board) {
    	boardRepository.insert(board);
    }
    
    // 게시글 삭제
	public void deleteBoardById(int id) {
        boardRepository.deleteById(id);
	}
	
	// 게시글 수정
	public void updateBoardById(BoardDto board) {
		boardRepository.updateById(board);
	}

    // 게시글 id 조회
    public BoardDto getBoardById(int id) {
        return boardRepository.findById(id);
    }
}

