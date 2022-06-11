package DAO.implement;

import DAO.AbstractDAO;
import DAO.IHoGiaDinhDAO;
import model.HoGiaDinh;
import model.Nguoi;
import utils.HoGiaDinhMapper;

import java.util.List;
import model.TableHoGiaDinh;
import utils.TableHoGiaDinhMapper;


public class HoGiaDinhDAO extends AbstractDAO<HoGiaDinh> implements IHoGiaDinhDAO {
    @Override
    public List<HoGiaDinh> getAllHoGiaDinh() {
        return select("select * from HoGiaDinh",new HoGiaDinhMapper());
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

    @Override
    public TableHoGiaDinh getResults() {
        try{
            List<TableHoGiaDinh> list = getResults("select * from HoGiaDinh",new TableHoGiaDinhMapper());
            return list.isEmpty() ? null : list.get(0);
        }catch(Exception e){
            return null;
        }
    }
}
