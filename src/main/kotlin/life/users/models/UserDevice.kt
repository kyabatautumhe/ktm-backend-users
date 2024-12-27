package life.users.models

import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

@Entity(name = "user_device")
data class UserDevice(

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    val user: UserModel,

    val model: String,

    val browser: String,

    val imei: String,

    val simNetwork: String,
) : BaseModel()
