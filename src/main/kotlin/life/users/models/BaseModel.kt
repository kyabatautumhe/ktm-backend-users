package life.users.models

import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import life.users.utils.Uuid
import lombok.Getter
import lombok.Setter
import org.jetbrains.annotations.NotNull
import java.util.*

@Getter
@Setter
@MappedSuperclass
class BaseModel(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    @Column(name = "public_id", nullable = false)
    @NotNull
    val publicId: UUID = Uuid.v7()
)