package io.bloom.core.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.UUID

@Document("users")
data class User(
    @Id
    val id: UUID = UUID.randomUUID(),

    var email: String,

    var password: String,

    var accessToken: String,

    var refreshToken: String,

    var firstName: String,

    var lastName: String
)
