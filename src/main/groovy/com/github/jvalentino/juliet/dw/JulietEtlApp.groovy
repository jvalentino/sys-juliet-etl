package com.github.jvalentino.juliet.dw

import groovy.transform.CompileDynamic
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.scheduling.annotation.EnableScheduling

/**
 * Main class
 * @author john.valentino
 */
@SpringBootApplication
@CompileDynamic
@EnableScheduling
class JulietEtlApp {

    static void main(String[] args) {
        SpringApplication.run(JulietEtlApp, args)
    }

}
