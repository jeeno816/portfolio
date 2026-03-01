package com.jaeho.portfolio.presentation.service

import com.jaeho.portfolio.domain.presentation.dto.IntroductionDTO
import com.jaeho.portfolio.domain.presentation.dto.LinkDTO
import com.jaeho.portfolio.domain.presentation.dto.ProjectDTO
import com.jaeho.portfolio.domain.presentation.dto.ResumeDTO
import com.jaeho.portfolio.presentation.repository.PresentationRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
class PresentationService(
    private val presentationRepository: PresentationRepository
) {

    @Transactional(readOnly = true)
    fun getIndroductions(): List<IntroductionDTO>{
        val introductions = presentationRepository.getActiveIntroductions()
        return introductions.map{IntroductionDTO(it)}
    }

    @Transactional(readOnly = true)
    fun getLinks():List<LinkDTO>{
        val links = presentationRepository.getActiveLinks()
        return links.map{LinkDTO(it)}
    }

    @Transactional(readOnly = true)
    fun getResume(): ResumeDTO {
        val experiences = presentationRepository.getActiveExperiences()
        val achievements = presentationRepository.getActiveAchievements()
        val skills = presentationRepository.getActiveSkills()
        return ResumeDTO(experiences, achievements, skills)
    }

    @Transactional
    fun getProjects():List<ProjectDTO>{
        val projects = presentationRepository.getActiveProjects()
        return projects.map{ProjectDTO(it)}
    }
}