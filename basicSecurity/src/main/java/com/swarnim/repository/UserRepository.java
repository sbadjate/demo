package com.swarnim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swarnim.model.User1;

@Repository
public interface UserRepository extends JpaRepository<User1, Integer> {

	User1 findByUsername(String username);
}
