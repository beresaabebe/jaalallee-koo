package com.beckytech.jaalalleekoo.love

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class LoveFragmentAdapter (
    fm: FragmentManager?
) : FragmentPagerAdapter(fm!!) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> Augustine()
            1 -> BindEverything()
            2 -> Elbert()
            3 -> Henry()
            4 -> InLove()
            5 -> Jack()
            6 -> James()
            7 -> John4()
            8 -> LoveFragmentOne()
            9 -> LoveFragmentTwo()
            10 -> LoveFragmentThree()
            11 -> LoveIs()
            12 -> Martin()
            13 -> Maya()
            14 -> Olaf()
            15 -> Pooh()
            16 -> Rick()
            17 -> Romans10()
            else -> ThreeRemains()
        }
    }

    override fun getCount(): Int {
        return 20
    }
}