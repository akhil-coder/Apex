package com.example.apex.presentation.auth.login

import com.example.apex.business.domain.utils.Queue
import com.example.apex.business.domain.utils.StateMessage

data class LoginState(
    val isLoading: Boolean = false,
    val email: String = "",
    val password: String = "",
    val queue: Queue<StateMessage> = Queue(mutableListOf()),
)
