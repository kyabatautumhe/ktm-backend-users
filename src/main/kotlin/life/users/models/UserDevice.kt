package life.users.models

import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.util.UUID

@Entity(name = "user_device")
data class UserDevice(

    val userId: UUID,

    val model: String,

    val browser: String,

    val imei: String,

    val simNetwork: String,
) : BaseModel()
