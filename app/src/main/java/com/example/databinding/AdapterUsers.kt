package com.example.databinding

import android.content.Context
import android.database.DatabaseUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.databinding.databinding.RowAdapterUsersBinding

class AdapterUsers (var context: Context, var mList:ArrayList<User>):RecyclerView.Adapter<AdapterUsers.MyViewHolder>(){

    inner class MyViewHolder( var mBinding:RowAdapterUsersBinding):RecyclerView.ViewHolder(mBinding.root){

        fun bind(user:User){
            mBinding.userNames = user
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val binding = RowAdapterUsersBinding.inflate(inflater)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var user = mList[position]
        holder.bind(user)
    }

    override fun getItemCount(): Int {
        return mList.size
    }
}