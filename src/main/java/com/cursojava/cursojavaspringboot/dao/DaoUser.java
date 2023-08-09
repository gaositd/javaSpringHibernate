package com.cursojava.cursojavaspringboot.dao;

import com.cursojava.cursojavaspringboot.models.UsersDataTemp;

import java.util.List;

public interface DaoUser {
    List<UsersDataTemp> getAllUsers();

    void deleteUser(Long id);


    //UsersDataTemp getUser(Long id);


}
