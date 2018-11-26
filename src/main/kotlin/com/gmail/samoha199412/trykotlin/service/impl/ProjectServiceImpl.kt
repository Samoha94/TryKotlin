package com.gmail.samoha199412.trykotlin.service.impl

import com.gmail.samoha199412.trykotlin.dao.UserDao
import com.gmail.samoha199412.trykotlin.entity.Project
import com.gmail.samoha199412.trykotlin.entity.User
import com.gmail.samoha199412.trykotlin.service.ProjectService
import org.springframework.stereotype.Service

/**
 * Created by Andrew Samoilov on Nov, 2018.
 */

@Service
class ProjectServiceImpl(val userDao: UserDao) : ProjectService {

    override fun addProjectToUser(userId: Long, projectName: String): User {

        var newProject:Project = Project()

        newProject.projectName = projectName

        var projects: List<Project>  = mutableListOf(newProject)


    }
}