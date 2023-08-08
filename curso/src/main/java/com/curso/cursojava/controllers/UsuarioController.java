package com.curso.cursojava.controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.curso.cursojava.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
  @RequestMapping(value = "prueba")
  public List<String> prueba(){
    List<String> list = new ArrayList<String>();
    list.add("Manzana");
    list.add("Pera");
    list.add("Uva");
      return list;
  }

  @RequestMapping(value = "prueba/test")
  public Integer test(){
    int valor = 10;
    return  valor;
  }

  @RequestMapping(value = "/apisw")
  public String apisw(){
    File archivoJson = null;
    FileReader fr = null;
    BufferedReader br = null;
    String linea = null;
    /*try{
      archivoJson = new File("static/json/api.json");
      fr = new FileReader(archivoJson);
      br = new BufferedReader(fr);

      while ((linea = br.readLine()) != null){
        System.out.println("<span>"+linea+"</span>");
      }
    }
    catch (Exception e){
      System.out.println(e.fillInStackTrace());
    }*/
    String salida = "https://swapi.dev/documentation#people";
    return "<a href="+salida+" target=_blank>Api Star Wars</a>";
  }
  //=============================//
  //usuarios
  //=============================//
  @RequestMapping(value = "/user/userJson")
  public Usuario getUsuario(){
    Usuario user = new Usuario();
    user.setId(1L);
    user.setNombre("Daniela Iveth");
    user.setApellidos("Meraz Silva");
    user.setEdad(42);
    user.setDireccion("Hilario moreno #311 Fracc. real del Naranjal");
    user.setEmail("dany@gmail.com");
    user.setPassword("123qweerty.1");

    return user;
  }

  //@RequestMapping(value = "/user/allUsers")
  @RequestMapping(value = "/user/allUsers")
  public List<Usuario> getAllUsers(){
    Usuario user = new Usuario();
    Usuario user2 = new Usuario();
    Usuario user3 = new Usuario();
    List list = new ArrayList<>();

    user.setId(1L);
    user.setNombre("Daniela Iveth");
    user.setApellidos("Meraz Silva");
    user.setTelefono("618 123 4567");
    user.setEdad(42);
    user.setDireccion("Hilario moreno #311 Fracc. real del Naranjal");
    user.setEmail("dany@gmail.com");
    user.setPassword("123qweerty.1");

    user2.setId(2L);
    user2.setNombre("Ayde Cristina");
    user2.setApellidos("Gamez Meraz");
    user2.setTelefono("618 890 1234");
    user2.setEdad(42);
    user2.setDireccion("Hilario moreno #311 Fracc. real del Naranjal");
    user2.setEmail("cristy@gmail.com");
    user2.setPassword("123qweerty.1");

    user3.setId(3L);
    user3.setNombre("Alvaro");
    user3.setApellidos("Gamez Chavez");
    user3.setTelefono("618 123 4567");
    user3.setEdad(42);//no esta en jsonplaceholder
    user3.setDireccion("Hilario moreno #311 Fracc. real del Naranjal");
    user3.setEmail("yomero@gmail.com");
    user3.setPassword("123qweerty.1");

    list.add(user);
    list.add(user2);
    list.add(user3);

    return list;
  }

  @RequestMapping(value = "/user/updateUser")
  public Usuario updateUser(){
    Usuario user = new Usuario();
    return user;
  }

  @RequestMapping(value = "/user/delUser")
  public Usuario delUser(){
    Usuario user = new Usuario();
    return user;
  }

  @RequestMapping(value = "/user/{id}")
  public Usuario findUser(@PathVariable Long id){
    Usuario user = new Usuario();
    user.setId(id);
    user.setNombre("Daniela Iveth");
    user.setApellidos("Meraz Silva");
    user.setTelefono("618-123-4567");
    user.setEdad(42);
    user.setDireccion("Hilario moreno #311 Fracc. real del Naranjal");
    user.setEmail("dany@gmail.com");
    user.setPassword("123qweerty.1");
    return user;
  }

}

