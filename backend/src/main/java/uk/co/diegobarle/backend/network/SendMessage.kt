package uk.co.diegobarle.backend.network

import uk.co.diegobarle.backend.model.UserMessage

interface SendMessage{
    fun execute(message: UserMessage): Result
}