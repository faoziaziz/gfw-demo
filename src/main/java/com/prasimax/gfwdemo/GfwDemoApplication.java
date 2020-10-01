package com.prasimax.gfwdemo;

/* ini bagian untuk import models*/
import com.prasimax.gfwdemo.models.User;
/* end import model */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/* end extending import */

@SpringBootApplication
public class GfwDemoApplication {

    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
	RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration("localhost", 6379);
	return new JedisConnectionFactory(redisStandaloneConfiguration);
    }

    @Bean
    RedisTemplate<String, User> redisTemplate() {
	RedisTemplate<String, User> redisTemplate = new RedisTemplate<>();
	redisTemplate.setConnectionFactory(jedisConnectionFactory());
	return redisTemplate;
    }

    public static void main(String[] args) {
	SpringApplication.run(GfwDemoApplication.class, args);
    }

    

}
