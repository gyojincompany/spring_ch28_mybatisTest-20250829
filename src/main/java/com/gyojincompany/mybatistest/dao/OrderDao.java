package com.gyojincompany.mybatistest.dao;

import java.util.List;

import com.gyojincompany.mybatistest.dto.UserOrderDto;

public interface OrderDao {
	
	public List<UserOrderDto> userOrderListDao(String userid); //tiger->tv, audio, video
	
}
