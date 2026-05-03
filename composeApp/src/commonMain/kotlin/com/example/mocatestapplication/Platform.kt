package com.example.mocatestapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform