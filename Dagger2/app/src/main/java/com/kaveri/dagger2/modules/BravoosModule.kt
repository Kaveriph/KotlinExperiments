package com.kaveri.dagger2.modules

import com.kaveri.dagger2.WarResources.Cash
import com.kaveri.dagger2.WarResources.Soldiers
import dagger.Module
import dagger.Provides

@Module
class BravoosModule() {

    private lateinit var cash: Cash
    private lateinit var soldiers: Soldiers

    constructor(cash: Cash, soldiers: Soldiers) : this() {
        this.cash = cash
        this.soldiers = soldiers
    }

    @Provides
    fun getCash() : Cash{
        return cash
    }

    @Provides
    fun getSoldiers() : Soldiers {
        return  soldiers
    }
}