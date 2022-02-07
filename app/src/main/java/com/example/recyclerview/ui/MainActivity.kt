package com.example.recyclerview.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.R
import com.example.recyclerview.data.Data
import com.example.recyclerview.data.RecyclerAdapterClass
import com.example.recyclerview.data.ViewModelFactory
import com.example.recyclerview.data.ViewmodelClass
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var viewmodel: ViewmodelClass
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        var factory = ViewModelFactory()
  viewmodel= ViewModelProvider(this,factory).get(ViewmodelClass::class.java)
binding.myView= viewmodel
binding.lifecycleOwner=this
        initRecyclerView()
}
fun initRecyclerView(){
 binding.recycler.layoutManager = LinearLayoutManager(this)
displayAll()}

    private fun displayAll() {
       viewmodel.dataList.observe(this, Observer{
binding.recycler.adapter= RecyclerAdapterClass(it)
       Log.i("tag",it.toString())})
    }
}







