package com.kaveri.kotlinexperiments.ErrorHandling.AbstractWay


fun main(){
    testAbstractWay()
}

fun testAbstractWay() {
    getLoadStateAbstractWAY()
    Repository.startFetch()
    getLoadStateAbstractWAY()
    Repository.success("well done")
    getLoadStateAbstractWAY()
    Repository.error("Uh oh !")
    getLoadStateAbstractWAY()
    Repository.stopFetch()
    getLoadStateAbstractWAY()
    Repository.throwException("NullPointerException")
    getLoadStateAbstractWAY()
}


fun getLoadStateAbstractWAY() {
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