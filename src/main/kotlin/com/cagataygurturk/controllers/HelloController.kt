package com.cagataygurturk.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Suppress("unused")
@RestController
class HelloController {

    @GetMapping("/")
    fun ping() = ResponseEntity.ok("pong")
}