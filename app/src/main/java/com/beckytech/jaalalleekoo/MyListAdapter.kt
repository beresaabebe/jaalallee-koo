package com.beckytech.learnafaanoromoo

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.beckytech.jaalalleekoo.R

class MyListAdapter(
    private val context: Activity,
    private val title: Array<String>,
    private val description: Array<String>,
    private val imageid: Array<Int>
) : ArrayAdapter<String>(context, R.layout.list_item, title) {

    @SuppressLint("ViewHolder", "InflateParams")
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.list_item, null, true)

        val titleText = rowView.findViewById(R.id.txtTitle) as TextView
        val subtitleText = rowView.findViewById(R.id.txtContent) as TextView
        val imageView = rowView.findViewById(R.id.imageView) as ImageView

        titleText.text = title[position]
        imageView.setImageResource(imageid[position])
        subtitleText.text = description[position]

        return rowView
    }
}