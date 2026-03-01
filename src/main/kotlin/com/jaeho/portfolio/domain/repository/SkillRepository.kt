package com.jaeho.portfolio.domain.repository

import com.jaeho.portfolio.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository


interface SkillRepository: JpaRepository<Skill, Long> {
    fun findAllByIsActive(isActive: Boolean): List<Skill>

    fun findByNameIgnoreCaseAndType(name: String, type: String): Skill?


}