package com.github.jvalentino.juliet.dw.repo

import com.github.jvalentino.juliet.dw.entity.AuthUserDw
import org.springframework.data.repository.PagingAndSortingRepository

/**
 * Repository interface for the AuthUser entity
 * @author john.valentino
 */
interface AuthUserRepoDw extends PagingAndSortingRepository<AuthUserDw, Long> {

}
