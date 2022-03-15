package com.axin.blog.service;

import com.axin.blog.po.User;

/**
 * @author X9
 * @title: UserService
 * @projectName blog
 * @description: TODO
 * @date 2021/12/27 17:15
 */
public interface UserService {

    User checkUser(String username,String password);

}
