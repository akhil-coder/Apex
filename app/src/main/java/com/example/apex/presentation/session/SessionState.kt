package com.example.apex.presentation.session

import com.example.apex.business.domain.models.AuthToken
import com.example.apex.business.domain.utils.Queue
import com.example.apex.business.domain.utils.StateMessage

data class SessionState(
    val isLoading: Boolean = false,
    val authToken: AuthToken? = null,
    val didCheckForPreviousAuthUser: Boolean = false,
    val queue: Queue<StateMessage> = Queue(mutableListOf()),
)
