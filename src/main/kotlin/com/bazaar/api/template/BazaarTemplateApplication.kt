package com.bazaar.api.template

import com.bazaar.platform.sdk.PlatformAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(value = [PlatformAutoConfiguration::class])
class BazaarTemplateApplication {

    companion object {
        const val BASE_PACKAGES = "com.bazaar.api.template"

        @JvmStatic
        fun main(vararg args: String) {
            runApplication<BazaarTemplateApplication>(*args)
        }
    }

}