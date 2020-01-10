package uk.co.diegobarle.backend.model

import javax.inject.Inject

class HeavyDetails @Inject constructor(
    var id: Long,
    var details: String)