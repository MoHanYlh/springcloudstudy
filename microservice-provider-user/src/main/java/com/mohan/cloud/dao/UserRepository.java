package com.mohan.cloud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohan.cloud.dto.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
