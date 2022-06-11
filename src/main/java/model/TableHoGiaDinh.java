/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;


public class TableHoGiaDinh extends AbstractTableModel{

    private  Vector colHeaders;        //-- Chứa thông tin là tên của các Field dùng làm ColumnHeader
    private  Vector tbData;
    private String headers[] = {
            "Mã Hộ Gia Đình", "Chủ Hộ", "Số Nhà", "Địa Chỉ", "Số Người", "Tình Trạng"};
    public TableHoGiaDinh(ResultSet rs){
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
                    dataRow.addElement(rs.getObject(i));
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
    public TableHoGiaDinh(){
        
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
