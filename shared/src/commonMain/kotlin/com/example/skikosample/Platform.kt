package com.example.skikosample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform