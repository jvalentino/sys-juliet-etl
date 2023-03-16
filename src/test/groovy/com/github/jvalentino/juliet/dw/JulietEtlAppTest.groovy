package com.github.jvalentino.juliet.dw

import com.github.jvalentino.juliet.dw.JulietEtlApp
import org.springframework.boot.SpringApplication
import spock.lang.Specification

class JulietEtlAppTest extends Specification {

    def setup() {
        GroovyMock(SpringApplication, global:true)
    }

    def "test main"() {
        when:
        JulietEtlApp.main(null)

        then:
        1 * SpringApplication.run(JulietEtlApp, null)
    }

}
