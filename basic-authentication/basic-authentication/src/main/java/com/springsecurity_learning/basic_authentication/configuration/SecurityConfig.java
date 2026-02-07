package com.springsecurity_learning.basic_authentication.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http){
        http.csrf(csrf->csrf.disable())
                .authorizeHttpRequests(auth->{
                    auth.requestMatchers("/pub").permitAll();
                    auth.requestMatchers("/admin").authenticated();
                })
                .httpBasic(httpbasic->httpbasic.realmName("Admin RealName"));
                return http.build();
    }
    @Bean
    public InMemoryUserDetailsManager userDetailsService(){
       User.UserBuilder userBuilder= User.builder();
       userBuilder.username("admin");
       userBuilder.password(passwordEncoder().encode("Pruthvi"));
       userBuilder.roles("ADMIN");
        UserDetails userDetails=userBuilder.build();
        return new InMemoryUserDetailsManager(userDetails);
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
