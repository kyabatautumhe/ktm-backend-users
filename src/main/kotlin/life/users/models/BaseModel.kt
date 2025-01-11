package life.users.models

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import lombok.Getter
import lombok.Setter
import org.jetbrains.annotations.NotNull
import java.util.*

@Getter
@Setter
@MappedSuperclass
class BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @NotNull
    lateinit var id: UUID
}