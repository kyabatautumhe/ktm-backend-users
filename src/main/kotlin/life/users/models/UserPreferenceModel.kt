package life.users.models

import jakarta.persistence.*
import life.users.models.enums.Gender
import java.util.*

@Entity(name = "User_preference")
data class UserPreferenceModel(

    val userId: UUID,

    @Enumerated(EnumType.STRING)
    val gender: Gender,

    val searchDistance: Int,

    val minAge: Int,

    val maxAge: Int,
) : BaseModel()