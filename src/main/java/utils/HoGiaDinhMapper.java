package utils;

import model.HoGiaDinh;
import model.Nguoi;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HoGiaDinhMapper implements ObjectMapper<HoGiaDinh>{

    @Override
    public HoGiaDinh map(ResultSet rs) throws SQLException {
        return new HoGiaDinh(
                rs.getString("id"),
                rs.getString("id_ChuHo"),
                rs.getString("soNha"),
                rs.getString("diaChi"),
                rs.getInt("soNguoi"),
                rs.getString("tinhTrang")
        );
    }
}
