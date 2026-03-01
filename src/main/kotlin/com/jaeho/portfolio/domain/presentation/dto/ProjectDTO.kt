package com.jaeho.portfolio.domain.presentation.dto

import com.jaeho.portfolio.domain.entity.Project
import com.jaeho.portfolio.domain.entity.ProjectDetail


data class ProjectDTO(
    val name: String,
    val description: String,
    val startYearMonth: String,
    val endYearMonth: String?,
    val details: List<ProjectDetailDTO>,
    val skills: List<SkillDTO>?
){
    constructor(project: Project): this(
        name = project.name,
        description = project.description,
        startYearMonth = "${project.startYear}.${project.startMonth}",
        endYearMonth = project.getEndYearMonth(),
        details = project.details.filter(ProjectDetail::isActive).map { detail -> ProjectDetailDTO(detail) },
        skills = project.skills.map {it.skill}.filter{it.isActive}.map { SkillDTO(it)}
    )
}
