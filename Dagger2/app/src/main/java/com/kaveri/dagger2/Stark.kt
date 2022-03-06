package com.kaveri.dagger2

import javax.inject.Inject

class Stark : House {

    @Inject
    constructor() {
        println("stark created")
    }

    override fun prepareForWar() {
        println("${Stark::class.java.simpleName} preparing for war...")
    }

    override fun reportForWar() {
        println("${Stark::class.java.simpleName} reporting for war...")
    }
}