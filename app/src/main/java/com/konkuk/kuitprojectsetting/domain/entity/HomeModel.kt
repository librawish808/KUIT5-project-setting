package com.konkuk.kuitprojectsetting.domain.entity

import com.konkuk.kuitprojectsetting.data.service.HomeService
import kotlinx.serialization.Serializable

@Serializable
data class HomeModel(
    val homeTitle: String,
    val homeSubTitle: String,
)
