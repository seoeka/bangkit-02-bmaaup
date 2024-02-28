package com.seoeka.kamaikomiu.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class Location(
    val name: String,
    val address: String,
    val photo: String,
    val openingHours: String,
    val rating: String,
    val desc: String,
) : Parcelable