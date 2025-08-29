package com.gyojincompany.mybatistest.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gyojincompany.mybatistest.dao.IDao;
import com.gyojincompany.mybatistest.dto.BoardDto;


@Controller
public class BoardController {
	
	@Autowired
	private SqlSession sqlSession; //DI(의존성 자동 주입)
	
	@RequestMapping(value = "/boardlist")
	public String boardlist(HttpServletRequest request, Model model) {
		
		IDao idao = sqlSession.getMapper(IDao.class);
		List<BoardDto> boardDtos = idao.boardlistDao();		
		//System.out.println(boardDtos.get(0).getBtitle());
		
		model.addAttribute("boardDtos", boardDtos);
		
		return "boardlist";
	}
	
	@RequestMapping(value = "/write_form")
	public String write_form() {
		return "writeForm";
	}
	
	@RequestMapping(value = "/delete_form")
	public String delete_form() {
		return "deleteForm";
	}
	
	@RequestMapping(value = "/writeOk")
	public String writeOk(HttpServletRequest request, Model model) {
		
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		String bname = request.getParameter("bname");
		
		IDao idao = sqlSession.getMapper(IDao.class);
		int result = idao.boardWriteDao(btitle, bcontent, bname);
		System.out.println("result:"+result);
		//result값이 1이면 글쓰기 성공, 0이면 글쓰기 실패
		
		return "redirect:boardlist";
	}
	
	@RequestMapping(value = "/deleteOk")
	public String deleteOk(HttpServletRequest request, Model model) {
		
		String bnum = request.getParameter("bnum");		
		
		IDao idao = sqlSession.getMapper(IDao.class);
		int result = idao.boardDeleteDao(bnum);
		System.out.println("result:"+result);
		//result값이 1이면 글삭제 성공, 0이면 글삭제 실패
		if (result == 0) { //글삭제 실패
			model.addAttribute("error", "Yes");
			return "deleteForm";
		}
		
		return "redirect:boardlist";
	}
	
	

}
