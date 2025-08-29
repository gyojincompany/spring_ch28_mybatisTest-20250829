package com.gyojincompany.mybatistest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto {
	
	private int bnum;
	private String btitle;
	private String bcontent;
	private String bname; //글쓴이
	private int bhit;
	private String bdate;

}
