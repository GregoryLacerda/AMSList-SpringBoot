package com.gregory.amslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gregory.amslist.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
