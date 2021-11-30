package com.suaxe.core.dto;

import java.sql.Timestamp;

public class HoTroTrucTuyenDTO {
    private Integer hoTroId;
    private Timestamp ngay;
    private String noiDung;
    private String phanHoi;
    private KhachHangDTO khachHangDTO;

    public Integer getHoTroId() {
        return hoTroId;
    }

    public void setHoTroId(Integer hoTroId) {
        this.hoTroId = hoTroId;
    }

    public Timestamp getNgay() {
        return ngay;
    }

    public void setNgay(Timestamp ngay) {
        this.ngay = ngay;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getPhanHoi() {
        return phanHoi;
    }

    public void setPhanHoi(String phanHoi) {
        this.phanHoi = phanHoi;
    }

    public KhachHangDTO getKhachHangDTO() {
        return khachHangDTO;
    }

    public void setKhachHangDTO(KhachHangDTO khachHangDTO) {
        this.khachHangDTO = khachHangDTO;
    }
}
