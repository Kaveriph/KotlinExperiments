package com.kaveri.kotlinexperiments.main

import com.kaveri.kotlinexperiments.ErrorHandling.EnumWay.LoadState
import com.kaveri.kotlinexperiments.ErrorHandling.EnumWay.Repository
import com.kaveri.kotlinexperiments.ErrorHandling.AbstractWay.Repository as AbstractWayRepository

fun main() {
    //testEnumState()
}

fun testEnumState() {
    getLoadState()
    Repository.startFetch()
    getLoadState()
    Repository.success()
    getLoadState()
    Repository.error()
    getLoadState()
    Repository.stopFetch()
    getLoadState()
}

fun getLoadState() {
    when(Repository.loadState) {
        LoadState.ERROR -> println("Error")
        LoadState.SUCCESS -> println("Success")
        LoadState.IDLE -> println("Idle")
        LoadState.LOADING -> println("Loading")
    }
}
