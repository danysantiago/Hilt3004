package com.dany.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dany.hilt.base.Starter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var fragmentStarter: Starter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentStarter.navigateToModuleC(R.id.container)
    }
}