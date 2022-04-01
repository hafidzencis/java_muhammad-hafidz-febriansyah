package com.alterra.section27.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserConfig {

    @Bean
    public UserDetailsService users(){
        UserDetails new = User.builder()
            .username("admin")
            .password("{noop}password")
            .roles("ADMIN")
            .build();

        UserDetails new = User.builder()
            .username("user")
            .password("{bcrypt}$2a$10$X5wFBtLrL/kHcmrOGGTrGufsBX8CJ0WpQpF3pgeuxBB/H73BK1DW6")
            .roles("USER")
            .build();

        return new InMemoryUserDetailsManager(admin, user);

    }


    

}
