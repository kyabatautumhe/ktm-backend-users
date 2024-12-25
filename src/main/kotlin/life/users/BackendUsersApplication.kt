package life.users

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BackendUsersApplication

fun main(args: Array<String>) {
    runApplication<BackendUsersApplication>(*args)
}
