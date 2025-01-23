package life.users.models

import jakarta.persistence.Entity
import java.util.UUID

@Entity(name = "user_device")
data class UserDeviceModel(

    val userId: UUID,

    val model: String,

    val browser: String,

    val imei: String,

    val simNetwork: String,
) : BaseModel()
