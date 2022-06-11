import DAO.AbstractDAO;
import DAO.INguoiDAO;
import DAO.implement.NguoiDAO;
import model.Nguoi;
import java.sql.SQLException;
import java.util.*;

public class App {
    public static void main(String[] args) throws SQLException {
        INguoiDAO nguoiDAO = new NguoiDAO();
        List<Nguoi> list = nguoiDAO.getAllNguoi();
        for(Nguoi i : list){
            System.out.println(i.getTen());
        }
    }
}
