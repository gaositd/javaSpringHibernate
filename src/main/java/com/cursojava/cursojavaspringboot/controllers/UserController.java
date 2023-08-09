package com.cursojava.cursojavaspringboot.controllers;

import com.cursojava.cursojavaspringboot.dao.DaoUser;
import com.cursojava.cursojavaspringboot.models.UsersDataTemp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController{
    @Autowired
    private DaoUser daoUser;
    @RequestMapping(value = "/test")
    public String test(){
        return "test";
    }

    @RequestMapping(value = "/test/list")
    public List<String> list(){
        List<String> names = new ArrayList<>();

        return List.of("Daniela Iveth Meraz Silva", "Daniela Iveth Meraz Silva", "Alvaro Gamez Chavez");
    }

    @RequestMapping(value = "/user/oneUser/{id}")
    public UsersDataTemp getUser(@PathVariable Long id){
        return null;
    }

    @RequestMapping(value = "/user/allUsers")
    public List<UsersDataTemp> getAllUsers(){
        return daoUser.getAllUsers();
    }

    @RequestMapping(value = "/user/updateUser")
    public UsersDataTemp updateUser(){
        UsersDataTemp user = new UsersDataTemp();
        return user;
    }

    @RequestMapping(value = "/user/oneUser/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id){
        daoUser.deleteUser(id);

        return "User Deleted";
    }
}