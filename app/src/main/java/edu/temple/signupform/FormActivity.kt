package edu.temple.signupform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = (findViewById<Button>(R.id.editTextTextPersonName)as EditText)
        val emailAdd = (findViewById<Button>(R.id.editTextTextEmailAddress)as EditText)
        val pass = (findViewById<Button>(R.id.editTextTextPassword)as EditText)
        val conPass = (findViewById<Button>(R.id.editTextTextPassword2)as EditText)
        findViewById<Button>(R.id.button).setOnClickListener {
            if (name.text.isEmpty()) Toast.makeText(applicationContext, "Name is required.", Toast.LENGTH_SHORT).show()
            if (emailAdd.text.isEmpty()) Toast.makeText(applicationContext, "Email is required.", Toast.LENGTH_SHORT).show()
            if (pass.text.isEmpty()) Toast.makeText(applicationContext, "Password is required.", Toast.LENGTH_SHORT).show()
            if (conPass.text.isEmpty()) Toast.makeText(applicationContext, "Password Confirmation is required.", Toast.LENGTH_SHORT).show()
            if (pass.text.toString() != conPass.text.toString())Toast.makeText(applicationContext, "Passwords must match.", Toast.LENGTH_SHORT).show()
            if (name.text.isNotEmpty() && emailAdd.text.isNotEmpty() && pass.text.isNotEmpty() && conPass.text.isNotEmpty()) {
                Toast.makeText(applicationContext, "Welcome, ${name.text}!", Toast.LENGTH_SHORT).show()
            }
        }
    }

}