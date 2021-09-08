package com.example.login_signup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class LoginConfig {
    @Configuration
    public class ContactlistConfig {
        @Bean
        public LoginModel contactlistModelObj() {
            return new LoginModel();
        }


    }
}
