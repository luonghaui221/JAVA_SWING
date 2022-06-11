package model;

import java.util.Date;

public class Nguoi {
    private String id;
    private String ho;
    private String ten;
    private Date ngaySinh;
    private String noiCuTru;
    private String noiSinh;
    private boolean gioiTinh;
    private String danToc;
    private String tonGiao;
    private String mqhChuHo;
    private String ngheNghiep;
    private String soDT;
    private boolean tinhTrangHonNhan;
    private String idHoGiaDinh;

    public Nguoi() {
    }

    public Nguoi(String id, String ho, String ten, Date ngaySinh,
                 String noiCuTru, String noiSinh, boolean gioiTinh,
                 String danToc, String tonGiao, String mqhChuHo,
                 String ngheNghiep, String soDT, boolean tinhTrangHonNhan, String idHoGiaDinh) {
        this.id = id;
        this.ho = ho;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.noiCuTru = noiCuTru;
        this.noiSinh = noiSinh;
        this.gioiTinh = gioiTinh;
        this.danToc = danToc;
        this.tonGiao = tonGiao;
        this.mqhChuHo = mqhChuHo;
        this.ngheNghiep = ngheNghiep;
        this.soDT = soDT;
        this.tinhTrangHonNhan = tinhTrangHonNhan;
        this.idHoGiaDinh = idHoGiaDinh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNoiCuTru() {
        return noiCuTru;
    }

    public void setNoiCuTru(String noiCuTru) {
        this.noiCuTru = noiCuTru;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDanToc() {
        return danToc;
    }

    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }

    public String getTonGiao() {
        return tonGiao;
    }

    public void setTonGiao(String tonGiao) {
        this.tonGiao = tonGiao;
    }

    public String getMqhChuHo() {
        return mqhChuHo;
    }

    public void setMqhChuHo(String mqhChuHo) {
        this.mqhChuHo = mqhChuHo;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public boolean isTinhTrangHonNhan() {
        return tinhTrangHonNhan;
    }

    public void setTinhTrangHonNhan(boolean tinhTrangHonNhan) {
        this.tinhTrangHonNhan = tinhTrangHonNhan;
    }

    public String getIdHoGiaDinh() {
        return idHoGiaDinh;
    }

    public void setIdHoGiaDinh(String idHoGiaDinh) {
        this.idHoGiaDinh = idHoGiaDinh;
    }
}
