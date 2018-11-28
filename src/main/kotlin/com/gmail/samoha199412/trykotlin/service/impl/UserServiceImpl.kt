package com.gmail.samoha199412.trykotlin.service.impl

import com.gmail.samoha199412.trykotlin.dao.UserDao
import com.gmail.samoha199412.trykotlin.entity.User
import com.gmail.samoha199412.trykotlin.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(val userDao: UserDao) : UserService {


    override fun addUser(user: User): List<User> {

        val newUser:User = User()
        newUser.email = user.email

        userDao.saveAndFlush(newUser)

        return userDao.findAll()

    }

    override fun getUserInfo(id: Long): User {

        return userDao.findUserById(id)

    }
}