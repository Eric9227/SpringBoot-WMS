package com.Warehouse.controller;


import com.Warehouse.pojo.User;
import com.Warehouse.service.UserLoginService;
import com.wf.captcha.utils.CaptchaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by Intellij IDEA.
 * User:  ericzhao
 * Date:  2022/6/2
 */
@RestController
@RequestMapping("/wms")
public class LoginController {
 @Autowired
 UserLoginService userLoginService;
    @PostMapping("/login")
    public Result LoginUser( Integer userid,String verCode,HttpServletRequest request){
        if (!CaptchaUtil.ver(verCode, request)) {
            CaptchaUtil.clear(request);  // 清除session中的验证码
            return new Result(verCode,500,"验证码错误！");
        }
        User wmsUser = userLoginService.loginUserById(userid);
        if(wmsUser.getUserPassword().equals(request.getParameter("password") )){
        Integer code = wmsUser != null ? Code.GET_OK : Code.GET_ERROR;
        String msg = wmsUser != null ? "登录成功" : "登录失败，账号或密码错误！";
        return new Result(wmsUser,code,msg);
        }
        return new Result(wmsUser,Code.GET_ERROR,"登录失败，账号或密码错误！");
    }
    @GetMapping("/captcha")
    public void captcha(HttpServletRequest request, HttpServletResponse response) throws Exception {
        CaptchaUtil.out(request, response);
    }



}
