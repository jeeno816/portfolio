package com.jaeho.portfolio.presentation.dto

import com.jaeho.portfolio.domain.entity.Link

data class LinkDTO(val name: String, val content: String){
    constructor(link: Link): this(name = link.name.lowercase(), content = link.content)
}
