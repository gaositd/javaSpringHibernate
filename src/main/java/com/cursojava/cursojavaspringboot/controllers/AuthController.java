package com.cursojava.cursojavaspringboot.controllers;

import com.cursojava.cursojavaspringboot.dao.DaoUser;
import com.cursojava.cursojavaspringboot.models.UsersDataTemp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private DaoUser daoUser;

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public String userLogin(@RequestBody UsersDataTemp usersDataTemp){
        if(daoUser.checkCredentials(usersDataTemp)){
            return "OK";
        }else {
             return "Fail";
        }
    }
}
