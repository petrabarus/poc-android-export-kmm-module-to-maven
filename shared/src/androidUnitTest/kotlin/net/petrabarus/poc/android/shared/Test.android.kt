package net.petrabarus.poc.android.shared

import org.junit.Assert.assertTrue
import org.junit.Test

class AndroidGreetingTest {

    @Test
    fun testExample() {
        assertTrue("Check Android is mentioned", Hello().sayHello().contains("Android"))
    }
}