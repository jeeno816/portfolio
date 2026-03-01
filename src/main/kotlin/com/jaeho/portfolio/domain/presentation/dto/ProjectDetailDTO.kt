package com.jaeho.portfolio.domain.presentation.dto

import com.jaeho.portfolio.domain.entity.ProjectDetail

data class ProjectDetailDTO(
    val content: String,
    val url: String?
) {
    constructor(projectDetail: ProjectDetail): this(
        content = projectDetail.content,
        url = projectDetail.url
    )
}