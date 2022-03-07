package com.kay.progayim

data class ResponseDto(
    val results: List<CharacterDto>
)

data class CharacterDto(
    val id: Long,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val image: String,
    val url: String,
    val created: String,
    val episode: List<String>,
)