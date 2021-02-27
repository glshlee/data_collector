package com.hoon.example

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.bodyValueAndAwait

@Component
class TestHandler {

    suspend fun testHandler(request: ServerRequest): ServerResponse {
        return ServerResponse.ok().bodyValueAndAwait("OK")
    }
}