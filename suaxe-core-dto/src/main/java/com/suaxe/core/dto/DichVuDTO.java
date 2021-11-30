package com.suaxe.core.dto;

import java.util.ArrayList;
import java.util.List;

public class DichVuDTO {
    private Integer dichVuId;
    private String tenDichVu;
    private LoaiXeDTO loaiXeDTO;
    private List<DoiTacDTO> doiTacDTOS = new ArrayList<DoiTacDTO>();
    private List<ChiTietDichVuDTO> chiTietDichVuDTOS;
    private List<YeuCauKhachHangDTO> yeuCauKhachHangDTOS;

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

    public LoaiXeDTO getLoaiXeDTO() {
        return loaiXeDTO;
    }

    public void setLoaiXeDTO(LoaiXeDTO loaiXeDTO) {
        this.loaiXeDTO = loaiXeDTO;
    }

    public List<DoiTacDTO> getDoiTacDTOS() {
        return doiTacDTOS;
    }

    public void setDoiTacDTOS(List<DoiTacDTO> doiTacDTOS) {
        this.doiTacDTOS = doiTacDTOS;
    }

    public List<ChiTietDichVuDTO> getChiTietDichVuDTOS() {
        return chiTietDichVuDTOS;
    }

    public void setChiTietDichVuDTOS(List<ChiTietDichVuDTO> chiTietDichVuDTOS) {
        this.chiTietDichVuDTOS = chiTietDichVuDTOS;
    }

    public List<YeuCauKhachHangDTO> getYeuCauKhachHangDTOS() {
        return yeuCauKhachHangDTOS;
    }

    public void setYeuCauKhachHangDTOS(List<YeuCauKhachHangDTO> yeuCauKhachHangDTOS) {
        this.yeuCauKhachHangDTOS = yeuCauKhachHangDTOS;
    }
}
