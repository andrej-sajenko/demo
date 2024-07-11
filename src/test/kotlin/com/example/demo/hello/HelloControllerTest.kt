package com.example.demo.hello

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.server.LocalServerPort


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControllerTest {

    @LocalServerPort
    private var port: Int = 0

    private val baseUrl: String
        get() = "http://localhost:$port"

    @Autowired
    private val restTemplate: TestRestTemplate? = null

    @Test
    fun `hello controller returns result`() {
        val endpoint = "$baseUrl/hello"

        val expected = "Hello, World!"

        val response = restTemplate!!.getForEntity(endpoint, String::class.java)

        assertEquals(expected, response.body)
    }
}