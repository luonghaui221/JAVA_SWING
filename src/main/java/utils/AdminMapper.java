package utils;

import model.Admin;
import model.Nguoi;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminMapper  implements ObjectMapper<Admin>{
    @Override
    public Admin map(ResultSet rs) throws SQLException {
        return new Admin(
                rs.getString("userName"),
                rs.getString("password"),
                rs.getDate("createAt")
        );
    }
}
