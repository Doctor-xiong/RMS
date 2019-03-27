package com.hong.dao;

import com.hong.bean.Seat;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SeatMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(Seat record);

	int insertSelective(Seat record);

	Seat selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Seat record);

	int updateByPrimaryKey(Seat record);
}