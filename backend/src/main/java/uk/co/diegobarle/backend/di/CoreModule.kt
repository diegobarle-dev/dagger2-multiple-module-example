package uk.co.diegobarle.backend.di

import dagger.Module
import dagger.Provides
import uk.co.diegobarle.backend.network.SendMessage
import uk.co.diegobarle.backend.network.SendMessage1

@Module
class CoreModule {

    @Provides
    fun provideSendMessage(): SendMessage {
        return SendMessage1()
    }
}