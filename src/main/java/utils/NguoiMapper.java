package utils;

import model.Nguoi;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NguoiMapper implements ObjectMapper<Nguoi>{

    @Override
    public Nguoi map(ResultSet rs) throws SQLException {
        return new Nguoi(
            rs.getString("id"),
            rs.getString("ho"),
            rs.getString("ten"),
            rs.getDate("ngaySinh"),
            rs.getString("noiCuTru"),
            rs.getString("noiSinh"),
            rs.getBoolean("gioiTinh"),
            rs.getString("danToc"),
            rs.getString("tonGiao"),
            rs.getString("mqhChuHo"),
            rs.getString("ngheNghiep"),
            rs.getString("soDT"),
            rs.getBoolean("trangThaiHonNhan"),
            rs.getString("id_HoGiaDinh")
        );
    }
}
