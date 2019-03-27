package com.hong.dao;

import com.hong.bean.UserLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserLogMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(UserLog record);

	int insertSelective(UserLog record);

	UserLog selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(UserLog record);

	int updateByPrimaryKey(UserLog record);
}