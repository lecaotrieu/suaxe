package com.suaxe.core.dto;

import java.util.ArrayList;
import java.util.List;

public class YeuCauKhachHangDTO {
    private Integer yeuCauKHId;
    private String noiDung;
    private List<DichVuDTO> dichVuDTOS = new ArrayList<DichVuDTO>();
    private KhachHangDTO khachHangDTO;

    public Integer getYeuCauKHId() {
        return yeuCauKHId;
    }

    public void setYeuCauKHId(Integer yeuCauKHId) {
        this.yeuCauKHId = yeuCauKHId;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public List<DichVuDTO> getDichVuDTOS() {
        return dichVuDTOS;
    }

    public void setDichVuDTOS(List<DichVuDTO> dichVuDTOS) {
        this.dichVuDTOS = dichVuDTOS;
    }

    public KhachHangDTO getKhachHangDTO() {
        return khachHangDTO;
    }

    public void setKhachHangDTO(KhachHangDTO khachHangDTO) {
        this.khachHangDTO = khachHangDTO;
    }
}
