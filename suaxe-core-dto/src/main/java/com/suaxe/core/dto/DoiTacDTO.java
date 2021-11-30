package com.suaxe.core.dto;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class DoiTacDTO {
    private Integer doiTacId;
    private String tenDoiTac;
    private String diaChi;
    private String sdt;
    private Timestamp ngayThamGia;
    private TaiKhoanDTO taiKhoanDTO;
    private List<DanhGiaDTO> danhGiaDTOS;
    private List<ChiTietDichVuDTO> chiTietDichVuDTOS;
    private List<DichVuDTO> dichVuEntities = new ArrayList<DichVuDTO>();

    public Integer getDoiTacId() {
        return doiTacId;
    }

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

    public TaiKhoanDTO getTaiKhoanDTO() {
        return taiKhoanDTO;
    }

    public void setTaiKhoanDTO(TaiKhoanDTO taiKhoanDTO) {
        this.taiKhoanDTO = taiKhoanDTO;
    }

    public List<DanhGiaDTO> getDanhGiaDTOS() {
        return danhGiaDTOS;
    }

    public void setDanhGiaDTOS(List<DanhGiaDTO> danhGiaDTOS) {
        this.danhGiaDTOS = danhGiaDTOS;
    }

    public List<ChiTietDichVuDTO> getChiTietDichVuDTOS() {
        return chiTietDichVuDTOS;
    }

    public void setChiTietDichVuDTOS(List<ChiTietDichVuDTO> chiTietDichVuDTOS) {
        this.chiTietDichVuDTOS = chiTietDichVuDTOS;
    }

    public List<DichVuDTO> getDichVuEntities() {
        return dichVuEntities;
    }

    public void setDichVuEntities(List<DichVuDTO> dichVuEntities) {
        this.dichVuEntities = dichVuEntities;
    }
}
