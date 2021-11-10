package com.dany.hilt.base

import androidx.fragment.app.FragmentActivity
import com.dany.hilt.modulec.ModuleCFragment
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object FragmentStarterModule {

    @Provides
    fun provideStarter(activity: FragmentActivity) = Starter(activity)
}

class Starter constructor(private val activity: FragmentActivity) {
    fun navigateToModuleC(containerId: Int) {
        activity.supportFragmentManager.beginTransaction()
            .add(containerId, ModuleCFragment())
            .commit()
    }
}