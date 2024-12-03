package com.demo.spring_with_graphql.repository;

import com.demo.spring_with_graphql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {

}
