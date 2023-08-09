package com.cursojava.cursojavaspringboot.dao;

import com.cursojava.cursojavaspringboot.models.UsersDataTemp;
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

}
