package io.bloom.core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BloomCoreApplication

fun main(args: Array<String>) {
    runApplication<BloomCoreApplication>(*args)
}
