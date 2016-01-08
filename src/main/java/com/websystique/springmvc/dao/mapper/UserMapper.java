package com.websystique.springmvc.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.websystique.springmvc.model.User;

public interface UserMapper {
	
	@Select("select * from users")  
	List<User> getAllUsers();  
	
	@Insert("INSERT into users(id,user_name,address,email) VALUES(#{id}, #{userName},#{address},#{email})")
	void insertUser(User user);
	
	@Update("UPDATE users SET user_name=#{userName},address=#{address},email=#{email} WHERE id =#{id}")
	void updateUser(User user);
	
	@Delete("DELETE FROM users WHERE id =#{id}")
	void deleteVillage(int id);
} 