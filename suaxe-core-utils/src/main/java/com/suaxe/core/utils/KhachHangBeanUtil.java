package com.suaxe.core.utils;

import com.suaxe.core.dto.KhachHangDTO;
import com.suaxe.core.persistence.data.KhachHangEntity;

public class KhachHangBeanUtil {
    public static KhachHangDTO getDTO(KhachHangEntity entity) {
        KhachHangDTO dto = new KhachHangDTO();
        dto.setKhachHangId(entity.getKhachHangId());
        dto.setTenKhachHang(entity.getTenKhachHang());
        dto.setDiaChi(entity.getDiaChi());
        dto.setNgayThamGia(entity.getNgayThamGia());
        return dto;
    }

    public static KhachHangEntity getEntity(KhachHangDTO dto) {
        KhachHangEntity entity = new KhachHangEntity();
        entity.setKhachHangId(dto.getKhachHangId());
        entity.setTenKhachHang(dto.getTenKhachHang());
        entity.setDiaChi(dto.getDiaChi());
        entity.setNgayThamGia(dto.getNgayThamGia());
        return entity;
    }
}
