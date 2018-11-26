package com.gmail.samoha199412.trykotlin.controller

import com.gmail.samoha199412.trykotlin.entity.User
import com.gmail.samoha199412.trykotlin.service.UserService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/api")
class Controller (val userService: UserService) {

    @PostMapping("/users")
    @ResponseBody
    fun addUser(@RequestBody user: User) = userService.addUser(user)


}