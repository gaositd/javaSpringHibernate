/*con proyectlombok nos ahorramos código en getters y setters agregando anotaciones @getter, @setter en cada
    variable; pom.mxl se agrega lo de abajo en el apartado de dependencias

    <dependency>
		<groupId>org.projectlombok</groupId>
		<artifactId>lombok</artifactId>
		<version>1.18.28</version>
		<scope>provided</scope>
	</dependency>
*/
package com.cursojava.cursojavaspringboot.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity(name = "users")//anotación para hacer referencia a la BD
@Table(name = "users")//nombre que tomará para hacer consultas, puede ser cambiado
@ToString
public class UsersDataTemp {
//los campos de la base de datos deben estar aquí, el mismo orden de los campos debe estar en la BD y este archivo
    @Id//indica que es la llave primaria
    @Getter @Setter @Column(name = "id")//en este punto no se columnas traer con la anotación @colum indicamos cual es
    private Long id;

    @Getter @Setter @Column(name = "names")
    private String names;

    @Getter @Setter @Column(name = "lastnames")
    private String lastNames;

    @Getter @Setter @Column(name = "email")
    private String email;

    @Getter @Setter @Column(name = "address")
    private String address;

    @Getter @Setter @Column(name = "age")
    private int age;

    @Getter @Setter @Column(name = "phonenumber")
    private String phoneNumber;

    @Getter @Setter @Column(name = "password")
    private  String password;
}
