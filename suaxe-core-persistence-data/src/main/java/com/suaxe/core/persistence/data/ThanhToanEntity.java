package com.suaxe.core.persistence.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "thanhtoan")
public class ThanhToanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer thanhToanId;

    @Column(name = "ngay")
    private Timestamp ngay;

    @Column(name = "tongtien")
    private Double tongTien;

    @ManyToOne
    @JoinColumn(name = "khachhangid")
    private KhachHangEntity khachHangEntity;

    @OneToMany(mappedBy = "thanhToanEntity", fetch = FetchType.LAZY)
    private List<ChiTietDichVuEntity> chiTietDichVuEntities;

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

    public KhachHangEntity getKhachHangEntity() {
        return khachHangEntity;
    }

    public void setKhachHangEntity(KhachHangEntity khachHangEntity) {
        this.khachHangEntity = khachHangEntity;
    }

    public List<ChiTietDichVuEntity> getChiTietDichVuEntities() {
        return chiTietDichVuEntities;
    }

    public void setChiTietDichVuEntities(List<ChiTietDichVuEntity> chiTietDichVuEntities) {
        this.chiTietDichVuEntities = chiTietDichVuEntities;
    }
}
