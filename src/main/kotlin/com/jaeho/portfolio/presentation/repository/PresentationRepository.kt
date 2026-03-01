package com.jaeho.portfolio.presentation.repository

import com.jaeho.portfolio.domain.repository.*
import org.springframework.stereotype.Repository

@Repository
class PresentationRepository(
    private val achievementRepository: AchievementRepository,
    private val experienceRepository: ExperienceRepository,
    private val introductionRepository: IntroductionRepository,
    private val linkRepository: LinkRepository,
    private val projectRepository: ProjectRepository,
    private val skillRepository: SkillRepository,
) {

    fun getActiveAchievements() = achievementRepository.findAllByIsActive(true)

    fun getActiveExperiences() = experienceRepository.findAllByIsActive(true)

    fun getActiveIntroductions() = introductionRepository.findAllByIsActive(true)

    fun getActiveLinks() = linkRepository.findAllByIsActive(true)

    fun getActiveProjects() = projectRepository.findAllByIsActive(true)

    fun getActiveSkills() = skillRepository.findAllByIsActive(true)

}