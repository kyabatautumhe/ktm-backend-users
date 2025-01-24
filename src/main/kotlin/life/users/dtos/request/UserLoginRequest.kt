package life.users.dtos.request

data class  UserLoginRequest (
    val email: String,
    val password: String,
)