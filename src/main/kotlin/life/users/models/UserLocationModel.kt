package life.users.models

import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne

@Entity(name = "user_location")
data class UserLocationModel(

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    val user: UserModel,

    val latitude: Double = 0.0,

    val longitude: Double = 0.0,
): BaseModel()