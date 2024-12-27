package life.users.models

import jakarta.persistence.*
import life.users.models.enums.Gender

@Entity(name = "User_preference")
data class UserPreferenceModel(

    @OneToOne @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    val user: UserModel,

    @Enumerated(EnumType.STRING)
    val gender: Gender,

    val searchDistance: Int,

    val minAge: Int,

    val maxAge: Int,
) : BaseModel()