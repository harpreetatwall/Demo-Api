package com.example.demoapi.ViewModels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.demoapi.Models.GetAllData.GetAllData
import com.example.demoapi.Models.PostData.PostReq
import com.example.demoapi.Models.PostData.PostResponse
import com.example.demoapi.Models.SinglData.GetSingleData
import com.example.demoapi.Repository.RepoClass
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ViewModelClass  : ViewModel(){


    val getAllMutableLiveData:MutableLiveData<GetAllData> = MutableLiveData()
    val getSingleMutableLiveData:MutableLiveData<GetSingleData> = MutableLiveData()
    val postMutableLiveData:MutableLiveData<PostResponse> = MutableLiveData()


//    fun getAllModel(){
//        val response=RepoClass.getAllTRepoData()
//        response.enqueue(object  : Callback<GetAllData>{
//            override fun onResponse(call: Call<GetAllData>, response: Response<GetAllData>) {
//                getAllMutableLiveData.postValue(response.body())
//                Log.d("TAG", response.body().toString())
//            }
//
//            override fun onFailure(call: Call<GetAllData>, t: Throwable) {
//                TODO("Not yet implemented")
//            }
//
//        })
//    }

//    fun getSingleModel() {
//        val response = RepoClass.getSingleRepoData()
//        response.enqueue(object : Callback<GetSingleData>{
//            override fun onResponse(call: Call<GetSingleData>, response: Response<GetSingleData>) {
//               getSingleMutableLiveData.postValue(response.body())
//                Log.d("TAG", response.body().toString())
//            }
//
//            override fun onFailure(call: Call<GetSingleData>, t: Throwable) {
//                TODO("Not yet implemented")
//            }
//
//        })
//
//    }

    fun postModel(){
        val  req=PostReq("Android Dev","Harpreet Atwal")
        val response=RepoClass.postRepoData(req)
        response.enqueue(object  : Callback<PostResponse>{
            override fun onResponse(call: Call<PostResponse>, response: Response<PostResponse>) {
              postMutableLiveData.postValue(response.body())
                Log.d("TAG", response.body().toString())
            }

            override fun onFailure(call: Call<PostResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }

}