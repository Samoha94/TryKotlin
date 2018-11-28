package com.gmail.samoha199412.trykotlin.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonView
import javax.persistence.*

/**
 * Created by Andrew Samoilov on Nov, 2018.
 */

@Entity
@Table(name = "projects")
class Project {

    interface ProjectShow


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonView(value = [ProjectShow::class, User.UserShow::class])
    var id:Long = 0


    @Column(name = "project_name")
    @JsonView(value = [ProjectShow::class, User.UserShow::class])
    var projectName: String = ""



    @ManyToMany(mappedBy = "projects")
    @JsonIgnore
    var users:MutableList<User> = mutableListOf()

}