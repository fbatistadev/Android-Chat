package com.example.androidchat.ui.validator

interface FormValidator<FormState> {
    fun validate(formState: FormState): FormState
}