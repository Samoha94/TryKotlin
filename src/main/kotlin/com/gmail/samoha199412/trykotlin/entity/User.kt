package com.gmail.samoha199412.trykotlin.entity

import javax.persistence.*


@Entity
@Table(name = "users")
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: Long = 0

    @Column(name = "email")
    var email: String = ""





}