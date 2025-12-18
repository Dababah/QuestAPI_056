package com.example.questapi_056
.apiservice

import com.example.questapi_056
.modeldata.DataSiswa
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ServiceApiSiswa{


    @POST("insertTM.php")
    suspend fun  postSiswa(@Body dataSiswa: DataSiswa):retrofit2.Response<Void>
}