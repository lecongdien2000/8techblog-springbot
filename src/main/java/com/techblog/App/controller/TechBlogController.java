package com.techblog.App.controller;


import com.techblog.App.mappers.MySqlSessionFactory;
import com.techblog.App.mappers.UserMapper;
import com.techblog.App.models.Users;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("8techblog/users")
public class TechBlogController {

	@GetMapping
	public Users findAllCustomers(){
		MySqlSessionFactory msf = new MySqlSessionFactory();
		SqlSessionFactory sessionFactory = msf.startSqlSession();
		Users user = null;
		try(SqlSession session = sessionFactory.openSession()){
			UserMapper userMapper = session.getMapper(UserMapper.class);
			user = userMapper.getUserByUsernameAndPassword("8techblog", "12345678");
		}

		return user;
	}

}
