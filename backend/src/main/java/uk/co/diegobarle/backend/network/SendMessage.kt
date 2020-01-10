package uk.co.diegobarle.backend.network

import uk.co.diegobarle.backend.model.UserMessage
import javax.inject.Inject

class SendMessage @Inject constructor(){
    fun execute(message: UserMessage): Result{
        return ResultOK("Message \"${message.message}\" form User ${message.userId} sent!")
    }
}