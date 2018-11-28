package com.gmail.samoha199412.trykotlin.dao

import com.gmail.samoha199412.trykotlin.entity.Project
import com.gmail.samoha199412.trykotlin.entity.User
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by Andrew Samoilov on Nov, 2018.
 */
interface ProjectDao : JpaRepository<Project, Long> {

    fun findProjectsByUsers(user: User) : List<Project>
}