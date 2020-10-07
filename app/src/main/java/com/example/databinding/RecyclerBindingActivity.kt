package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_binding.*

class RecyclerBindingActivity : AppCompatActivity() {
    var mList:ArrayList<User> = ArrayList()
    private var adapterUser:AdapterUsers? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_binding)
        init()
    }

    private fun init() {
        var user1 = User("Mark","email", "password")
        var user2 = User("Shawn", "email", "password")
        mList.add(user1)
        mList.add(user2)
        adapterUser = AdapterUsers(this, mList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = adapterUser
    }
}