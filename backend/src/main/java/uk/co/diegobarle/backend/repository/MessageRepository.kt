package uk.co.diegobarle.backend.repository

import uk.co.diegobarle.backend.model.UserMessage
import uk.co.diegobarle.backend.network.SendMessage
import uk.co.diegobarle.backend.network.Result
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MessageRepository @Inject constructor(private val sendMessage: SendMessage){
    fun sendMessage(message: UserMessage): Result{
        return sendMessage.execute(message)
    }
}