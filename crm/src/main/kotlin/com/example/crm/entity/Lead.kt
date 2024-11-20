package com.example.crm.entity

import jakarta.persistence.*

@Entity
@Table(name = "lead")
class Lead {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null


    var leadStatus: String? = null
    var createdAt: java.time.LocalDateTime? = null
    var updatedAt: java.time.LocalDateTime? = null
}
