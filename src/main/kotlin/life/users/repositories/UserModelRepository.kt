package life.users.repositories

import life.users.models.UserModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserModelRepository : JpaRepository<UserModel, UUID> {
    fun findByEmail(email: String): Optional<UserModel>
}