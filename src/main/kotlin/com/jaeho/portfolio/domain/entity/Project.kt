package com.jaeho.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class Project(
    var name: String,
    var description: String,
    var startYear: Int,
    var startMonth: Int,
    var endYear: Int?,
    var endMonth: Int?,
    var isActive: Boolean
): BaseEntity(){

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    var id: Long? = null

    @OneToMany(targetEntity = ProjectDetail::class, fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "project_id")
    var details: MutableList<ProjectDetail> = mutableListOf()

    @OneToMany(mappedBy = "project", fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    var skills: MutableList<ProjectSkill> = mutableListOf()

    fun addDetails(details: MutableList<ProjectDetail>?) {
        if (details != null) {
            this.details.addAll(details)
        }
    }
}