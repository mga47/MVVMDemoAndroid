package am.learn.mvvm.data.repository

import am.learn.mvvm.data.api.ApiHelper
import am.learn.mvvm.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {
    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}