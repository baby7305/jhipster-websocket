package com.mycompany.myapp.web.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.myapp.domain.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class RedisController {
    @Autowired
    private StringRedisTemplate redisTemplate;

    ObjectMapper mapper = new ObjectMapper();

    @GetMapping("/redis/demo")
    public String testRedis() {
        redisTemplate.opsForValue().set("a", "aa");
        String a = redisTemplate.opsForValue().get("a");
        return a;
    }

    @GetMapping("/redis/setObj")
    public void readObj() {
        Stu stu = new Stu();
        stu.setName("李雷");
        stu.setAge(16);
        try {
            redisTemplate.opsForValue().set("a", mapper.writeValueAsString(stu));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/redis/readObj")
    public Stu setObj() {
        String data = redisTemplate.opsForValue().get("a");
        Stu stu = new Stu();
        try {
            stu = mapper.readValue(data, Stu.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stu;
    }
}
