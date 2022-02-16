package com.kay.progayim

data class RepoResult(
    val items: List<Item>
)

data class Item(
    val id: Long?,
    val name: String?,
    val fullName: String?,
    val owner: Owner,
    val private: Boolean,
    val htmlUrl: String?,
    val description: String?
)

data class Owner(val login: String?, val id: Long?, val avatarUrl: String?)