package com.suaxe.core.dto;

import java.sql.Timestamp;
import java.util.List;

public class KhachHangDTO {
    private Integer khachHangId;
    private String tenKhachHang;
    private String diaChi;
    private String sdt;
    private Timestamp ngayThamGia;
    private TaiKhoanDTO taiKhoanDTO;
    private List<DanhGiaDTO> danhGiaDTOS;
    private List<HoTroTrucTuyenDTO> hoTroTrucTuyenDTOS;
    private List<ThanhToanDTO> thanhToanDTOS;
    private List<YeuCauKhachHangDTO> yeuCauKhachHangDTOS;

    public Integer getKhachHangId() {
        return khachHangId;
    }

    public void setKhachHangId(Integer khachHangId) {
        this.khachHangId = khachHangId;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Timestamp getNgayThamGia() {
        return ngayThamGia;
    }

    public void setNgayThamGia(Timestamp ngayThamGia) {
        this.ngayThamGia = ngayThamGia;
    }

    public TaiKhoanDTO getTaiKhoanDTO() {
        return taiKhoanDTO;
    }

    public void setTaiKhoanDTO(TaiKhoanDTO taiKhoanDTO) {
        this.taiKhoanDTO = taiKhoanDTO;
    }

    public List<DanhGiaDTO> getDanhGiaDTOS() {
        return danhGiaDTOS;
    }

    public void setDanhGiaDTOS(List<DanhGiaDTO> danhGiaDTOS) {
        this.danhGiaDTOS = danhGiaDTOS;
    }

    public List<HoTroTrucTuyenDTO> getHoTroTrucTuyenDTOS() {
        return hoTroTrucTuyenDTOS;
    }

    public void setHoTroTrucTuyenDTOS(List<HoTroTrucTuyenDTO> hoTroTrucTuyenDTOS) {
        this.hoTroTrucTuyenDTOS = hoTroTrucTuyenDTOS;
    }

    public List<ThanhToanDTO> getThanhToanDTOS() {
        return thanhToanDTOS;
    }

    public void setThanhToanDTOS(List<ThanhToanDTO> thanhToanDTOS) {
        this.thanhToanDTOS = thanhToanDTOS;
    }

    public List<YeuCauKhachHangDTO> getYeuCauKhachHangDTOS() {
        return yeuCauKhachHangDTOS;
    }

    public void setYeuCauKhachHangDTOS(List<YeuCauKhachHangDTO> yeuCauKhachHangDTOS) {
        this.yeuCauKhachHangDTOS = yeuCauKhachHangDTOS;
    }
}
