package com.Warehouse.service.impl;


import com.Warehouse.dao.UserLoginDao;
import com.Warehouse.pojo.User;
import com.Warehouse.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * User:  ericzhao
 * Date:  2022/6/2
 */
@Service

public class UserLoginServiceImpl implements UserLoginService {
 @Autowired
 UserLoginDao userLoginDao;

    @Override
    public User loginUserById(Integer userId) {
        return userLoginDao.loginUserById(userId);
    }

    @Override
    public List<User> loginUsers() {
        return userLoginDao.loginUsers();
    }

    @Override
    public int InsertUser(User user) {
        return userLoginDao.InsertUser(user);
    }
}
