package com.tenco.blog.board;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/index")
    public String index(Model model) {
    	
    	// 게시글 전체 불러오기
        List<BoardDto> boardList = boardService.getAllBoards();
        model.addAttribute("boardList", boardList);
        
        return "board/index";
    }

    @GetMapping("/board/saveForm")
    public String saveForm() {
        return "board/saveForm";
    }

    @GetMapping("/board/{id}/updateForm")
    public String updateForm(@PathVariable int id, Model model) {
    	// 게시글 id 조회
        BoardDto board = boardService.getBoardById(id);
        model.addAttribute("board", board);
        
        return "board/updateForm";
    }

    @PostMapping("/board/save")
    public String save(BoardDto board){
    	// 게시글 작성
    	boardService.createBoard(board);
    	
        return "redirect:/board/index";
    }

    @PostMapping("/board/{id}/update")
    public String update(@PathVariable int id, BoardDto board){
    	// 게시글 수정
    	boardService.updateBoardById(board);
    	
        return "redirect:/board/index";
    }

    @PostMapping("/board/{id}/delete")
    public String delete(@PathVariable int id){
    	// 게시글 삭제
        boardService.deleteBoardById(id);
        
        return "redirect:/board/index";
    }
}
