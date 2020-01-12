package uk.co.diegobarle.backend.model

import javax.inject.Inject

data class UserMessage @Inject constructor(
    var userId: Long,
    var message: String)