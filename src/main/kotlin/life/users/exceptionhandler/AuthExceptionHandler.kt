package life.users.exceptionhandler

import life.users.exceptionhandler.exceptions.IncorrectPasswordException
import life.users.exceptionhandler.exceptions.UserNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class AuthExceptionHandler {

    @ExceptionHandler(IncorrectPasswordException::class)
    fun handleIncorrectPassword(): ResponseEntity<String> {
        return ResponseEntity(
            "Incorrect password",
            HttpStatus.NOT_FOUND
        )
    }

    @ExceptionHandler(UserNotFoundException::class)
    fun handleUserNotFoundException(): ResponseEntity<String> {
        return ResponseEntity(
            "User not found",
            HttpStatus.NOT_FOUND
        )
    }
}