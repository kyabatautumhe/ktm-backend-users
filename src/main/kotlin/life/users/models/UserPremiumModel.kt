package life.users.models

import jakarta.persistence.*
import life.users.models.enums.Premium
import java.util.Calendar

@Entity(name = "User_premium")
data class UserPremiumModel(

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    val user: UserModel,

    @Enumerated(EnumType.STRING)
    val premium: Premium,

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    val expiry: Calendar
): BaseModel()
