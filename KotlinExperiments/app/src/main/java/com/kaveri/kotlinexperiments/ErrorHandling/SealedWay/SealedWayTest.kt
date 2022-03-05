package com.kaveri.kotlinexperiments.ErrorHandling.SealedWay

fun main() {
    testSealedWay()
}


fun testSealedWay() {
    getLoadStateSealedWAY()
    Repository.startFetch()
    getLoadStateSealedWAY()
    Repository.success("well done")
    getLoadStateSealedWAY()
    Repository.error("Uh oh !")
    getLoadStateSealedWAY()
    Repository.stopFetch()
    getLoadStateSealedWAY()
    Repository.throwException("NullPointerException")
    getLoadStateSealedWAY()
}


fun getLoadStateSealedWAY() {
    when(Repository.loadState) {
        is LoadState.Loading -> {
            println("Loading")
        }
        is LoadState.Idle -> {
            println("Idle")
        }
        is LoadState.Success -> {
            println("success : ${(Repository.loadState as LoadState.Success).successStr}")
        }
        is LoadState.Error -> {
            println("Error : ${(Repository.loadState as LoadState.Error).errorStr}")
        }
    }
}