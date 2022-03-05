package com.kaveri.kotlinexperiments.ErrorHandling.SealedWay


sealed class LoadState {
    class Loading: LoadState()
    class Idle: LoadState()
    data class Error(var errorStr:String): LoadState()
    data class Success(var successStr:String): LoadState()
}