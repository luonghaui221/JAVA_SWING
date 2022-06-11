
package model;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

public class TableNguoi extends AbstractTableModel {
    private  Vector colHeaders;        //-- Chứa thông tin là tên của các Field dùng làm ColumnHeader
    private  Vector tbData;
    private String headers[] = {
            "CCCD", "Họ", "Tên", "Ngày Sinh", "Nơi Cư Trú", "Nơi Sinh", "Giới Tính", "Dân Tộc", "Tôn Giáo",
            "Quan Hệ Với Chủ Hộ", "Nghề Nghiệp", "Số DT", "Tình Trạng Hôn Nhân", "Mã Hộ Gia Đình"};
    public TableNguoi(ResultSet rs){
        try{
            ResultSetMetaData rsMeta = rs.getMetaData();
            int cols = rsMeta.getColumnCount();
            colHeaders = new Vector(cols);
            tbData = new Vector();
            for (int i = 1; i <= cols; i++) {
                colHeaders.addElement(rsMeta.getColumnName(i));
            }
            while(rs.next()){
                Vector dataRow = new Vector(cols);
                for (int i = 1; i <= cols; i++) {
                    if(rs.getObject(i) instanceof Boolean){
                        String value = (String) colHeaders.get(i-1);
                        if(value.equals("gioiTinh")){
                            value = rs.getBoolean("gioiTinh") == false ? "Nữ" : "Nam";
                        }
                        if(value.equals("trangThaiHonNhan")){
                            value = rs.getBoolean("trangThaiHonNhan") == false ? "Chưa kết hôn" : "Đã kết hôn";
                        }
                        dataRow.addElement(value);
                    }else {
                        dataRow.addElement(rs.getObject(i));
                    }
                }
                tbData.addElement(dataRow);
            }
            rs.close();
        }catch(SQLException e){
            System.out.println(e);
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(TableNguoi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public TableNguoi() {

    }
    
    @Override
    public int getRowCount() {
        return tbData.size();
    }

    @Override
    public int getColumnCount() {
        return colHeaders.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vector rowData = (Vector) (tbData.elementAt(rowIndex));
        return rowData.elementAt(columnIndex);
    }
    @Override
    public String getColumnName(int col) {
        return headers[col];
    }
}
