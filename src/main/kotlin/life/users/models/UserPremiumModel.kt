package life.users.models

import jakarta.persistence.*
import life.users.models.enums.Premium
import java.util.*

@Entity(name = "User_premium")
data class UserPremiumModel(

    val userId: UUID,

    @Enumerated(EnumType.STRING)
    val premium: Premium,

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    val expiry: Calendar
) : BaseModel()
