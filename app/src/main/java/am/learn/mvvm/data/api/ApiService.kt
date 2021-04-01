package am.learn.mvvm.data.api

import am.learn.mvvm.data.model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}