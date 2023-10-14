package com.vjrszcode.coursespringboot.config;

import com.vjrszcode.coursespringboot.entities.User;
import com.vjrszcode.coursespringboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "jao", "jao@gamil.com", "99999", "12345");
        User u2 = new User(null, "jao2", "jao2@gamil.com", "99999", "12345");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
