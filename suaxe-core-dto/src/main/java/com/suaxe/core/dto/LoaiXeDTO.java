package com.suaxe.core.dto;

import java.util.List;

public class LoaiXeDTO {
    private Integer loaiXeId;
    private String tenXe;
    List<DichVuDTO> dichVuDTOS;

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

    public List<DichVuDTO> getDichVuDTOS() {
        return dichVuDTOS;
    }

    public void setDichVuDTOS(List<DichVuDTO> dichVuDTOS) {
        this.dichVuDTOS = dichVuDTOS;
    }
}
