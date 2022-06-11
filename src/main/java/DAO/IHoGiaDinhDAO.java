package DAO;

import model.HoGiaDinh;
import model.Nguoi;

import java.util.List;

public interface IHoGiaDinhDAO extends GenericDAO<HoGiaDinh>{
    List<HoGiaDinh> getAllHoGiaDinh();
    HoGiaDinh getHoGiaDinh(String id);
    HoGiaDinh addHoGiaDinh(Nguoi nguoi);
    HoGiaDinh updateHoGiaDinh(Nguoi nguoi);
    void deleteHoGiaDinh(String id);
}
