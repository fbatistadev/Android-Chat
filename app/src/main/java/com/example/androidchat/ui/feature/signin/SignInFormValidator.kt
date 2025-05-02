package com.example.androidchat.ui.feature.signin

import com.example.androidchat.R
import com.example.androidchat.ui.validator.EmailValidator
import com.example.androidchat.ui.validator.FormValidator
import com.example.androidchat.ui.validator.PasswordValidator
import javax.inject.Inject

class SignInFormValidator @Inject constructor() : FormValidator<SignInFormState> {

    override fun validate(formState: SignInFormState): SignInFormState {
        val isEmailValid = EmailValidator.isValid(formState.email)
        val isPasswordValid = PasswordValidator.isValid(formState.password)

        val hasError = listOf(
            isEmailValid,
            isPasswordValid,
        ).any { !it }

        return formState.copy(
            emailError = if (!isEmailValid) R.string.error_message_email_invalid else null,
            passwordError = if (!isPasswordValid) R.string.error_message_password_invalid else null,
            hasError = hasError,
        )
    }
}