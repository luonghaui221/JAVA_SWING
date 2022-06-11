/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.TableHoGiaDinh;

/**
 *
 * @author luong
 */
public class TableHoGiaDinhMapper implements ObjectMapper<TableHoGiaDinh>{
    @Override
    public TableHoGiaDinh map(ResultSet rs) throws SQLException {
        return new TableHoGiaDinh(rs);
    }
}
