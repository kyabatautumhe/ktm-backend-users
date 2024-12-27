package life.users.models

import jakarta.persistence.Column
import jakarta.persistence.Entity
import life.users.models.enums.UserActivityStatus

@Entity(name="users")
data class UserModel(
    val name: String,
    @Column(name = "username")
    val userName: String,
    @Column(name = "activity_status")
    val activityStatus: UserActivityStatus,
) : BaseModel()