package com.example.apex.business.interactors.session

import com.example.apex.business.api.persistence.AuthTokenDao
import com.example.apex.business.domain.utils.DataState
import com.example.apex.business.domain.utils.MessageType
import com.example.apex.business.domain.utils.Response
import com.example.apex.business.domain.utils.SuccessHandling.Companion.SUCCESS_LOGOUT
import com.example.apex.business.domain.utils.UIComponentType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow

class Logout(
    private val authTokenDao: AuthTokenDao,
) {
    fun execute(): Flow<DataState<Response>> = flow {
        emit(DataState.loading<Response>())
        authTokenDao.clearTokens()
        emit(DataState.data<Response>(
            data = Response(
                message = SUCCESS_LOGOUT,
                uiComponentType = UIComponentType.Dialog(),
                messageType = MessageType.Error()
            ),
            response = null,
        ))
    }.catch{ e ->
        e.printStackTrace()
        emit(DataState.error<Response>(
            response = Response(
                message = e.message,
                uiComponentType = UIComponentType.Dialog(),
                messageType = MessageType.Error()
            )
        ))
    }
}