package cz.secda1.studentWeb.db.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DAOGeneric<T, PK> {

    @PersistenceContext(unitName = "javaTestPostgres")
    protected EntityManager entityManager;



}
