package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig {

    public SecurityFilterChain springSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(
                request -> {
                    request.requestMatchers("/bar").permitAll()
                            .requestMatchers("/bar/{bar_id}").authenticated()
                            .requestMatchers("/bar/{bar_id}/**").authenticated()
                            .requestMatchers("foo//foo/{foo_id}/{id2}/ack").anonymous();
                }
        );

        return http.build();
    }

}
