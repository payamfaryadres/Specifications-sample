package com.payam.learn.entity

import javax.persistence.*


@Entity
@Table(name = "tbl_user")
open class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    @Id
    var id: Long = 0;

    @Column(name = "name", nullable = true, length = 50)
    var name: String? = null

    @Column(name = "family", nullable = true, length = 100)
    var family: String? = null

    @OneToMany(cascade = arrayOf(CascadeType.ALL))
    @JoinTable(name="user_address")
    lateinit var adresses: Set<Address>
}