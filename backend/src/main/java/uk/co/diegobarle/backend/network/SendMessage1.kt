package uk.co.diegobarle.backend.network

import uk.co.diegobarle.backend.model.UserMessage

class SendMessage1: SendMessage{
    override fun execute(message: UserMessage): Result{
        return ResultOK("Message \"${message.message}\" form User ${message.userId} sent!")
    }
}