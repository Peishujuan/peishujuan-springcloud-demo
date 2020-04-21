package com.peishujuan.springcloud.order.feign;

import com.peishujuan.springcloud.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 指定服务名称：server-user
 */
@FeignClient(name = "service-user")
public interface UserFeignClient {
    /**
     * 根据Id，查询User
     * @param id
     * @return
     */
    @RequestMapping("/user/getUserById")
    public User getUserById(@RequestParam("id")Integer id);

    @RequestMapping("/user/getUserByUser")
    public User getUserByUser(@RequestBody User user);

    /**
     * 根据id 查询user名称
     * @param id
     * @return
     */
    @RequestMapping("/user/getUsernameById")
    public String getUsernameById(@RequestParam("id")Integer id);


}
