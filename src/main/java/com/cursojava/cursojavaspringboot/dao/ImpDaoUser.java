package com.cursojava.cursojavaspringboot.dao;

import com.cursojava.cursojavaspringboot.models.UsersDataTemp;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.hibernate.type.StringNVarcharType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
//@EntityScan("com.server.models")

public class ImpDaoUser implements /*tomará un interface*/ DaoUser/*lo que este en la interface es obligatorio*/{
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<UsersDataTemp> getAllUsers() {
        String qry = "From users";

        return  entityManager.createQuery(qry).getResultList();
    }

    @Override
    public void deleteUser(Long id) {
        UsersDataTemp userDeleted = entityManager.find(UsersDataTemp.class, id);
        entityManager.remove(userDeleted);
    }

    @Override
    public void registerUser(UsersDataTemp usersDataTemp) {
        entityManager.merge(usersDataTemp);
    }

    @Override
    public UsersDataTemp getUserByCredentials(UsersDataTemp usersDataTemp ){
        String qry = "From users Where email= :email";
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String passwordHassed = null;
        boolean boolArgon2;

        List<UsersDataTemp> list = entityManager.createQuery(qry)
            .setParameter("email", usersDataTemp.getEmail())
            .getResultList();

        passwordHassed = list.get(0).getPassword();

        if(!list.isEmpty()){
            if(argon2.verify(passwordHassed,usersDataTemp.getPassword())) {
                return list.get(0);
            }
            return null;
        }else{
            //return list;
            return null;
        }
    }

}
