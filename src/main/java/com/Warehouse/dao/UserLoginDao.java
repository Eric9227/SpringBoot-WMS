package com.Warehouse.dao;

import com.Warehouse.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Intellij IDEA.
 * User:  ericzhao
 * Date:  2022/6/2
 * @author ericzhao
 */
public interface UserLoginDao {
    @Select("select * from wms_user where user_id = #{userId}")
    public User loginUserById(Integer userId);
    @Select("select * from wms_user ")
    public List<User> loginUsers();
    @Insert("Insert Into wms_user values (#{userId},#{userName},#{userPassword})")
    public int InsertUser(User user);
}
