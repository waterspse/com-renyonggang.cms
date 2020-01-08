package com.ryg.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ryg.pojo.User;

public interface BaseDao {
	//按条件查询
	List<User> select(User user);
	//根据id查询
	User selectById(Integer id);
	
	int insert(User user);
	
	int update(User user);
	
	int delete(@Param("ids")String ids);
}
