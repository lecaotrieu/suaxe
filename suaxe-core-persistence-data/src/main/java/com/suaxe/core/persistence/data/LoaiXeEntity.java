package com.suaxe.core.persistence.data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loaixe")
public class LoaiXeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer loaiXeId;

    @Column(name = "tenxe")
    private String tenXe;

    @OneToMany(mappedBy = "loaiXeEntity", fetch = FetchType.LAZY)
    List<DichVuEntity> dichVuEntities;

    public Integer getLoaiXeId() {
        return loaiXeId;
    }

    public void setLoaiXeId(Integer loaiXeId) {
        this.loaiXeId = loaiXeId;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public List<DichVuEntity> getDichVuEntities() {
        return dichVuEntities;
    }

    public void setDichVuEntities(List<DichVuEntity> dichVuEntities) {
        this.dichVuEntities = dichVuEntities;
    }
}
