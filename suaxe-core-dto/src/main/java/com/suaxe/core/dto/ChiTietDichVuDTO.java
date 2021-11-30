package com.suaxe.core.dto;

public class ChiTietDichVuDTO {
    private Integer chiTietDVId;
    private Integer soLuong;
    private Double donGia;
    private Double tienPhatSinh;
    private String chiTietPhatSinh;
    private ThanhToanDTO thanhToanDTO;
    private DichVuDTO dichVuDTO;
    private DoiTacDTO doiTacDTO;

    public Integer getChiTietDVId() {
        return chiTietDVId;
    }

    public void setChiTietDVId(Integer chiTietDVId) {
        this.chiTietDVId = chiTietDVId;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public Double getTienPhatSinh() {
        return tienPhatSinh;
    }

    public void setTienPhatSinh(Double tienPhatSinh) {
        this.tienPhatSinh = tienPhatSinh;
    }

    public String getChiTietPhatSinh() {
        return chiTietPhatSinh;
    }

    public void setChiTietPhatSinh(String chiTietPhatSinh) {
        this.chiTietPhatSinh = chiTietPhatSinh;
    }

    public ThanhToanDTO getThanhToanDTO() {
        return thanhToanDTO;
    }

    public void setThanhToanDTO(ThanhToanDTO thanhToanDTO) {
        this.thanhToanDTO = thanhToanDTO;
    }

    public DichVuDTO getDichVuDTO() {
        return dichVuDTO;
    }

    public void setDichVuDTO(DichVuDTO dichVuDTO) {
        this.dichVuDTO = dichVuDTO;
    }

    public DoiTacDTO getDoiTacDTO() {
        return doiTacDTO;
    }

    public void setDoiTacDTO(DoiTacDTO doiTacDTO) {
        this.doiTacDTO = doiTacDTO;
    }
}
