package com.hong.dao;

import com.hong.bean.Communicate;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommunicateMapper {
 
    int deleteByPrimaryKey(Integer id);

  
    int insert(Communicate record);

  
    int insertSelective(Communicate record);

   
    Communicate selectByPrimaryKey(Integer id);

   
    int updateByPrimaryKeySelective(Communicate record);

    int updateByPrimaryKey(Communicate record);
}