package com.example.mobile3_week2

import androidx.lifecycle.*

class LifecycleObserver(val viewModel: ViewModelClass) : DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)

        val t = DisplayList("Created")
        viewModel.addText(t)

    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)

        val t = DisplayList("Resumed")
        viewModel.addText(t)
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)

        val t = DisplayList("Paused")
        viewModel.addText(t)
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)

        val t = DisplayList("Destroyed")
        viewModel.addText(t)
    }
}