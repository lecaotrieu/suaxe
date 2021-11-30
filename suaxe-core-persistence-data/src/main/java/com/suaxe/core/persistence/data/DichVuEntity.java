package com.suaxe.core.persistence.data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "dichvu")
public class DichVuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer dichVuId;

    @Column(name = "tendv")
    private String tenDichVu;

    @ManyToOne
    @JoinColumn(name = "loaixeid")
    private LoaiXeEntity loaiXeEntity;

    @ManyToMany(mappedBy = "dichVuEntities", cascade = CascadeType.ALL)
    private List<DoiTacEntity> doiTacEntities = new ArrayList<DoiTacEntity>();

    @OneToMany(mappedBy = "dichVuEntity", fetch = FetchType.LAZY)
    private List<ChiTietDichVuEntity> chiTietDichVuEntities;

    @ManyToMany(mappedBy = "dichVuEntities", cascade = CascadeType.ALL)
    private List<YeuCauKhachHangEntity> yeuCauKhachHangEntities;

    public List<YeuCauKhachHangEntity> getYeuCauKhachHangEntities() {
        return yeuCauKhachHangEntities;
    }

    public void setYeuCauKhachHangEntities(List<YeuCauKhachHangEntity> yeuCauKhachHangEntities) {
        this.yeuCauKhachHangEntities = yeuCauKhachHangEntities;
    }

    public List<DoiTacEntity> getDoiTacEntities() {
        return doiTacEntities;
    }

    public void setDoiTacEntities(List<DoiTacEntity> doiTacEntities) {
        this.doiTacEntities = doiTacEntities;
    }

    public List<ChiTietDichVuEntity> getChiTietDichVuEntities() {
        return chiTietDichVuEntities;
    }

    public void setChiTietDichVuEntities(List<ChiTietDichVuEntity> chiTietDichVuEntities) {
        this.chiTietDichVuEntities = chiTietDichVuEntities;
    }

    public Integer getDichVuId() {
        return dichVuId;
    }

    public void setDichVuId(Integer dichVuId) {
        this.dichVuId = dichVuId;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public LoaiXeEntity getLoaiXeEntity() {
        return loaiXeEntity;
    }

    public void setLoaiXeEntity(LoaiXeEntity loaiXeEntity) {
        this.loaiXeEntity = loaiXeEntity;
    }
}
