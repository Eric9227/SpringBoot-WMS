package com.Warehouse.service;


import com.Warehouse.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * User:  ericzhao
 * Date:  2022/6/2
 * @author ericzhao
 * Login登录模块
 */
@Service
public interface UserLoginService {
    /**
     *
     * @param userId
     * @return wmsUser
     * 通过username去查询用户信息进行判断
     *
     */
    public User loginUserById(Integer userId);
    /**
     *
     * @param
     * @return User
     * 通过username去查询用户信息进行判断
     *
     */
    public List<User> loginUsers();
    /**
     *
     * @param user
     * @return int
     * 新增一条用户信息
     *
     */
    public int InsertUser(User user);
}
