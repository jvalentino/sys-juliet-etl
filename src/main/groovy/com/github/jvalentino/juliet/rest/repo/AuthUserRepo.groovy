package com.github.jvalentino.juliet.rest.repo

import com.github.jvalentino.juliet.rest.entity.AuthUser
import org.springframework.data.repository.PagingAndSortingRepository

/**
 * Repository interface for the AuthUser entity
 * @author john.valentino
 */
interface AuthUserRepo extends PagingAndSortingRepository<AuthUser, Long> {

}
