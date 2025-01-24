package life.users.models

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import life.users.models.enums.UserActiveStatus

@Entity(name = "users")
data class UserModel(
    val name: String,

    @Column(unique = true, nullable = false)
    val userName: String,

    @Column(unique = true, nullable = false)
    val email: String,

    @Column(unique = true, nullable = false)
    val phoneNumber: String,

    @Column(nullable = false)
    val password: String,

    @Enumerated(value = EnumType.STRING)
    val activeStatus: UserActiveStatus = UserActiveStatus.UNDER_VERIFICATION,
) : BaseModel()