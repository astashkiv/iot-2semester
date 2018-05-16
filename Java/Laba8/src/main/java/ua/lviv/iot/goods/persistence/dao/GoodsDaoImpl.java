<<<<<<< HEAD
package ua.lviv.iot.goods.persistence.dao;

import ua.lviv.iot.goods.goods.Good;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
=======
package persistence.dao;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
>>>>>>> master
import java.io.Serializable;

@Named
@Dependent
<<<<<<< HEAD
class DecorationDaoImpl extends AbstractDao<Good> implements GoodsDao, Serializable {
=======
public class DecorationDaoImpl extends AbstractDao<Good> implements GoodsDao, Serializable {
>>>>>>> master
    private static final long serialVersionUID = 1L;

    @Override
    protected Class<Good> getEntityClass() {
        return Good.class;
    }

}
