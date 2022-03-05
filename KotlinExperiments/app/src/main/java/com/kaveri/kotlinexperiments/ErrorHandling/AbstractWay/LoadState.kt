package com.kaveri.kotlinexperiments.ErrorHandling.AbstractWay

abstract class LoadState {
    class Loading: LoadState()
    class Idle: LoadState()
    data class Error(var errorStr:String): LoadState()
    data class Success(var successStr:String): LoadState()
}