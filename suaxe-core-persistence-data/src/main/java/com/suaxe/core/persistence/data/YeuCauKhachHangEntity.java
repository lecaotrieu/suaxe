package com.suaxe.core.persistence.data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "yeucaukhachhang")
public class YeuCauKhachHangEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer yeuCauKHId;

    @Column(name = "noidung")
    private String noiDung;

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinTable(
            name = "yeucau_dichvu",
            joinColumns = {@JoinColumn(name = "yeucaukhid")},
            inverseJoinColumns = {@JoinColumn(name = "dichvuid")}
    )
    private List<DichVuEntity> dichVuEntities = new ArrayList<DichVuEntity>();

    @ManyToOne
    @JoinColumn(name = "khachhangid")
    private KhachHangEntity khachHangEntity;

    public Integer getYeuCauKHId() {
        return yeuCauKHId;
    }

    public void setYeuCauKHId(Integer yeuCauKHId) {
        this.yeuCauKHId = yeuCauKHId;
    }

    public List<DichVuEntity> getDichVuEntities() {
        return dichVuEntities;
    }

    public void setDichVuEntities(List<DichVuEntity> dichVuEntities) {
        this.dichVuEntities = dichVuEntities;
    }

    public KhachHangEntity getKhachHangEntity() {
        return khachHangEntity;
    }

    public void setKhachHangEntity(KhachHangEntity khachHangEntity) {
        this.khachHangEntity = khachHangEntity;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }
}
