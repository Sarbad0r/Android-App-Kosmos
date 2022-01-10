@file:Suppress("DEPRECATION")

package com.example.tree

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
import android.view.Window
import android.widget.Button
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class GetStarted:AppCompatActivity() {

    lateinit var getStarted: Button
    lateinit var videoKosmos: VideoView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)


        setContentView(R.layout.get_started_activity)

        videoKosmos = findViewById(R.id.videoKosmos)

        getStarted = findViewById(R.id.getStarted)
        val path = "android.resource://com.example.tree/" + R.raw.videokosmos
        val u: Uri = Uri.parse(path)
        videoKosmos.setVideoURI(u)
        videoKosmos.start()
        videoKosmos.setOnPreparedListener {
            it.isLooping = true
        }
        getStarted.setOnClickListener {
            val intent = Intent(this@GetStarted, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
        }


    }

    override fun onResume() {
        videoKosmos.resume()
        super.onResume()

    }

    override fun onPause() {
        videoKosmos.suspend()
        super.onPause()
    }

    override fun onDestroy() {
        videoKosmos.stopPlayback()
        super.onDestroy()
    }
}