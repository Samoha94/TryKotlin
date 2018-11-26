package com.gmail.samoha199412.trykotlin.entity

import com.fasterxml.jackson.annotation.JsonInclude
import javax.persistence.*

/**
 * Created by Andrew Samoilov on Nov, 2018.
 */

@Entity
@Table(name = "projects")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
class Project {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id:Long = 0


    @Column(name = "project_name")
    var projectName: String = ""



    @ManyToMany(mappedBy = "projects")
    var users: List<User> = mutableListOf()



}