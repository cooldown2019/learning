package com.task.cache;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RedisTest {
    public static void main(String[] args) {
        RedisUtils redisUtils;

        ApplicationContext atx = new ClassPathXmlApplicationContext("redis.xml");
        redisUtils = (RedisUtils) atx.getBean("redisUtils");

        System.out.println(redisUtils.set("ccc", "555555"));
        System.out.println(redisUtils.get("ccc"));
        for (int i = 0; i < 10; i++) {

            String a = "key i的值" + i;
            redisUtils.set(a, "555555"+i);
            System.out.println(redisUtils.get(a));

        }
    }
}
