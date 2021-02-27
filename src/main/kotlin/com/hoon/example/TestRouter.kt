package com.hoon.example

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class TestRouter(val testHandler: TestHandler) {

    @Bean
    fun testRouter() = coRouter {
        POST("/test", testHandler::testHandler)
    }
}