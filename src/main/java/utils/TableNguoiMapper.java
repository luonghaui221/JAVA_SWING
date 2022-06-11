
package utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Admin;
import model.TableNguoi;


public class TableNguoiMapper implements ObjectMapper<TableNguoi>{

    @Override
    public TableNguoi map(ResultSet rs) throws SQLException {
        return new TableNguoi(rs);
    }
    
}
