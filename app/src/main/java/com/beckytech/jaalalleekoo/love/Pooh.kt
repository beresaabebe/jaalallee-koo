package com.beckytech.jaalalleekoo.love

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.beckytech.jaalalleekoo.R
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView

class Pooh : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_love_one, container, false)

        val mAdView: AdView = view.findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        val textContent: TextView = view.findViewById(R.id.textContent)

        textContent.text = getString(R.string.how_do_you_spell)

        val textAuthor: TextView = view.findViewById(R.id.txtAuthor)

        textAuthor.text = getString(R.string.pooh)

        val image: ImageView = view.findViewById(R.id.imageView)

        image.setImageResource(R.drawable.pooh)

        return view
    }
}