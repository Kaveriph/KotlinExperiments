package com.kaveri.kotlinexperiments.ErrorHandling.SealedWay

import com.kaveri.kotlinexperiments.ErrorHandling.SealedWay.LoadState

object Repository {
    var loadState: LoadState = LoadState.Idle()

    fun startFetch() {
        loadState = LoadState.Loading()
    }

    fun stopFetch() {
        loadState = LoadState.Idle()
    }

    fun success(data:String) {
        loadState = LoadState.Success("succesfully read the data $data")
    }

    fun error(error:String) {
        loadState = LoadState.Error("There was an error observed: $error")
    }

    fun throwException(s: String) {
        loadState = Exception(1, "$s")
    }
}