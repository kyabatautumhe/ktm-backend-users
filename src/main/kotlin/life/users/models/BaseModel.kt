package life.users.models

import jakarta.persistence.*
import lombok.Getter
import lombok.Setter
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
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

    @CreationTimestamp
    @Column(updatable = false)
    private lateinit var createdAt: Date

    @UpdateTimestamp
    private lateinit var updatedAt: Date
}