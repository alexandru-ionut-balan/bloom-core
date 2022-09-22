package io.bloom.core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories

@SpringBootApplication
@EnableReactiveMongoRepositories
class BloomCoreApplication

fun main(args: Array<String>) {
    runApplication<BloomCoreApplication>(*args)
}
