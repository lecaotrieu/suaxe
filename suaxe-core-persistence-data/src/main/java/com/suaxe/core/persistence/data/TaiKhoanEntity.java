package com.suaxe.core.persistence.data;

import javax.persistence.*;

@Entity
@Table(name = "taikhoan")
public class TaiKhoanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer taiKhoanId;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "quyenid")
    private QuyenEntity quyenEntity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "khachhangid", referencedColumnName = "khachhangid")
    private KhachHangEntity khachHangEntity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "doitacid", referencedColumnName = "doitacid")
    private DoiTacEntity doiTacEntity;

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

    public Integer getTaiKhoanId() {
        return taiKhoanId;
    }

    public void setTaiKhoanId(Integer taiKhoanId) {
        this.taiKhoanId = taiKhoanId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public QuyenEntity getQuyenEntity() {
        return quyenEntity;
    }

    public void setQuyenEntity(QuyenEntity quyenEntity) {
        this.quyenEntity = quyenEntity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
