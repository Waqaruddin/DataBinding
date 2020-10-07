package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var mBinding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main2)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main2)

        mBinding.buttonLogin.setOnClickListener {
            var email = mBinding.editTextEmail.text.toString()
            var password = mBinding.editTextPassword.text.toString()

            Toast.makeText(this, "${email}, ${password}", Toast.LENGTH_SHORT).show()
        }


    }
}