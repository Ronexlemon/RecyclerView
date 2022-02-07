package com.example.recyclerview.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.databinding.CustomViewBinding

class RecyclerAdapterClass(var data:List<Data>): RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        var binding:CustomViewBinding = DataBindingUtil.inflate(layoutInflater, R.layout.custom_view,parent,false)
        return MyViewHolder(binding)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return  data.size
    }
}
class MyViewHolder(var binding:CustomViewBinding): RecyclerView.ViewHolder(binding.root){
    fun bind(data:Data){
        binding.username1.text = data.username
        binding.email1.text = data.email
    }
}