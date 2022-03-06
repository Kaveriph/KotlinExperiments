package com.kaveri.dagger2.components

import com.kaveri.dagger2.Bolton
import com.kaveri.dagger2.Stark
import com.kaveri.dagger2.War
import com.kaveri.dagger2.WarResources.Cash
import com.kaveri.dagger2.WarResources.Soldiers
import com.kaveri.dagger2.modules.BravoosModule
import dagger.Component

@Component(modules = [BravoosModule::class])
interface BattleComponent {
    fun getWar(): War
    fun getStarks(): Stark
    fun getBolton(): Bolton
    fun getCash() : Cash
    fun getSoldiers(): Soldiers
}