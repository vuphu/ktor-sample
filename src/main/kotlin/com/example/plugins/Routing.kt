package com.example.plugins

import com.example.dtos.PingDto
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    // Starting point for a Ktor app:
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        post("/ping") {
            val data = call.receive<PingDto>()
            call.respond(data)
        }
    }
    routing {
    }
}
