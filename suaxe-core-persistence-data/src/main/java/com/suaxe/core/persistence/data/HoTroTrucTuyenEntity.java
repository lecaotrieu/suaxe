package com.suaxe.core.persistence.data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "hotrotructuyen")
public class HoTroTrucTuyenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hoTroId;

    @Column(name = "ngay")
    private Timestamp ngay;

    @Column(name = "noidung")
    private String noiDung;

    @Column(name = "phanhoi")
    private String phanHoi;

    @ManyToOne
    @JoinColumn(name = "khachhangid")
    private KhachHangEntity khachHangEntity;

    public String getPhanHoi() {
        return phanHoi;
    }

    public void setPhanHoi(String phanHoi) {
        this.phanHoi = phanHoi;
    }

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

    public KhachHangEntity getKhachHangEntity() {
        return khachHangEntity;
    }

    public void setKhachHangEntity(KhachHangEntity khachHangEntity) {
        this.khachHangEntity = khachHangEntity;
    }
}
