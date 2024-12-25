package life.users.models

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import life.users.utils.Uuid
import java.util.*

@MappedSuperclass
data class BaseModel(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,

    val publicId: UUID = Uuid.v7()
)
