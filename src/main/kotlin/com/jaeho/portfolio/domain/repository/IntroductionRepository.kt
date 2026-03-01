package com.jaeho.portfolio.domain.repository

import com.jaeho.portfolio.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository: JpaRepository<Introduction, Long> {
    fun findAllByIsActive(isActive: Boolean): List<Introduction>
}