package life.users.util

object PasswordValidator {
    fun isValidPassword(password: String?): Boolean {
        return password != null
                && password.length >= 8
                && password.matches(".*[A-Z].*".toRegex())
                && password.matches(".*\\d.*".toRegex())
                && password.matches(".*[@#$%^&+=!].*".toRegex())
    }
}