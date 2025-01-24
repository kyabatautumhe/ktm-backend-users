package life.users.dtos.response

data class UserLoginResponse (
    val userId: String,
    val sessionToken: String,
)