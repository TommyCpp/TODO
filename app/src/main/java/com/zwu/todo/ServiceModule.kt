package com.zwu.todo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class ServiceModule {
    @Provides
    fun provideNetworkService(): NetworkService {
        return NetworkService()
    }
}