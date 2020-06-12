package logic.mania.covid19_tracker.ui.main

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import logic.mania.covid19_tracker.BuildConfig
import logic.mania.covid19_tracker.R

class ActivitySafety : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_safety1)

        findViewById<View>(R.id.back).setOnClickListener { finish() }
        findViewById<View>(R.id.share).setOnClickListener { share_app() }
        findViewById<View>(R.id.rate).setOnClickListener { rate_app() }

        findViewById<View>(R.id.contact).setOnClickListener {
            val intent =
                Intent(this@ActivitySafety, EmergencyContactActivity::class.java)
            startActivity(intent)
        }
    }


    /*common method for load share*/
    fun share_app() {
        try {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name")
            var shareMessage = "\nLet me recommend you this application for tracking of corona virus cases in india.\n\n"
            shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID + "\n\n"
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage)
            startActivity(Intent.createChooser(shareIntent, "choose one"))
        } catch (e: java.lang.Exception) { //e.toString();
        }
    }

    /*common method for load rate*/
    fun rate_app(){
        val uri = android.net.Uri.parse("market://details?id=" + applicationContext.packageName)
        val goToMarket = Intent(Intent.ACTION_VIEW, uri)
        goToMarket.addFlags(
                Intent.FLAG_ACTIVITY_NO_HISTORY or
                Intent.FLAG_ACTIVITY_NEW_DOCUMENT or
                Intent.FLAG_ACTIVITY_MULTIPLE_TASK
        )
        try {
            startActivity(goToMarket)
        } catch (e: ActivityNotFoundException) {
            startActivity(
                    Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("http://play.google.com/store/apps/details?id=" + applicationContext.packageName)
                    )
            )
        }
    }
    }