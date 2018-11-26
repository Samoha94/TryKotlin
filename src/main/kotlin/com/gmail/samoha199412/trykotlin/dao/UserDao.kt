package com.gmail.samoha199412.trykotlin.dao


import com.gmail.samoha199412.trykotlin.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserDao : JpaRepository<User, Long> {

    fun findUserById(id: Long): User

}