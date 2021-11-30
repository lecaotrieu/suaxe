package com.suaxe.core.persistence.data;

import javax.persistence.*;

@Entity
@Table(name = "chitietdichvu")
public class ChiTietDichVuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer chiTietDVId;

    @Column(name = "soluong")
    private Integer soLuong;

    @Column(name = "dongia")
    private Double donGia;

    @Column(name = "tienphatsinh")
    private Double tienPhatSinh;

    @Column(name = "chitietphatsinh")
    private String chiTietPhatSinh;

    @ManyToOne
    @JoinColumn(name = "thanhtoanid")
    private ThanhToanEntity thanhToanEntity;

    @ManyToOne
    @JoinColumn(name = "dichvuid")
    private DichVuEntity dichVuEntity;

    @ManyToOne
    @JoinColumn(name = "doitacid")
    private DoiTacEntity doiTacEntity;

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

    public ThanhToanEntity getThanhToanEntity() {
        return thanhToanEntity;
    }

    public void setThanhToanEntity(ThanhToanEntity thanhToanEntity) {
        this.thanhToanEntity = thanhToanEntity;
    }

    public DichVuEntity getDichVuEntity() {
        return dichVuEntity;
    }

    public void setDichVuEntity(DichVuEntity dichVuEntity) {
        this.dichVuEntity = dichVuEntity;
    }

    public DoiTacEntity getDoiTacEntity() {
        return doiTacEntity;
    }

    public void setDoiTacEntity(DoiTacEntity doiTacEntity) {
        this.doiTacEntity = doiTacEntity;
    }
}
