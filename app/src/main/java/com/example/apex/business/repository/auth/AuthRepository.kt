package com.example.apex.business.repository.auth

import com.example.apex.business.datasource.network.auth.OpenApiAuthService
import com.example.apex.business.api.persistence.AccountPropertiesDao
import com.example.apex.business.api.persistence.AuthTokenDao
import com.example.apex.business.datasource.cache.account.AccountDao
import com.example.apex.presentation.session.SessionManager
import javax.inject.Inject

class AuthRepository @Inject constructor(
    val authTokenDao: AuthTokenDao,
    accountDao: AccountDao,
    openApiAuthService: OpenApiAuthService,
    sessionManager: SessionManager
){



}