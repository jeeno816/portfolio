package com.jaeho.portfolio.domain.repository

import com.jaeho.portfolio.domain.entity.ProjectSkill
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectSkillRepository: JpaRepository<ProjectSkill, Long> {
    fun findByProjectIdAndSkillId(projectId: Long, skillId: Long): ProjectSkill?
}