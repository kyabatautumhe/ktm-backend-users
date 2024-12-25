package life.users.utils

import com.fasterxml.uuid.Generators
import java.util.UUID

object Uuid {

    fun v7(): UUID {
        return Generators.timeBasedEpochGenerator().generate()
    }
}