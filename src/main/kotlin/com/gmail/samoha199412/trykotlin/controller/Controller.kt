package com.gmail.samoha199412.trykotlin.controller

import com.gmail.samoha199412.trykotlin.entity.User
import com.gmail.samoha199412.trykotlin.service.ProjectService
import com.gmail.samoha199412.trykotlin.service.UserService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/api")
class Controller (val userService: UserService, val projectService: ProjectService) {

    @PostMapping("/users")
    @ResponseBody
    fun addUser(@RequestBody user: User) = userService.addUser(user)


    @PostMapping("/projects")
    @ResponseBody
    fun addProject(@RequestBody body: Map<Any, Any>): User {

        return projectService.addProjectToUser(body.get("user_id") as Int , body.get("project_name") as String)
    }


    @GetMapping("/users")
    @ResponseBody
    fun getUser(@RequestParam(value = "id") id:Long) : User = userService.getUserInfo(id)

}