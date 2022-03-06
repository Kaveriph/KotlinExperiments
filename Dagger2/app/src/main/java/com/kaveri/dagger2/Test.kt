package com.kaveri.dagger2

import com.kaveri.dagger2.WarResources.Cash
import com.kaveri.dagger2.WarResources.Soldiers
import com.kaveri.dagger2.components.BattleComponent
import com.kaveri.dagger2.components.DaggerBattleComponent
import com.kaveri.dagger2.modules.BravoosModule

fun main() {
   /* val stark = Stark()
    val bolton = Bolton()
    var war = War(stark, bolton)*/
    //var daggerBattleComponent = BattleComponent.B
    val cash = Cash()
    val soldiers = Soldiers()
    val bravoosModule = BravoosModule(cash, soldiers)
    var battleComponent = DaggerBattleComponent.builder().bravoosModule(bravoosModule).build()
    battleComponent.getWar().prepare()
    battleComponent.getCash()
}