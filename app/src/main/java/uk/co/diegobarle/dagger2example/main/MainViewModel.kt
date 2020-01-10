package uk.co.diegobarle.dagger2example.main

import androidx.lifecycle.ViewModel
import uk.co.diegobarle.backend.model.HeavyDetails
import uk.co.diegobarle.backend.model.UserMessage
import uk.co.diegobarle.backend.network.Result
import uk.co.diegobarle.backend.repository.MessageRepository
import uk.co.diegobarle.dagger2example.di.MainHeavy
import javax.inject.Inject

class MainViewModel @Inject constructor(
    @MainHeavy private val heavyDetails: HeavyDetails,
    private val rep: MessageRepository): ViewModel() {

    val title: String
        get() {
            return heavyDetails.details
        }

    fun sendMessage(message: String): Result{
        return rep.sendMessage(UserMessage(1, message))
    }
}