package com.dany.hilt.modulec

import android.content.Context
import android.util.Log
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ModuleCFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)

        Log.d("DANY", "Hello from ModuleCFragment!")
    }
}