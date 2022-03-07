package com.kay.progayim

import io.reactivex.Observable
import io.reactivex.Single
import okhttp3.Response
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubApi {

    @GET("/repositories")
    fun getRepositories(): Observable<List<Item>>

    @GET("users/tuleubekov/repos")
    fun getUserRepos(): Observable<ResponseBody>

    @GET("/search/repositories?q=language:kotlin&sort=stars&order=desc&per_page=50")
    fun searchRepositories(): Observable<RepoResult>

    @GET("character")
    fun getCharacters(): Observable<ResponseDto>
}