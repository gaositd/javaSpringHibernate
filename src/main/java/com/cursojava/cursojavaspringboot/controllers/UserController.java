package com.cursojava.cursojavaspringboot.controllers;

import com.cursojava.cursojavaspringboot.dao.DaoUser;
import com.cursojava.cursojavaspringboot.models.UsersDataTemp;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController{
    @RequestMapping(value = "/test")
    public String test(){
        return "test";
    }

    @RequestMapping(value = "/test/list")
    public List<String> list(){
        List<String> names = new ArrayList<>();
        /*names.add("Daniela Iveth Meraz Silva");
        names.add("Ayde Cristina Gamez Meras");
        names.add("Alvaro Gamez Chavez");*/

        return List.of("Daniela Iveth Meraz Silva", "Daniela Iveth Meraz Silva", "Alvaro Gamez Chavez");
    }

    @RequestMapping(value = "/user/oneUser/{id}")
    public UsersDataTemp getUser(@PathVariable Long id){
        UsersDataTemp usersDataTemp = new UsersDataTemp();

        usersDataTemp.setId(id);
        usersDataTemp.setName("Daniela Iveth");
        usersDataTemp.setLastNames("Meraz Silva");
        usersDataTemp.setAge(42);
        usersDataTemp.setPhoneNumber("6181111111");
        usersDataTemp.setAddress("Hilario Moreno al lado de la casa blanca");

        return usersDataTemp;
    }

    @RequestMapping(value = "/user/allUsers")
    public List<UsersDataTemp> getAllUsers(){
        UsersDataTemp usersDataTemp  = new UsersDataTemp();
        UsersDataTemp usersDataTemp2  = new UsersDataTemp();
        UsersDataTemp usersDataTemp3  = new UsersDataTemp();

        List<UsersDataTemp> users = new ArrayList<UsersDataTemp>();

        usersDataTemp.setId(1L);
        usersDataTemp.setName("Daniela Iveth");
        usersDataTemp.setLastNames("Meraz Silva");
        usersDataTemp.setAge(42);
        usersDataTemp.setPhoneNumber("6181111111");
        usersDataTemp.setAddress("Hilario Moreno al lado de la casa blanca");

        usersDataTemp2.setId(2L);
        usersDataTemp2.setName("Ayde Cristina");
        usersDataTemp2.setLastNames("Gamez Meraz");
        usersDataTemp2.setAge(6);
        usersDataTemp2.setPhoneNumber("6180000000");
        usersDataTemp2.setAddress("Hilario Moreno al lado de la casa blanca");

        usersDataTemp3.setId(3L);
        usersDataTemp3.setName("Alvaro");
        usersDataTemp3.setLastNames("Gamez Chavez");
        usersDataTemp3.setAge(45);
        usersDataTemp3.setPhoneNumber("6182222222");
        usersDataTemp3.setAddress("Hilario Moreno al lado de la casa blanca");

        users.add(usersDataTemp);
        users.add(usersDataTemp2);
        users.add(usersDataTemp3);

        return users;
    }

    @RequestMapping(value = "/user/updateUser")
    public UsersDataTemp updateUser(){
        UsersDataTemp user = new UsersDataTemp();
        return user;
    }

    @RequestMapping(value = "/user/deleteUser")
    public UsersDataTemp deleteUser(){
        UsersDataTemp user = new UsersDataTemp();
        return user;
    }

    @RequestMapping(value = "/user/findUsers")
    public List<UsersDataTemp> findUsers(){
        UsersDataTemp user = new UsersDataTemp();

        return List.of(user);
    }
}