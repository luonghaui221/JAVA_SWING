package DAO.implement;

import DAO.AbstractDAO;
import DAO.IAdminDAO;
import model.Admin;
import utils.AdminMapper;
import utils.HoGiaDinhMapper;
import utils.ObjectMapper;

import java.util.*;

public class AdminDAO extends AbstractDAO<Admin> implements IAdminDAO {
    private ObjectMapper mapper;
    public AdminDAO() {
        mapper = new AdminMapper();
    }
    @Override
    public boolean verifyLogin(String username, String password) {
        List<Admin> results = select("select * from administrator where userName = ? and password = ?",mapper,username,password);
        return results.size() > 0 ? true : false;
    }
}
