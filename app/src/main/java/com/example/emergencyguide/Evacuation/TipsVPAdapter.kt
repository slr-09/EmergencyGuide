package com.example.emergencyguide.Evacuation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class TipsVPAdapter (fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> EvacuateTipsFragment("지진")
            1 -> EvacuateTipsFragment("화재")
            else -> throw IllegalStateException("Unexpected position $position")
        }
    }
}