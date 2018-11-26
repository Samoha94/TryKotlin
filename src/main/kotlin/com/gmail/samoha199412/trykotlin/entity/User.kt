package com.gmail.samoha199412.trykotlin.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonView
import javax.persistence.*


@Entity
@Table(name = "users")
class User {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: Long = 0

    @Column(name = "email")
    @JsonView
    var email: String = ""

    @JsonView
    @ManyToMany(cascade = [CascadeType.ALL])
    @JoinTable(
            name = "users_projects",
            joinColumns = [JoinColumn(name = "user_id")],
            inverseJoinColumns = [JoinColumn(name = "project_id")]
    )
    val projects: List<Project> = mutableListOf()


}