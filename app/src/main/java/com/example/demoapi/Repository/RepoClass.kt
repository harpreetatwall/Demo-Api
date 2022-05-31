package com.example.demoapi.Repository

import com.example.demoapi.Models.GetAllData.GetAllData
import com.example.demoapi.Models.PostData.PostReq
import com.example.demoapi.Models.PostData.PostResponse
import com.example.demoapi.Models.SinglData.GetSingleData
import com.example.demoapi.Objects.RetrofitInstance
import retrofit2.Call

class RepoClass {
    companion object{
        fun getAllTRepoData():Call<GetAllData>{
            return RetrofitInstance.apiCall.getAllData()
        }

        fun getSingleRepoData():Call<GetSingleData>{
            return RetrofitInstance.apiCall.getSingleData()
        }

        fun postRepoData(req: PostReq):Call<PostResponse>{
            return RetrofitInstance.apiCall.postData(req)
        }

    }
}