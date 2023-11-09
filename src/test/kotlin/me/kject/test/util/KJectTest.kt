package me.kject.test.util

import me.kject.KJect
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.TestMethodOrder

@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
class KJectTest {

    companion object {

        var context = "production"

        @BeforeAll
        @JvmStatic
        fun setup() = blocking {
            KJect.launch(this, context)
        }

        @AfterAll
        @JvmStatic
        fun teardown() = blocking {
            KJect.dispose()
        }

    }

}