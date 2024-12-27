package life.users.models

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne

@Entity(name = "user_auth")
data class UserAuthModel(
    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", unique = true, nullable = false, insertable = false, updatable = false)
    val userId: UserModel,

    @Column(unique = true, nullable = false)
    val email: String,

    @Column(name = "phone_number", unique = true, nullable = false)
    val phoneNumber: String,

    @Column(nullable = false)
    val password: String,
): BaseModel()
