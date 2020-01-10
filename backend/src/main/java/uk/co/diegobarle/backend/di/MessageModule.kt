package uk.co.diegobarle.backend.di

import dagger.Module
import dagger.Provides
import uk.co.diegobarle.backend.network.SendMessage

@Module
class MessageModule {

    @Provides
    fun provideSendMessage(): SendMessage {
        return SendMessage()
    }
}