package com.suaxe.core.persistence.data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "quyen")
public class QuyenEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer quyenId;

    @Column(name = "tenquyen")
    private String tenQuyen;

    @OneToMany(mappedBy = "quyenEntity", fetch = FetchType.LAZY)
    private List<TaiKhoanEntity> taiKhoanEntities;

    public Integer getQuyenId() {
        return quyenId;
    }

    public void setQuyenId(Integer quyenId) {
        this.quyenId = quyenId;
    }

    public String getTenQuyen() {
        return tenQuyen;
    }

    public void setTenQuyen(String tenQuyen) {
        this.tenQuyen = tenQuyen;
    }

    public List<TaiKhoanEntity> getTaiKhoanEntities() {
        return taiKhoanEntities;
    }

    public void setTaiKhoanEntities(List<TaiKhoanEntity> taiKhoanEntities) {
        this.taiKhoanEntities = taiKhoanEntities;
    }
}
