package lk.ijse.studentsmanagement.dao.custom.impl;

import lk.ijse.studentsmanagement.dao.custom.SystemUserDAO;
import lk.ijse.studentsmanagement.entity.SystemUser;

import java.sql.Connection;
import java.sql.SQLException;

public class SystemUserImpl implements SystemUserDAO {
    private final Connection connection;

    public SystemUserImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public SystemUser save(SystemUser entity) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public SystemUser update(SystemUser entity) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public SystemUser delete(SystemUser entity) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public SystemUser view(SystemUser entity) throws SQLException, ClassNotFoundException, RuntimeException {
        return null;
    }
}
