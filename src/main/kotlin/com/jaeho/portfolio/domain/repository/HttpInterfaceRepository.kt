package com.jaeho.portfolio.domain.repository

import com.jaeho.portfolio.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDateTime

interface HttpInterfaceRepository: JpaRepository<HttpInterface, Long> {
    fun countAllByCreatedDateTimeBetween(
        createdDateTimeAfter: LocalDateTime,
        createdDateTimeBefore: LocalDateTime
    ): Long
}