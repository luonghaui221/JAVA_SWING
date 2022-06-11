package model;

public class HoGiaDinh {
    private String id;
    private String idChuHo;
    private String soNha;
    private String diaCHi;
    private int soNguoi;
    private String tinhTrang;

    public HoGiaDinh() {
    }

    public HoGiaDinh(String id, String idChuHo, String soNha, String diaCHi, int soNguoi, String tinhTrang) {
        this.id = id;
        this.idChuHo = idChuHo;
        this.soNha = soNha;
        this.diaCHi = diaCHi;
        this.soNguoi = soNguoi;
        this.tinhTrang = tinhTrang;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdChuHo() {
        return idChuHo;
    }

    public void setIdChuHo(String idChuHo) {
        this.idChuHo = idChuHo;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getDiaCHi() {
        return diaCHi;
    }

    public void setDiaCHi(String diaCHi) {
        this.diaCHi = diaCHi;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
