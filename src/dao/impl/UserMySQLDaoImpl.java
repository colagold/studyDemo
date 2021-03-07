package dao.impl;

import dao.IUserDao;

public class UserMySQLDaoImpl implements IUserDao {
    @Override
    public void getUser() {
        System.out.println("查询Mysql数据库");
    }
}
