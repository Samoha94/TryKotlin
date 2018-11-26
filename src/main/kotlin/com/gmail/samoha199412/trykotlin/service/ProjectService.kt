package com.gmail.samoha199412.trykotlin.service

import com.gmail.samoha199412.trykotlin.entity.User

/**
 * Created by Andrew Samoilov on Nov, 2018.
 */
interface ProjectService {

    fun addProjectToUser(userId:Long, projectName:String) : User

}