package com.example.demoapi.Interfaces

import com.example.demoapi.Models.GetAllData.GetAllData
import com.example.demoapi.Models.PostData.PostReq
import com.example.demoapi.Models.PostData.PostResponse
import com.example.demoapi.Models.SinglData.GetSingleData
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiCall {

    @GET("/api/users?page=2")
    fun getAllData():Call<GetAllData>

    @GET("/api/users/2")
    fun getSingleData():Call<GetSingleData>

    @POST("/api/users")
    fun postData(@Body req: PostReq):Call<PostResponse>

}