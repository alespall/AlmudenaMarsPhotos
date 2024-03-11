package com.example.marsphotos.data
import com.example.marsphotos.model.MarsPhoto

interface MarsPhotosRepository {
    suspend fun getMarsPhotos(): List<MarsPhoto>
}
class NetworkMarsPhotosRepository(
    private val marsApiService: com.example.marsphotos.fake.FakeMarsApiService
) : MarsPhotosRepository {
    /** Fetches list of MarsPhoto from marsApi*/
    override suspend fun getMarsPhotos(): List<MarsPhoto> = marsApiService.getPhotos()
}