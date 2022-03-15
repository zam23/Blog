package com.axin.blog.service;

import com.axin.blog.dao.UserRepository;
import com.axin.blog.po.User;
import com.axin.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author X9
 * @title: UserServiceImpl
 * @projectName blog
 * @description: TODO
 * @date 2021/12/27 17:16
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {

        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));

        return user;
    }
}
