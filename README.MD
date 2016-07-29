# Spring Boot Redis Example 

  The point of this project was to given an example of how to configure Redis  with Spring Boot. I have provided
a Java Configuration class for the Redis Beans. Also in the example there is a simple CRUD api provided that is based
on REDIS as the DAO.


	@Bean
    public RedisTemplate<String, User> redisTemplate() {
        RedisTemplate<String, User> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(jedisConnFactory);
        redisTemplate.setKeySerializer(stringRedisSerializer());
        redisTemplate.setValueSerializer(jacksonJsonRedisJsonSerializer());
        return redisTemplate;
    }
    
  Above is an example of a bean created for the RedisTemplate class to return back Java Serialized objects as a User a class. We have provided the connection Factory, Key Serializer and a the value Serializer. We have created both beans for the KeySerializer and the Value Serializer. These are show below.
  
  	@Bean
    public StringRedisSerializer stringRedisSerializer() {
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        return stringRedisSerializer;
    }

    @Bean
    public JacksonJsonRedisSerializer<User> jacksonJsonRedisJsonSerializer() {
        JacksonJsonRedisSerializer<User> jacksonJsonRedisJsonSerializer = new JacksonJsonRedisSerializer<>(User.class);
        return jacksonJsonRedisJsonSerializer;
    }
    
    
## License

### MIT License

#### Copyright (c) 2016 Harpender Singh

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.