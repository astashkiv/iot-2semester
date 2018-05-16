package ua.lviv.iot.goods.persistence.dao;

import ua.lviv.iot.goods.goods.Good;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import java.io.Serializable;

@Named
@Dependent
class DecorationDaoImpl extends AbstractDao<Good> implements GoodsDao, Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    protected Class<Good> getEntityClass() {
        return Good.class;
    }

}
