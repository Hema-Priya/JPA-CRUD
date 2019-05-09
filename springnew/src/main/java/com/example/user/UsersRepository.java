package com.example.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users,Integer> {

}
