package com.suaxe.core.persistence.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "khachhang")
public class KhachHangEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer khachHangId;

    @Column(name = "tenkh")
    private String tenKhachHang;

    @Column(name = "diachi")
    private String diaChi;

    @Column(name = "sdt")
    private String sdt;

    @Column(name = "ngaythamgia")
    private Timestamp ngayThamGia;

    @OneToOne(mappedBy = "khachHangEntity")
    private TaiKhoanEntity taiKhoanEntity;

    @OneToMany(mappedBy = "khachHangEntity", fetch = FetchType.LAZY)
    private List<DanhGiaEntity> danhGiaEntities;

    @OneToMany(mappedBy = "khachHangEntity", fetch = FetchType.LAZY)
    private List<HoTroTrucTuyenEntity> hoTroTrucTuyenEntities;

    @OneToMany(mappedBy = "khachHangEntity", fetch = FetchType.LAZY)
    private List<ThanhToanEntity> thanhToanEntities;

    @OneToMany(mappedBy = "khachHangEntity", fetch = FetchType.LAZY)
    private List<YeuCauKhachHangEntity> yeuCauKhachHangEntities;

    public List<YeuCauKhachHangEntity> getYeuCauKhachHangEntities() {
        return yeuCauKhachHangEntities;
    }

    public void setYeuCauKhachHangEntities(List<YeuCauKhachHangEntity> yeuCauKhachHangEntities) {
        this.yeuCauKhachHangEntities = yeuCauKhachHangEntities;
    }

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

    public TaiKhoanEntity getTaiKhoanEntity() {
        return taiKhoanEntity;
    }

    public void setTaiKhoanEntity(TaiKhoanEntity taiKhoanEntity) {
        this.taiKhoanEntity = taiKhoanEntity;
    }

    public List<DanhGiaEntity> getDanhGiaEntities() {
        return danhGiaEntities;
    }

    public void setDanhGiaEntities(List<DanhGiaEntity> danhGiaEntities) {
        this.danhGiaEntities = danhGiaEntities;
    }

    public List<HoTroTrucTuyenEntity> getHoTroTrucTuyenEntities() {
        return hoTroTrucTuyenEntities;
    }

    public void setHoTroTrucTuyenEntities(List<HoTroTrucTuyenEntity> hoTroTrucTuyenEntities) {
        this.hoTroTrucTuyenEntities = hoTroTrucTuyenEntities;
    }

    public List<ThanhToanEntity> getThanhToanEntities() {
        return thanhToanEntities;
    }

    public void setThanhToanEntities(List<ThanhToanEntity> thanhToanEntities) {
        this.thanhToanEntities = thanhToanEntities;
    }
}
