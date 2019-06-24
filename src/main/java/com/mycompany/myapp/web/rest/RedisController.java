package com.mycompany.myapp.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Autowired
    private StringRedisTemplate redisTemplate;

    @GetMapping("/redis/demo")
    public String testRedis() {
        redisTemplate.opsForValue().set("a", "aa");
        String a = redisTemplate.opsForValue().get("a");
        return a;
    }
}
