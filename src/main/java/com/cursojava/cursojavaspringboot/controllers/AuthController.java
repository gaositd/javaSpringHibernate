package com.cursojava.cursojavaspringboot.controllers;

import com.cursojava.cursojavaspringboot.dao.DaoUser;
import com.cursojava.cursojavaspringboot.models.UsersDataTemp;
import com.cursojava.cursojavaspringboot.utils.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private DaoUser daoUser;

    @Autowired
    private JWTUtils jwtUtils;

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public String userLogin(@RequestBody UsersDataTemp usersDataTemp){
        String token = null;
        UsersDataTemp loggedUser = daoUser.getUserByCredentials(usersDataTemp);

        if(loggedUser != null){
            token = jwtUtils.create(String.valueOf(loggedUser.getId()),loggedUser.getEmail());
            return token;
        }else {
             return "Fail";
        }
    }
}
