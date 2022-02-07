package com.example.recyclerview.data

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
       if(modelClass.isAssignableFrom(ViewmodelClass::class.java)){
           return  ViewmodelClass() as T
       }
        throw IllegalArgumentException("Unknown ViewModelClass")
    }

}