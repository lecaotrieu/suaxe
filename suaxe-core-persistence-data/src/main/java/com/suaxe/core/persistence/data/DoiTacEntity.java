package com.suaxe.core.persistence.data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "doitac")
public class DoiTacEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer doiTacId;

    @Column(name = "tendt")
    private String tenDoiTac;

    @Column(name = "diachi")
    private String diaChi;

    @Column(name = "sdt")
    private String sdt;

    @Column(name = "ngaythamgia")
    private Timestamp ngayThamGia;

    @OneToOne(mappedBy = "doiTacEntity")
    private TaiKhoanEntity taiKhoanEntity;

    @OneToMany(mappedBy = "doiTacEntity", fetch = FetchType.LAZY)
    private List<DanhGiaEntity> danhGiaEntities;

    @OneToMany(mappedBy = "doiTacEntity", fetch = FetchType.LAZY)
    private List<ChiTietDichVuEntity> chiTietDichVuEntities;

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinTable(
            name = "doitac_dichvu",
            joinColumns = {@JoinColumn(name = "doitacid")},
            inverseJoinColumns = {@JoinColumn(name = "dichvuid")}
    )
    private List<DichVuEntity> dichVuEntities = new ArrayList<DichVuEntity>();

    public void setDoiTacId(Integer doiTacId) {
        this.doiTacId = doiTacId;
    }

    public String getTenDoiTac() {
        return tenDoiTac;
    }

    public void setTenDoiTac(String tenDoiTac) {
        this.tenDoiTac = tenDoiTac;
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

    public List<ChiTietDichVuEntity> getChiTietDichVuEntities() {
        return chiTietDichVuEntities;
    }

    public void setChiTietDichVuEntities(List<ChiTietDichVuEntity> chiTietDichVuEntities) {
        this.chiTietDichVuEntities = chiTietDichVuEntities;
    }

    public Integer getDoiTacId() {
        return doiTacId;
    }

    public List<DichVuEntity> getDichVuEntities() {
        return dichVuEntities;
    }

    public void setDichVuEntities(List<DichVuEntity> dichVuEntities) {
        this.dichVuEntities = dichVuEntities;
    }
}
