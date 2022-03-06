package com.kaveri.dagger2

import javax.inject.Inject

class War {

    private var stark: Stark
    private var bolton: Bolton

    @Inject
    constructor(stark: Stark, bolton: Bolton) {
        this.stark = stark
        this.bolton = bolton
    }

    fun prepare() {
        stark.prepareForWar()
        bolton.prepareForWar()
        stark.reportForWar()
        bolton.reportForWar()
    }

}