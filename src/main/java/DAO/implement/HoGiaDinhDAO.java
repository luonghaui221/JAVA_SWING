package DAO.implement;

import DAO.AbstractDAO;
import DAO.IHoGiaDinhDAO;
import model.HoGiaDinh;
import utils.HoGiaDinhMapper;

import java.util.List;
import model.TableHoGiaDinh;
import utils.NguoiMapper;
import utils.TableHoGiaDinhMapper;


public class HoGiaDinhDAO extends AbstractDAO<HoGiaDinh> implements IHoGiaDinhDAO {
    @Override
    public List<HoGiaDinh> getAllHoGiaDinh() {
        return select("select * from HoGiaDinh",new HoGiaDinhMapper());
    }

    @Override
    public HoGiaDinh getHoGiaDinh(String id) {
        List<HoGiaDinh> result = select("select * from HoGiaDinh where id = ?",new HoGiaDinhMapper(),id);
        return result.size() > 0? (HoGiaDinh) result.get(0) : null;
    }

    @Override
    public HoGiaDinh addHoGiaDinh(HoGiaDinh hoGiaDinh) {
        int result = insert("insert into Nguoi values (?,?,?,?,?,?)",
                hoGiaDinh.getId(),hoGiaDinh.getIdChuHo(),hoGiaDinh.getSoNha(),
                hoGiaDinh.getDiaCHi(),hoGiaDinh.getSoNguoi(),
                hoGiaDinh.getTinhTrang());
        return result == 0 ? null : hoGiaDinh;
    }

    @Override
    public HoGiaDinh updateHoGiaDinh(HoGiaDinh hoGiaDinh) {
        StringBuilder sql = new StringBuilder("update HoGiaDinh set id_ChuHo = ?, soNha = ?, diaChi = ?, ");
        sql.append("soNguoi = ?, tinhTrang = ? where id = ?");
        sql.append("");
        int result = insert(sql.toString(),
                hoGiaDinh.getIdChuHo(),hoGiaDinh.getSoNha(),
                hoGiaDinh.getDiaCHi(),hoGiaDinh.getSoNguoi(),
                hoGiaDinh.getTinhTrang(),hoGiaDinh.getId());
        return result == 0 ? null : hoGiaDinh;
    }

    @Override
    public void deleteHoGiaDinh(String id) {
        delete("delete HoGiaDinh where id = ?",id);
    }

    @Override
    public TableHoGiaDinh getResults() {
        try{
            List<TableHoGiaDinh> list = getResults("select * from HoGiaDinh",new TableHoGiaDinhMapper());
            return list.isEmpty() ? null : list.get(0);
        }catch(Exception e){
            return null;
        }
    }
}
