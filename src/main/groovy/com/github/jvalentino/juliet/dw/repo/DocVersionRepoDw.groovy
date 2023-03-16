package com.github.jvalentino.juliet.dw.repo

import com.github.jvalentino.juliet.dw.entity.DocVersionDw
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Repository interface for the DocVersion entity
 * @author john.valentino
 */
interface DocVersionRepoDw extends JpaRepository<DocVersionDw, Long> {

}
