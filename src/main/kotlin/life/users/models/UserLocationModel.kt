package life.users.models

import jakarta.persistence.Entity
import java.util.*

@Entity(name = "user_location")
data class UserLocationModel(

    val userId: UUID,

    val latitude: Double = 0.0,

    val longitude: Double = 0.0,
) : BaseModel()