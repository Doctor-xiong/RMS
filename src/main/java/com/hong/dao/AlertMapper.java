package com.hong.dao;

import com.hong.bean.Alert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AlertMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(Alert record);

	int insertSelective(Alert record);

	Alert selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Alert record);

	int updateByPrimaryKey(Alert record);
}