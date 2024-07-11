package com.example.demo.hello

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.assertj.core.api.Assertions.assertThat

@SpringBootTest
class HelloSmokeTest {

    @Autowired
    private val controller: HelloController? = null

    @Test
    @Throws(Exception::class)
    fun `hello controller initializes correctly`() {
        assertThat(controller).isNotNull()
    }
}