package com.gyojincompany.mybatistest.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gyojincompany.mybatistest.dto.BoardDto;

public interface IDao {
	
	//모든 글 리스트 불러오기 추상 메서드 선언
	public List<BoardDto> boardlistDao();
	
	//게시판 글쓰기 추상 메서드 선언
	//public void boardWriteDao(@Param("btitle") String btitle, @Param("bcontent") String bcontent, @Param("bname") String bname);
	public int boardWriteDao(String btitle, String bcontent, String bname);
	
	//게시판 글 삭제 추상 메서드 선언
	public int boardDeleteDao(String bnum);
	
	//게시판 모든 글 수 가져오기 추상 메서드 선언
	public int boardCountDao();
	
	//게시판 목록에서 유저가 클릭한 번호의 글 내용 가져오기 추상 메서드 선언
	public BoardDto boardContentViewDao(String bnum);
}
