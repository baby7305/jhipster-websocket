package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.domain.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class Redis2Controller {
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @GetMapping("/set/obj")
    public void testRedis1() {
        Stu stu = new Stu();
        stu.setName("hello");
        stu.setAge(16);
        redisTemplate.opsForValue().set("b", stu);
    }

    @GetMapping("/read/obj")
    public Stu getVal() {
        Stu stu1 = (Stu) redisTemplate.opsForValue().get("b");
        return stu1;
    }
}
