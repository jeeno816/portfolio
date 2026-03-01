package com.jaeho.portfolio.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class ExperienceDetail(var content: String, var isActive: Boolean): BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_detail_id")
    var id: Long? = null

    fun update(content: String, isActive: Boolean) {
        this.content = content
        this.isActive = isActive
    }
}