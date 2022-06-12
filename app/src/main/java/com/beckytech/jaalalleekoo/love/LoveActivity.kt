package com.beckytech.jaalalleekoo.love

import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.beckytech.jaalalleekoo.OptionsActivity
import com.beckytech.jaalalleekoo.R
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView

class LoveActivity : OptionsActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        loadLocale()

        setContentView(R.layout.activity_love)

        val mAdView: AdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        val viewPager = findViewById<View>(R.id.viewpager) as ViewPager

        val adapter = LoveFragmentAdapter(supportFragmentManager)

        viewPager.adapter = adapter
    }
}