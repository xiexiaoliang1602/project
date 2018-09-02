package com.bwie.xll.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bwie.xll.entity.User;

@Mapper
public interface UserMapper {
    
	@Select("select * from p_user")
	List<User> findAll();
    @Delete("delete from p_user  where uid in(${value})")
	void plsc(String uid);
	
   
}
