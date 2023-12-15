package com.securityEx.securityExProject.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    private final String[] allowedUrls = {"/","/api/"};

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception {

        return http
                .csrf().disable()
                .headers(headers -> headers.frameOptions().sameOrigin())
                .authorizeHttpRequests(requests ->
                        requests.requestMatchers(allowedUrls).permitAll()	// 허용할 url 목록을 배열로 분리했다
                                .requestMatchers(PathRequest.toH2Console()).permitAll()
                                .anyRequest().authenticated()
                )
                .sessionManagement(sessionManagement ->
                        sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                )
                .build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
