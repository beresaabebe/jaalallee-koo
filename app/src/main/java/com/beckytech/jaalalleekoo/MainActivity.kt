package com.beckytech.jaalalleekoo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ListView
import com.beckytech.jaalalleekoo.love.LoveActivity
import com.beckytech.learnafaanoromoo.MyListAdapter
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView


class MainActivity : OptionsActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        loadLocale()

        setContentView(R.layout.activity_main)

        val mAdView: AdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        val language = arrayOf(
            getString(R.string.love),
            getString(R.string.family),
            getString(R.string.beauty),
            getString(R.string.attitude),
            getString(R.string.inspirational),
            getString(R.string.dream),
            getString(R.string.friendship),
            getString(R.string.funny),
            getString(R.string.positive),
            getString(R.string.motivational),
            getString(R.string.life)
        )

        val description = arrayOf(
            "C++ is an object-oriented programming language.",
            "Java is a programming language and a platform.",
            "C programming is considered as the base for other programming languages",
            "C++ is an object-oriented programming language.",
            "Java is a programming language and a platform.",
            "C programming is considered as the base for other programming languages",
            "C++ is an object-oriented programming language.",
            "C programming is considered as the base for other programming languages",
            "Java is a programming language and a platform.",
            "C programming is considered as the base for other programming languages",
            "Java is a programming language and a platform.",
        )

        val imageId = arrayOf(
            R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,R.drawable.ic_launcher_foreground
        )

        val myListAdapter = MyListAdapter(this, language, description, imageId)

        val listView: ListView = findViewById(R.id.listView)

        listView.adapter = myListAdapter

        listView.setOnItemClickListener{ _, _, position, _ ->
            if (position == 0) startActivity(Intent(this, LoveActivity::class.java))
        }

    }
}