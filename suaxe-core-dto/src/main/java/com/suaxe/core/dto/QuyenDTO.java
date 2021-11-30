package com.suaxe.core.dto;

import java.util.List;

public class QuyenDTO {
    private Integer quyenId;
    private String tenQuyen;
    private List<TaiKhoanDTO> taiKhoanDTOS;

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

    public List<TaiKhoanDTO> getTaiKhoanDTOS() {
        return taiKhoanDTOS;
    }

    public void setTaiKhoanDTOS(List<TaiKhoanDTO> taiKhoanDTOS) {
        this.taiKhoanDTOS = taiKhoanDTOS;
    }
}
