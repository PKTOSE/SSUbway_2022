package com.example.practice1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListViewModel : ViewModel() {
    private val repo = Repo()
    fun fetchData(): LiveData<MutableList<DelayInfo>> {
        val mutableData = MutableLiveData<MutableList<DelayInfo>>()
        repo.getData().observeForever{
            mutableData.value = it
        }
        return mutableData
    }
}