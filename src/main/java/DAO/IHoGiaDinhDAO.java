package DAO;

import model.HoGiaDinh;
import model.Nguoi;

import java.util.List;
import model.TableHoGiaDinh;

public interface IHoGiaDinhDAO extends GenericDAO<HoGiaDinh>{
    List<HoGiaDinh> getAllHoGiaDinh();
    HoGiaDinh getHoGiaDinh(String id);
    HoGiaDinh addHoGiaDinh(HoGiaDinh hoGiaDinh);
    HoGiaDinh updateHoGiaDinh(HoGiaDinh hoGiaDinh);
    void deleteHoGiaDinh(String id);
    TableHoGiaDinh getResults();
}
