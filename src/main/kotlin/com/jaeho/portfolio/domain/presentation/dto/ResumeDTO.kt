package com.jaeho.portfolio.domain.presentation.dto

import com.jaeho.portfolio.domain.entity.Achievement
import com.jaeho.portfolio.domain.entity.Experience
import com.jaeho.portfolio.domain.entity.ExperienceDetail
import com.jaeho.portfolio.domain.entity.Skill
import java.time.format.DateTimeFormatter

class ResumeDTO(
    experiences: List<Experience>,
    achievements: List<Achievement>,
    skills: List<Skill>
){
    var experiences: List<ExperienceDTO> = experiences.map{
        ExperienceDTO(
            title = it.title,
            description = it.description,
            startYearMonth = "${it.startYear}.${it.startMonth}",
            endYearMonth = it.getEndYearMonth(),
            details = it.details.filter(ExperienceDetail::isActive).map { detail -> detail.content }
        )
    }
    var achivements: List<AchievementDTO> = achievements.map{
        AchievementDTO(
            title = it.title,
            description = it.description,
            host = it.host,
            achievedDate = it.achievedDate?.format(DateTimeFormatter.ISO_LOCAL_DATE)?.replace("-",".")
        )
    }
    var skills: List<SkillDTO> = skills.map { SkillDTO(it) }
}
