package com.kaveri.dagger2

import javax.inject.Inject

class Bolton : House {

    @Inject
    constructor() {
        println("Bolton created")
    }

    override fun prepareForWar() {
        println("${Bolton::class.java.simpleName} preparing for war...")
    }

    override fun reportForWar() {
        println("${Bolton::class.java.simpleName} reporting for war...")
    }

}