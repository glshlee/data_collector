package com.hoon.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.reactive.config.EnableWebFlux

@SpringBootApplication
@EnableWebFlux
class WebfluxTest

fun main(args: Array<String>) {
    runApplication<WebfluxTest>(*args)
}