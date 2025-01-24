package life.users.exceptionhandler

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(Exception::class)
    fun handleAllExceptions(): ResponseEntity<String> {
        return ResponseEntity(
            "An error occurred. Please try again later.",
            HttpStatus.INTERNAL_SERVER_ERROR
        )
    }
}