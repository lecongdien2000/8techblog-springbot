package com.techblog.App.mappers;


import com.techblog.App.models.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
@Component
@Mapper
public interface UserMapper {
	public Users getUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}



	

