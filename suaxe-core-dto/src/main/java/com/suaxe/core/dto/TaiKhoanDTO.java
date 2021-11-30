package com.suaxe.core.dto;

public class TaiKhoanDTO {
    private Integer taiKhoanId;
    private String userName;
    private String password;
    private String email;
    private QuyenDTO quyenDTO;
    private KhachHangDTO khachHangDTO;
    private DoiTacDTO doiTacDTO;

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

    public QuyenDTO getQuyenDTO() {
        return quyenDTO;
    }

    public void setQuyenDTO(QuyenDTO quyenDTO) {
        this.quyenDTO = quyenDTO;
    }

    public KhachHangDTO getKhachHangDTO() {
        return khachHangDTO;
    }

    public void setKhachHangDTO(KhachHangDTO khachHangDTO) {
        this.khachHangDTO = khachHangDTO;
    }

    public DoiTacDTO getDoiTacDTO() {
        return doiTacDTO;
    }

    public void setDoiTacDTO(DoiTacDTO doiTacDTO) {
        this.doiTacDTO = doiTacDTO;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
