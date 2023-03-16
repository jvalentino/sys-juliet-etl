package com.github.jvalentino.juliet.dw.rest

import com.github.jvalentino.juliet.dw.repo.AuthUserRepoDw
import com.github.jvalentino.juliet.dw.repo.DocRepoDw
import com.github.jvalentino.juliet.dw.repo.DocVersionRepoDw
import com.github.jvalentino.juliet.dw.dto.HealthDto
import com.github.jvalentino.juliet.dw.repo.BatchRunRepo
import com.github.jvalentino.juliet.rest.repo.AuthUserRepo
import com.github.jvalentino.juliet.rest.repo.DocRepo
import com.github.jvalentino.juliet.rest.repo.DocVersionRepo
import groovy.transform.CompileDynamic
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * General endpoint for getting debug info
 */
@CompileDynamic
@RestController
@Slf4j
class HealthRest {

    @Autowired
    AuthUserRepo authUserRepo

    @Autowired
    DocRepo docRepo

    @Autowired
    DocVersionRepo docVersionRepo

    @Autowired
    AuthUserRepoDw authUserRepoDw

    @Autowired
    DocRepoDw docRepoDw

    @Autowired
    DocVersionRepoDw docVersionRepoDw

    @Autowired
    BatchRunRepo batchRunRepo

    @GetMapping('/')
    HealthDto health() {
        HealthDto result = new HealthDto()
        result.with {
            sourceAuthUsers = authUserRepo.count()
            sourceDocs = docRepo.count()
            sourceDocVersions = docVersionRepo.count()
            destAuthUsers = authUserRepoDw.count()
            destDocs = docRepoDw.count()
            destDocVersions = docVersionRepoDw.count()
            runs = batchRunRepo.findAll()
        }

        result
    }

}
