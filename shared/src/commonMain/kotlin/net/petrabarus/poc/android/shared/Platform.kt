package net.petrabarus.poc.android.shared

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform