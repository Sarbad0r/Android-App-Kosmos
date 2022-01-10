package com.example.tree

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.MenuItem
import android.view.Window
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    lateinit var main_dialog : Dialog
    lateinit var button_log_activity: Button
    lateinit var button_reg_activity : Button

    lateinit var editTextTextEmailAddress2 : EditText
    lateinit var editTextTextPassword : EditText


    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextTextEmailAddress2 = findViewById(R.id.editTextTextEmailAddress2)
        editTextTextPassword = findViewById(R.id.editTextTextPassword)

        main_dialog = Dialog(this)
        main_dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        main_dialog.setContentView(R.layout.dialog_main_activity)
        main_dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        main_dialog.setCancelable(false)

        button_log_activity = findViewById(R.id.button_log_activity)
        button_log_activity.setOnClickListener {


            if (editTextTextEmailAddress2.text.toString().isEmpty()){
                Toast.makeText(this, "Your email place is empty", Toast.LENGTH_LONG)
            }
            else if(editTextTextPassword.text.toString().isEmpty()){
                Toast.makeText(this, "Your password place is empty", Toast.LENGTH_LONG)
            }
            else{
                val auth  :FirebaseAuth = FirebaseAuth.getInstance()
                auth.signInWithEmailAndPassword(editTextTextEmailAddress2.text.toString(), editTextTextPassword.text.toString())
                    .addOnCompleteListener{
                        if (it.isSuccessful){
                            val intent = Intent(this@MainActivity, AfterLogin::class.java)
                            startActivity(intent)
                        }
                        else{
                            Toast.makeText(this, "you have some errors" , Toast.LENGTH_LONG)
                        }
                    }
            }
        }



        button_reg_activity = findViewById(R.id.button_reg_activity)
        button_reg_activity.setOnClickListener {

            if (editTextTextEmailAddress2.text.isEmpty()){
                Toast.makeText(this, "Your email place is empty", Toast.LENGTH_LONG)
            }
            else if(editTextTextPassword.text.isEmpty()){
                Toast.makeText(this, "Your password place is empty", Toast.LENGTH_LONG)
            }
            else{
                val auth  :FirebaseAuth
                auth = FirebaseAuth.getInstance()
                auth.createUserWithEmailAndPassword(editTextTextEmailAddress2.text.toString(), editTextTextPassword.text.toString())
                    .addOnCompleteListener{
                        if (it.isSuccessful){
                            Toast.makeText(this, "You registered" , Toast.LENGTH_LONG).show()
                            Toast.makeText(this, "Now, Log in" , Toast.LENGTH_LONG).show()
                        }
                        else{
                            Toast.makeText(this, "This user have already registered" , Toast.LENGTH_LONG).show()
                        }
                    }
            }


        }

    }

    override fun onDestroy() {
        super.onDestroy()
    }

}

