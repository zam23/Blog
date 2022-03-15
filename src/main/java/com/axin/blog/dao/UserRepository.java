package com.axin.blog.dao;

import com.axin.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Scanner;

/**
 * @author X9
 * @title: UserRepository
 * @projectName blog
 * @description: TODO
 * @date 2021/12/27 17:22
 */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username,String password);

}
