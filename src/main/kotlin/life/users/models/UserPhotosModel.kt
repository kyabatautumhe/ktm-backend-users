package life.users.models

import jakarta.persistence.*
import life.users.models.enums.UserPhotoActiveStatus
import java.util.*

@Entity(name = "user_photos")
data class UserPhotosModel(
    val userId: UUID,

    val photoUrl: String,

    @Enumerated(EnumType.STRING)
    val activeStatus: UserPhotoActiveStatus = UserPhotoActiveStatus.ACTIVE,

    val isMainPhoto: Boolean = false,
) : BaseModel()
