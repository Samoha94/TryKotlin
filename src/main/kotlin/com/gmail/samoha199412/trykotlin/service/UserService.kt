package com.gmail.samoha199412.trykotlin.service

import com.gmail.samoha199412.trykotlin.entity.User



interface UserService {

   fun addUser(user : User) : List<User>


}