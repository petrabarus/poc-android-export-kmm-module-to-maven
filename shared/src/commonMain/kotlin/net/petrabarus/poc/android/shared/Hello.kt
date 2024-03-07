package net.petrabarus.poc.android.shared

class Hello {
    private val platform: Platform = getPlatform()

    fun sayHello(): String {
        return "Mr. ${platform.name}!"
    }
}