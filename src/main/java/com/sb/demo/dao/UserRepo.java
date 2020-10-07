package com.sb.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.sb.demo.model.User;

public interface UserRepo extends CrudRepository<User, Integer> {
	

}
