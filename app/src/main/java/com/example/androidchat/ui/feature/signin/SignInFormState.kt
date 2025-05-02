package com.example.androidchat.ui.feature.signin

import androidx.annotation.StringRes

data class SignInFormState(
    val email: String = "",
    @StringRes
    val emailError: Int? = null,
    val password: String = "",
    @StringRes
    val passwordError: Int? = null,
    val hasError: Boolean = false,
    val isLoading: Boolean = false
)
