package com.example.apex.presentation.auth

import androidx.lifecycle.ViewModel
import com.example.apex.business.repository.auth.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthViewModel
@Inject constructor(
    val authRepository: AuthRepository
) : ViewModel() {

}