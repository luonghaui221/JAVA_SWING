package DAO.implement;

import DAO.AbstractDAO;
import DAO.INguoiDAO;
import model.Nguoi;
import utils.NguoiMapper;
import utils.ObjectMapper;

import java.util.List;


public class NguoiDAO extends AbstractDAO<Nguoi> implements INguoiDAO {
    private ObjectMapper mapper;
    public NguoiDAO() {
        mapper = new NguoiMapper();
    }

    @Override
    public List<Nguoi> getAllNguoi() {
        return select("select * from Nguoi",mapper);
    }

    @Override
    public Nguoi getNguoi(String id) {
        List<Nguoi> result = select("select * from Nguoi",mapper);
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
}
