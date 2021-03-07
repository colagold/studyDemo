package Service.impl;

import Service.IUserService;
import dao.IUserDao;
import dao.impl.UserDaoImpl;

public class UserServiceImpl implements IUserService {
    //依赖注入
    IUserDao dao;

    /**
     * 调用数据访问层
     * @return
     */
    public IUserDao getDao() {
        return dao;
    }

    public void setDao(IUserDao dao) {
        this.dao = dao;
    }

    @Override
    public void getUser() {
        dao.getUser();
    }
}
