package life.users.services

import life.users.dtos.request.UserLoginRequest
import life.users.dtos.response.UserLoginResponse
import life.users.exceptionhandler.exceptions.IncorrectPasswordException
import life.users.exceptionhandler.exceptions.UserNotFoundException
import life.users.models.UserModel
import life.users.repositories.UserModelRepository
import org.springframework.security.crypto.bcrypt.BCrypt
import org.springframework.stereotype.Service
import java.util.*

@Service
class AuthService {

    private lateinit var userModelRepository: UserModelRepository

    fun login(userLoginRequest: UserLoginRequest): UserLoginResponse {
        val optionalUserModel: Optional<UserModel> = userModelRepository.findByEmail(userLoginRequest.email)

        if (optionalUserModel.isPresent) {
            val userModel: UserModel = optionalUserModel.get()
            if (BCrypt.checkpw(userLoginRequest.password, userModel.password)) {
                // todo - generate JWT session token
                return UserLoginResponse(userModel.id.toString(), "sessionToken")
            } else {
                throw IncorrectPasswordException("Incorrect password")
            }
        } else {
            throw UserNotFoundException("User not found")
        }

    }
}