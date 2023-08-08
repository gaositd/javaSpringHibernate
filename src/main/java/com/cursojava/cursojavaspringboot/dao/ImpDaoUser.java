package com.cursojava.cursojavaspringboot.dao;

import com.cursojava.cursojavaspringboot.models.UsersDataTemp;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
/*
para poder usar @Transactional es necesario tener en el PON.XML lo siguinte
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-tx</artifactId>
    <version>5.3.29</version>
</dependency>
de no tener esto ni a patadas funciona
* */
public class ImpDaoUser implements /*tomara un interface*/ DaoUser/*lo que este en la interface es obligatorio*/{
    @Override
    public List<UsersDataTemp> getAllUsers() {
        return null;
    }
}
