package com.happystudy.dao;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONObject;
import cn.hutool.system.UserInfo;
import com.happystudy.model.User;
import com.happystudy.model.User_Info;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    public  void addUser (String username,String password);
    public User findUserByName(String u_username);
    public JSONObject updateUser(User user);
    public void bindPhone(String username, String phonenum);
    public User_Info queryUserInfo(String u_username);

}
