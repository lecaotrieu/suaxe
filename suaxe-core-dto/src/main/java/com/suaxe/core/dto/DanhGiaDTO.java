package com.suaxe.core.dto;

public class DanhGiaDTO {
    private Integer danhGiaId;
    private Integer diem;
    private String binhLuan;
    private KhachHangDTO khachHangDTO;
    private DoiTacDTO doiTacDTO;

    public Integer getDanhGiaId() {
        return danhGiaId;
    }

    public void setDanhGiaId(Integer danhGiaId) {
        this.danhGiaId = danhGiaId;
    }

    public Integer getDiem() {
        return diem;
    }

    public void setDiem(Integer diem) {
        this.diem = diem;
    }

    public String getBinhLuan() {
        return binhLuan;
    }

    public void setBinhLuan(String binhLuan) {
        this.binhLuan = binhLuan;
    }

    public KhachHangDTO getKhachHangDTO() {
        return khachHangDTO;
    }

    public void setKhachHangDTO(KhachHangDTO khachHangDTO) {
        this.khachHangDTO = khachHangDTO;
    }

    public DoiTacDTO getDoiTacDTO() {
        return doiTacDTO;
    }

    public void setDoiTacDTO(DoiTacDTO doiTacDTO) {
        this.doiTacDTO = doiTacDTO;
    }
}
