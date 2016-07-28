package com.rockysingh.cache.repository;

import com.rockysingh.cache.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.Set;

@Repository
public class UserRepository {

    @Autowired
    private RedisTemplate<String, User> redisTemplate;

    public void save(User user) {
        redisTemplate.opsForValue().set(user.getId(), user);
    }

    public User findById(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    public List<User> findAll() {
        List<User> userList = new ArrayList<>();

        Set<String> keys = redisTemplate.keys("*");
        Iterator<String> it = keys.iterator();

        while(it.hasNext()){
            userList.add(findById(it.next()));
        }

        return userList;
    }

    public void delete(User user) {
        String key = user.getId();
        redisTemplate.opsForValue().getOperations().delete(key);
    }

}
