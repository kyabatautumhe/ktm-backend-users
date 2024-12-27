package life.users.models

import jakarta.persistence.*
import life.users.models.enums.UserPhotoActiveStatus

@Entity(name = "user_photos")
data class UserPhotosModel(
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    val user: UserModel,

    val photoUrl: String,

    @Enumerated(EnumType.STRING)
    val activeStatus: UserPhotoActiveStatus = UserPhotoActiveStatus.ACTIVE,

    val isMainPhoto: Boolean = false,
) : BaseModel()
