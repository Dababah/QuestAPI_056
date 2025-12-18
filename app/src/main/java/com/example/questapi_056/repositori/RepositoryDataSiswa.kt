package com.example.questapi_056
.repositori

import com.example.questapi_056
.apiservice.ServiceApiSiswa
import com.example.questapi_056
.modeldata.DataSiswa

:RepositoryDataSiswa{
    override suspend fun getDataSiswa(): List<DataSiswa> = serviceApiSiswa.getSiswa()
    override suspend fun postDataSiswa(dataSiswa: DataSiswa): retrofit2.Response<Void> = serviceApiSiswa.postSiswa(dataSiswa)

}