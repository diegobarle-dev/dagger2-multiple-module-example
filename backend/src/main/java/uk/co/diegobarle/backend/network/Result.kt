package uk.co.diegobarle.backend.network

abstract class Result(val message: String)

class ResultOK(message: String): Result(message)
class ResultError(message: String): Result(message)