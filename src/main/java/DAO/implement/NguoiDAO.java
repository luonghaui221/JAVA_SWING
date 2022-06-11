package DAO.implement;

import DAO.AbstractDAO;
import DAO.INguoiDAO;
import java.sql.ResultSet;
import model.Nguoi;
import utils.NguoiMapper;
import utils.ObjectMapper;

import java.util.List;
import model.TableNguoi;
import utils.TableNguoiMapper;


public class NguoiDAO extends AbstractDAO<Nguoi> implements INguoiDAO {
    public NguoiDAO() {
    }

    @Override
    public List<Nguoi> getAllNguoi() {
        return select("select * from Nguoi",new NguoiMapper());
    }

    @Override
    public Nguoi getNguoi(String id) {
        List<Nguoi> result = select("select * from Nguoi",new NguoiMapper());
        return result.size() > 0? (Nguoi) result.get(0) : null;
    }

    @Override
    public Nguoi addNguoi(Nguoi nguoi) {
        int result = insert("insert into Nguoi values ()");
        return result == 0 ? null : nguoi;
    }

    @Override
    public Nguoi updateNguoi(Nguoi nguoi) {
        StringBuilder sql = new StringBuilder("update Nguoi set ho = ?, ten = ?, ngaySinh = ?, ");
        sql.append("noiCuTru = ?, noiSinh = ?, gioiTinh = ?, danToc = ?, tonGiao = ?, ");
        sql.append("mqhChuHo = ?, ngheNghiep = ?, soDT = ?, trangThaiHonNhan = ?, id_HoGiaDinh = ? ");
        sql.append("where id = ?");
        int result = update(sql.toString(),nguoi.getHo(),nguoi.getTen(),nguoi.getNgaySinh(),nguoi.getNoiCuTru(),
                nguoi.getNoiSinh(),nguoi.isGioiTinh(),nguoi.getDanToc(),nguoi.getTonGiao(),nguoi.getMqhChuHo(),
                nguoi.getNgheNghiep(),nguoi.getSoDT(),nguoi.isTinhTrangHonNhan(),nguoi.getIdHoGiaDinh());
        return result == 0 ? null : nguoi;
    }

    @Override
    public void deleteNguoi(String id) {
        delete("delete Nguoi where id = ?",id);
    }

    @Override
    public TableNguoi getResults() {
        try{
            List<TableNguoi> list = getResults("select * from Nguoi",new TableNguoiMapper());
            return list.isEmpty() ? null : list.get(0);
        }catch(Exception e){
            return null;
        }
    }
}
