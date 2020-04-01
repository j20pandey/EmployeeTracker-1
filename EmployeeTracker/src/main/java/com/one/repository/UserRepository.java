package com.one.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.one.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	public User findByuserName(String userName);
		
}
