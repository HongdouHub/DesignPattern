package designpattern.no20_flyweight.test1.dao.db;

import designpattern.no20_flyweight.test1.dao.AbsAuthorityDao;

public class RdbAuthorityDaoImpl extends AbsAuthorityDao {

    public RdbAuthorityDaoImpl() {
        initFromDb();
    }

    private void initFromDb() {
        authorityList.addAll(raw);
    }

    @Override
    protected void save() {
        //
    }
}
