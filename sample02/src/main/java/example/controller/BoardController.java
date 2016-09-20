package example.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import example.dao.BoardDao;
import example.vo.Board;

@Controller
@RequestMapping("/board/")
public class BoardController {

  @Autowired
  BoardDao boardDao;
  
  @RequestMapping("list")
  public String list(
      @RequestParam(defaultValue="1") int pageNo, 
      @RequestParam(defaultValue="5") int length, 
      Model model) throws Exception {
    
    HashMap<String, Object> map = new HashMap<>();
    map.put("startIndex", (pageNo - 1) * length);
    map.put("length", length);
        
    List<Board> list = boardDao.selectList(map);
    model.addAttribute("list", list);
    
    return "/board/BoardList.jsp";
    
    }
  
  @RequestMapping("add")
  public String add(Board board) throws Exception {
    boardDao.insert(board);
    return "redirect:list.do";
    
  }
  
  @RequestMapping("detail")
  public String detail(int no, Model model) throws Exception {
    Board board = boardDao.selectOne(no);
    model.addAttribute("board", board);
    return "/board/BoardDetail.jsp";
    
    }
  
  @RequestMapping("update")
  public String update(Board board) throws Exception {
    HashMap<String,Object> paramMap = new HashMap<>();
    paramMap.put("no", board.getNo());
    paramMap.put("password", board.getPassword());
      
    if (boardDao.selectOneByPassword(paramMap) == null) {
      throw new Exception("해당 게시물이 없거나, 암호가 일치하지 않습니다.");
    } 
      
    boardDao.update(board);
    return "redirect:list.do";
    
  }
  
  @RequestMapping("delete")
  public String delete(int no) throws Exception {
    boardDao.delete(no);
    return "redirect:list.do";
    
    }
  
}
