package am.learn.mvvm.data.api

import am.learn.mvvm.data.model.User
import io.reactivex.Single

class ApiHelper(private val apiService: ApiService) {
    fun getUsers(): Single<List<User>> {
        return apiService.getUsers()
    }
}