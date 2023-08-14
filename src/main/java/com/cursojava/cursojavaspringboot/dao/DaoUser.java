package com.cursojava.cursojavaspringboot.dao;

import com.cursojava.cursojavaspringboot.models.UsersDataTemp;

import java.util.List;

public interface DaoUser {
    List<UsersDataTemp> getAllUsers();

    void deleteUser(Long id);

    void registerUser(UsersDataTemp usersDataTemp);

    public UsersDataTemp getUser(Long id);

    public boolean updateUser( UsersDataTemp usersDataTemp);

    UsersDataTemp getUserByCredentials(UsersDataTemp usersDataTemp);


}
