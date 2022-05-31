package com.example.demoapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.demoapi.ViewModels.ViewModelClass
import com.example.demoapi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private lateinit var model: ViewModelClass
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initViewModel()
    }

    private fun initViewModel() {
        model = ViewModelProvider(this)[ViewModelClass::class.java]

        // model.getAllModel()

        //model.getSingleModel()

        model.postModel()

        model.postMutableLiveData.observe(this, Observer {
            Log.d("TAG", "Successfully ")

        })
    }
}