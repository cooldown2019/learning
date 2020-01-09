package com.task.cache;

import com.whalin.MemCached.MemCachedClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemcachedTest {
    public static void main(String[] args) {
        MemCachedClient memCachedClient;

        ApplicationContext atx = new ClassPathXmlApplicationContext("memcached.xml");
        memCachedClient = (MemCachedClient) atx.getBean("memcachedClient");

        System.out.println(memCachedClient.set("ccc", "555555"));
        System.out.println(memCachedClient.get("ccc"));
        for (int i = 0; i < 10; i++) {

            String a = "key i的值" + i;
            memCachedClient.set(a, "555555"+i);
            System.out.println(memCachedClient.get(a));

        }
    }

}
