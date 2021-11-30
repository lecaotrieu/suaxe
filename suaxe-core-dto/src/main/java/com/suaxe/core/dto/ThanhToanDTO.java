package com.suaxe.core.dto;

import java.sql.Timestamp;
import java.util.List;

public class ThanhToanDTO {
    private Integer thanhToanId;
    private Timestamp ngay;
    private Double tongTien;
    private KhachHangDTO khachHangDTO;
    private List<ChiTietDichVuDTO> chiTietDichVuDTOS;

    public Integer getThanhToanId() {
        return thanhToanId;
    }

    public void setThanhToanId(Integer thanhToanId) {
        this.thanhToanId = thanhToanId;
    }

    public Timestamp getNgay() {
        return ngay;
    }

    public void setNgay(Timestamp ngay) {
        this.ngay = ngay;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    public KhachHangDTO getKhachHangDTO() {
        return khachHangDTO;
    }

    public void setKhachHangDTO(KhachHangDTO khachHangDTO) {
        this.khachHangDTO = khachHangDTO;
    }

    public List<ChiTietDichVuDTO> getChiTietDichVuDTOS() {
        return chiTietDichVuDTOS;
    }

    public void setChiTietDichVuDTOS(List<ChiTietDichVuDTO> chiTietDichVuDTOS) {
        this.chiTietDichVuDTOS = chiTietDichVuDTOS;
    }
}
