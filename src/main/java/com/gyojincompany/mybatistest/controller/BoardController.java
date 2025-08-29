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

}
