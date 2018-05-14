package persistence.dao;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

@Named
@Dependent
public class DecorationDaoImpl extends AbstractDao<Good> implements GoodsDao, Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    protected Class<Good> getEntityClass() {
        return Good.class;
    }

}
