package com.peishujuan.springcloud.user.model.controller;

import com.peishujuan.springcloud.user.model.User;
import com.peishujuan.springcloud.user.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;
    /**
     * 根据Id，查询User
     * @param id
     * @return
     */
    @RequestMapping("getUserById")
    public User getUserById(@RequestParam("id")Integer id){
        return userService.getUserById(id);
    }
    /**
     * 根据id 查询user名称
     * @param id
     * @return
     */
    @RequestMapping("getUsernameById")
    public String getUsernameById(@RequestParam("id")Integer id){
        return userService.getUsernameById(id);
    }
}
