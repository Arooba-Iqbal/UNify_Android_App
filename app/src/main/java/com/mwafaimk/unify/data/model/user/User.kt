package com.mwafaimk.unify.data.model.user

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    @SerialName("_id") val _id:String,
    @SerialName("username") val username: String,
    @SerialName("email") val email: String,
    @SerialName("password") val password: String,
    @SerialName("contactInfo") val contactInfo: String?,
    @SerialName("profilePicture") val profilePicture: String?,
    @SerialName("organization") val organization: String?,
)

