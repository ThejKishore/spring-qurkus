package org.kish.learning

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType


@RestController
@RequestMapping("/greeting")
class GreetingController {

    @GetMapping
    fun hello() = "Hello Spring"

    @GetMapping(value = ["/json"] , produces= [MediaType.APPLICATION_JSON_VALUE] )
    fun greeting() = """ { "hello":"json"} """
}