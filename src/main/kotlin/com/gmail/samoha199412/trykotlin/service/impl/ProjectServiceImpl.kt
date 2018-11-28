package com.gmail.samoha199412.trykotlin.service.impl

import com.gmail.samoha199412.trykotlin.dao.ProjectDao
import com.gmail.samoha199412.trykotlin.dao.UserDao
import com.gmail.samoha199412.trykotlin.entity.Project
import com.gmail.samoha199412.trykotlin.entity.User
import com.gmail.samoha199412.trykotlin.service.ProjectService
import org.springframework.stereotype.Service

/**
 * Created by Andrew Samoilov on Nov, 2018.
 */

@Service
class ProjectServiceImpl(val userDao: UserDao, val projectDao: ProjectDao) : ProjectService {

    override fun addProjectToUser(userId: Int, projectName: String): User {


        val project = Project()

        project.projectName = projectName

        val userInDB = userDao.findUserById(userId.toLong())

        val userProjects = userInDB.projects

        userProjects.add(project)

        userDao.saveAndFlush(userInDB)

        return userInDB


    }
}