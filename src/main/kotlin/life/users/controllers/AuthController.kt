package life.users.controllers

import life.users.dtos.request.UserLoginRequest
import life.users.dtos.response.UserLoginResponse
import life.users.services.AuthService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/public/auth")
class AuthController {

    lateinit var authService: AuthService

    @PutMapping("/login")
    fun login(@RequestBody userLoginRequest: UserLoginRequest): ResponseEntity<UserLoginResponse> {
        val userLoginResponse: UserLoginResponse = authService.login(userLoginRequest)
        return ResponseEntity(userLoginResponse, HttpStatus.OK)
    }

    @GetMapping("/hello")
    fun sendHello(): String {
        return "Hello"
    }
}