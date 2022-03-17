package com.example.controller

import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification


@MicronautTest
class HelloControllerSpec extends Specification {
    @Inject
    EmbeddedServer embeddedServer

    @Inject
    @Client("/")
    HttpClient client
    void "test hello world response"() {
        expect:
            client.toBlocking()
                    .retrieve(HttpRequest.GET('/')) == "Hello World"
    }
}
