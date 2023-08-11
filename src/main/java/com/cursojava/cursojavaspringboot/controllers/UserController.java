package com.cursojava.cursojavaspringboot.controllers;

import com.cursojava.cursojavaspringboot.dao.DaoUser;
import com.cursojava.cursojavaspringboot.models.UsersDataTemp;
import com.cursojava.cursojavaspringboot.utils.JWTUtils;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController{
    @Autowired
    private DaoUser daoUser;
    @Autowired
    private JWTUtils jwtUtils;
    /*@RequestMapping(value = "/test")
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
    }*/

    private boolean validateToken(String token){
        String userId = jwtUtils.getKey(token);

        return userId != null;
    }

    @RequestMapping(value = "/user/allUsers")
    public List<UsersDataTemp> getAllUsers(@RequestHeader(value = "Authorization") String token){
        if(!validateToken(token)){
            return null;
        }
        return daoUser.getAllUsers();
    }

    @RequestMapping(value = "/user/registerUser", method = RequestMethod.POST)
    public void registerUsers(@RequestBody UsersDataTemp usersDataTemp){
        //final byte longMax = 30;//si se aplica esta parte para quitar lo "inutil", falla al verificar el password >:(
        Argon2 agon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);//Para crear hash del password
        String password = usersDataTemp.getPassword();//toma el password
        String hash = agon2.hash(1, 1024, 1, password, Charset.defaultCharset());//crea el hash en base al password
        //hash = hash.substring(longMax);//quita los caracteres innecesarios del hash
        usersDataTemp.setPassword(hash);//setea el password con el hash
        daoUser.registerUser(usersDataTemp);//con esta instrucción guarda en la BD
    }

    @RequestMapping(value = "/user/updateUser")
    public UsersDataTemp updateUser(){
        UsersDataTemp user = new UsersDataTemp();
        return user;
    }

    @RequestMapping(value = "/user/oneUser/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@RequestHeader(value = "Authorization") String token, @PathVariable Long id){
        daoUser.deleteUser(id);
        if(!validateToken(token)){
            return null;
        }
        return "User Deleted";
    }
}