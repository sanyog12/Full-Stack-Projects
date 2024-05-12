package com.sanyog.fullStackBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanyog.fullStackBackend.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
