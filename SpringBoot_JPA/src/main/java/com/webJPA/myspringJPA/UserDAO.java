package com.webJPA.myspringJPA;

import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<UserJPA, Integer> {

}
