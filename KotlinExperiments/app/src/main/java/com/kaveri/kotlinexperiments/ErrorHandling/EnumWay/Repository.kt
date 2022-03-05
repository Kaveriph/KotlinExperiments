package com.kaveri.kotlinexperiments.ErrorHandling.EnumWay

object Repository {
    var loadState = LoadState.IDLE
    var dataFetched: String? = null

    fun startFetch() {
        loadState = LoadState.LOADING
        dataFetched = "data"
    }

    fun stopFetch() {
        loadState = LoadState.IDLE
        dataFetched = null
    }

    fun success() {
        loadState = LoadState.SUCCESS
    }

    fun error() {
        loadState = LoadState.ERROR
    }
}