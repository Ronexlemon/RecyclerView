package com.example.recyclerview.data

import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewmodelClass : ViewModel() , Observable {
    @Bindable
    var inputUsername = MutableLiveData<String>()
    @Bindable
    var inputEmail = MutableLiveData<String>()
    var dataList = MutableLiveData<List<Data>>()
    var lst = mutableListOf<Data>()
  var hintUsername = MutableLiveData<String>()
    var hintEmail = MutableLiveData<String>()
    init {
        hintUsername.value ="username"
        hintEmail.value ="Email@gmail.com"

    }
    fun add(){
        var name:String = inputUsername.value!!
        var email:String = inputEmail.value!!
        var hold = Data(name,email)
        lst.add(hold)
        dataList.value=lst
        inputEmail.value = " "
        inputUsername.value = " "



    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }


}