package com.example.questapi_056
.repositori

import com.example.questapi_056
.apiservice.ServiceApiSiswa
import com.example.questapi_056
.modeldata.DataSiswa

interface RepositoryDataSiswa{
    suspend fun getDataSiswa() : List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa) :retrofit2.Response<Void>
    //suspend fun getStatusSiswa(id:Int) : DataSiswa
    //suspend fun editStatusSiswa(id:Int,dataSiswa: DataSiswa) :retrofitr.Response<Void)
    //suspend fun hapusStatusSiswa(id:Int) :retrofitr.Response<Void)
}
