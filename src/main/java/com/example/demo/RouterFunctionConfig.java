package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles requests for the application home page.
 */
@RestController
public class RouterFunctionConfig {
/*
    @Bean
    public RouterFunction<?> index() {
        return route(GET("/hello"),
                request -> ok().body(just("Hello World !!"), String.class));
    }

*/
    @GetMapping("/hello")
    public String hello(){
        System.out.println("React 와 Boot 서버 연결");
        return "Hello Boot !!";
    }
}
