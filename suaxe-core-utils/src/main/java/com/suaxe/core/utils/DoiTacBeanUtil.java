package com.suaxe.core.utils;

import com.suaxe.core.dto.DoiTacDTO;
import com.suaxe.core.persistence.data.DoiTacEntity;

public class DoiTacBeanUtil {
    public static DoiTacDTO getDTO(DoiTacEntity entity) {
        DoiTacDTO dto = new DoiTacDTO();
        dto.setDoiTacId(entity.getDoiTacId());
        dto.setTenDoiTac(entity.getTenDoiTac());
        dto.setDiaChi(entity.getDiaChi());
        dto.setNgayThamGia(entity.getNgayThamGia());
        return dto;
    }

    public static DoiTacEntity getEntity(DoiTacDTO dto) {
        DoiTacEntity entity = new DoiTacEntity();
        entity.setDoiTacId(dto.getDoiTacId());
        entity.setTenDoiTac(dto.getTenDoiTac());
        entity.setDiaChi(dto.getDiaChi());
        entity.setNgayThamGia(dto.getNgayThamGia());
        return entity;
    }
}
