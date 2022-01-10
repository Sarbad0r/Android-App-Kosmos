package com.example.tree

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.example.tree.Earth.EarthActivity
import com.example.tree.Jupiter.JupiterActivity
import com.example.tree.Mars.MarsActivity
import com.example.tree.MercuryFragment.MercuryActivity
import com.example.tree.Saturn.SaturnActivity
import com.example.tree.Venera.VeneraActivity

class AfterLogin:AppCompatActivity() {

    lateinit var videoAfterLogin : VideoView
    lateinit var ImageMercuty : ImageView
    lateinit var ImageEarth : LinearLayout

    lateinit var ImageVenera : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.after_login_activity)

        videoAfterLogin = findViewById(R.id.videoAfterLogin)
        val path = "android.resource://com.example.tree/"+R.raw.video
        val v : Uri = Uri.parse(path)
        videoAfterLogin.setVideoURI(v)
        videoAfterLogin.start()
        videoAfterLogin.setOnPreparedListener{
            it.isLooping = true
        }

        ImageMercuty = findViewById(R.id.ImageMercury)
        ImageMercuty.setOnClickListener{
            try{
                val intent = Intent(this@AfterLogin, MercuryActivity::class.java)
                startActivity(intent)
            }
            catch (e:Exception){}
        }

        ImageVenera = findViewById(R.id.ImageVenera)
        ImageVenera.setOnClickListener{
            try {
                val intent  = Intent(this@AfterLogin, VeneraActivity::class.java)
                startActivity(intent)
            }
            catch (e:Exception){}
        }

        ImageEarth = findViewById(R.id.ImageEarth)
        ImageEarth.setOnClickListener{
            try{
                val intent = Intent(this@AfterLogin, EarthActivity::class.java)
                startActivity(intent)
            }
            catch (e:Exception){}
        }

        val ImageMars : LinearLayout = findViewById(R.id.ImageMars)
        ImageMars.setOnClickListener{
            try{
                val intent = Intent(this@AfterLogin, MarsActivity::class.java)
                startActivity(intent)
            }
            catch (e : Exception){}
        }

        val ImageJupiter : LinearLayout = findViewById(R.id.ImageJupiter)
        ImageJupiter.setOnClickListener{
            try{
                val intent = Intent(this@AfterLogin, JupiterActivity::class.java)
                startActivity(intent)
            }
            catch (e:Exception){}
        }

        val ImageSaturn : LinearLayout = findViewById(R.id.ImageSaturn)
        ImageSaturn.setOnClickListener{
            try {
                val intent = Intent(this@AfterLogin, SaturnActivity::class.java)
                startActivity(intent)
            }
            catch (e:Exception){}

        }






    }
    override fun onResume() {
        videoAfterLogin.resume()
        super.onResume()

    }

    override fun onPause() {
        videoAfterLogin.suspend()
        super.onPause()
    }

    override fun onDestroy() {
        videoAfterLogin.stopPlayback()
        super.onDestroy()
    }

}