package com.Warehouse.controller;

import com.Warehouse.pojo.User;
import com.Warehouse.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Intellij IDEA.
 * User:  ericzhao
 * Date:  2022/6/6
 */
@RestController
@RequestMapping("/wms")
public class UserController {
    @Autowired
    UserLoginService userLoginService;
    @RequestMapping("/insertuser")
    public Result insertUser(@RequestParam("uid") Integer id,@RequestParam("uname") String username){
        User user = new User();
        if(id!=null && username!=null){
            user.setUserId(id);
            user.setUserName(username);
            user.setUserPassword(id.toString());
            userLoginService.InsertUser(user);
            return new Result(user,Code.PUT_OK,"新增用户成功");
        }
      return  new Result(user,Code.PUT_ERROR,"添加用户信息失败！");

    }

}
