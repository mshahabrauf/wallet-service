package com.bazaar.api.template

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.util.SocketUtils

@SpringBootTest
class BazaarTemplateApplicationTest {


    companion object {
        init {
            System.setProperty("spring.profiles.active", "test")
            System.setProperty("server.port", SocketUtils.findAvailableTcpPort().toString())
        }
    }

    @Test
    fun contextLoads() {
        BazaarTemplateApplication.main()
    }
}