package com.example.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/")
class HelloController {

    @Get
    String index(){
        return "Hello World"
    }
    @Get('/foi')
    String foi(){
        def x = "Foi"
        x = x+"sdfsdfsdf"
        return "Hello World"
    }
}
