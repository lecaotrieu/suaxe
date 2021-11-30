package com.suaxe.core.persistence.data;

import javax.persistence.*;

@Entity
@Table(name = "danhgia")
public class DanhGiaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer danhGiaId;

    @Column(name = "diem")
    private Integer diem;

    @Column(name = "binhluan")
    private String binhLuan;

    @ManyToOne
    @JoinColumn(name = "khachhangid")
    private KhachHangEntity khachHangEntity;

    @ManyToOne
    @JoinColumn(name = "doitacid")
    private DoiTacEntity doiTacEntity;

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

    public KhachHangEntity getKhachHangEntity() {
        return khachHangEntity;
    }

    public void setKhachHangEntity(KhachHangEntity khachHangEntity) {
        this.khachHangEntity = khachHangEntity;
    }

    public DoiTacEntity getDoiTacEntity() {
        return doiTacEntity;
    }

    public void setDoiTacEntity(DoiTacEntity doiTacEntity) {
        this.doiTacEntity = doiTacEntity;
    }
}
