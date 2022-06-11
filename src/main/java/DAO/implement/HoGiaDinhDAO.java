package DAO.implement;

import DAO.AbstractDAO;
import DAO.IHoGiaDinhDAO;
import model.HoGiaDinh;
import model.Nguoi;
import utils.HoGiaDinhMapper;
import utils.NguoiMapper;
import utils.ObjectMapper;

import java.util.List;


public class HoGiaDinhDAO extends AbstractDAO<HoGiaDinh> implements IHoGiaDinhDAO {
    private ObjectMapper mapper;
    public HoGiaDinhDAO() {
        mapper = new HoGiaDinhMapper();
    }
    @Override
    public List<HoGiaDinh> getAllHoGiaDinh() {
        return select("select * from HoGiaDinh",mapper);
    }

    @Override
    public HoGiaDinh getHoGiaDinh(String id) {
        return null;
    }

    @Override
    public HoGiaDinh addHoGiaDinh(Nguoi nguoi) {
        return null;
    }

    @Override
    public HoGiaDinh updateHoGiaDinh(Nguoi nguoi) {
        return null;
    }

    @Override
    public void deleteHoGiaDinh(String id) {

    }
}
