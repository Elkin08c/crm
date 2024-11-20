package com.example.crm.entity

import jakarta.persistence.*

@Entity
@Table(name = "activity")
class Activity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    @ManyToOne
    @JoinColumn(name = "lead_id", nullable = false)
    var lead: Lead? = null

    var activityType: String? = null
    var activityDate: java.time.LocalDateTime? = null
    var description: String? = null
}
