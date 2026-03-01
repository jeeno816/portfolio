package com.jaeho.portfolio.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDate

@Entity
class Achievement(
    var title: String,
    var description: String,
    var achieveDate: LocalDate?,
    var host: String,
    var isActive: Boolean
    ): BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "achievement_id")
    var id: Long? = null


}