package com.jaeho.portfolio.domain.entity

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToMany


@Entity
class Experience(
    var title: String,
    var description: String,
    var startYear: Int,
    var startMonth: Int,
    var endYear: Int?,
    var endMonth: Int?,
    var isActive: Boolean
) : BaseEntity(){

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_id")
    var id: Long? = null

    @OneToMany(
        targetEntity = ExperienceDetail::class,
        fetch = FetchType.LAZY,
        cascade = [CascadeType.ALL]
    )
    @JoinColumn(name = "experience_id")
    var details: MutableList<ExperienceDetail> = mutableListOf()

    fun getEndYearMonth(): String{
        if(endYear == null || endMonth == null){
            return "Present"
        }
        return "${endYear}.${endMonth}"
    }

    fun update(title: String, description: String, startYear: Int, startMonth: Int, endYear: Int?, endMonth: Int?, isActive: Boolean) {
        this.title = title
        this.description = description
        this.startYear = startYear
        this.startMonth = startMonth
        this.endYear = endYear
        this.endMonth = endMonth
        this.isActive = isActive
    }
}