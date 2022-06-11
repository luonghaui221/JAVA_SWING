package DAO;

import model.Nguoi;

import java.util.*;


public interface INguoiDAO extends GenericDAO<Nguoi> {
    public List<Nguoi> getAllNguoi();
    public Nguoi getNguoi(String id);
    public Nguoi addNguoi(Nguoi nguoi);
    public Nguoi updateNguoi(Nguoi nguoi);
    public void deleteNguoi(String id);
}
