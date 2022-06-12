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

class Olaf : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_love_one, container, false)

        val mAdView: AdView = view.findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)

        val textContent: TextView = view.findViewById(R.id.textContent)

        textContent.text = getString(R.string.love_is_putting)

        val textAuthor: TextView = view.findViewById(R.id.txtAuthor)

        textAuthor.text = getString(R.string.olaf)

        val image: ImageView = view.findViewById(R.id.imageView)

        image.setImageResource(R.drawable.olaf)

        return view
    }
}