package com.beckytech.jaalalleekoo

import android.content.res.Configuration
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import java.util.*


open class OptionsActivity: AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            showChangeLanguageDialog()
        }

        return super.onOptionsItemSelected(item)
    }

    private fun showChangeLanguageDialog() {
        val listItems = arrayOf("Afaan Oromoo", "English", "አማርኛ", "ትግሪኛ", "عربي")
        val builder: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this)
        builder.setTitle(resources.getString(R.string.change_language))
        builder.setSingleChoiceItems(listItems, -1) { dialogInterface, i ->
            if (i == 0) {
                setLocale("om")
                recreate()
            } else if (i == 1) {
                setLocale("en")
                recreate()
            } else if (i == 2) {
                setLocale("am")
                recreate()
            } else if (i == 3) {
                setLocale("ti")
                recreate()
            } else if (i == 4) {
                setLocale("ar")
                recreate()
            }
            // dismiss alert dialog
            dialogInterface.dismiss()
        }
        builder.create()?.show()
    }

    private fun setLocale(lang: String?) {
        val locale = Locale(lang)
        Locale.setDefault(locale)
        val configuration = Configuration()
        configuration.locale = locale
        baseContext.resources.updateConfiguration(
            configuration,
            baseContext.resources.displayMetrics
        )
        val editor = getSharedPreferences("Settings", MODE_PRIVATE).edit()
        editor.putString("My_Lang", lang)
        editor.apply()
    }

    fun loadLocale() {
        val preferences = getSharedPreferences("Settings", MODE_PRIVATE)
        val language = preferences.getString("My_Lang", "")
        setLocale(language)
    }
}