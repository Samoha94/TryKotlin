package com.gmail.samoha199412.trykotlin.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonView
import javax.persistence.*


@Entity
@Table(name = "users")
class User {

     interface UserShow

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    @JsonView(value = [UserShow::class])
    var id: Long = 0

    @Column(name = "email")
    @JsonView(value = [UserShow::class])
    var email: String = ""

    @JsonView(value = [UserShow::class])
    @ManyToMany(cascade = [CascadeType.ALL])
    @JoinTable(
            name = "users_projects",
            joinColumns = [JoinColumn(name = "user_id")],
            inverseJoinColumns = [JoinColumn(name = "project_id")]
    )
    var projects:MutableList<Project> = mutableListOf()



}