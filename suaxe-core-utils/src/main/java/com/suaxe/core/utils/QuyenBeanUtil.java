package com.suaxe.core.utils;

import com.suaxe.core.dto.QuyenDTO;
import com.suaxe.core.persistence.data.QuyenEntity;

public class QuyenBeanUtil {
    public static QuyenDTO getDTO(QuyenEntity entity) {
        QuyenDTO dto = new QuyenDTO();
        dto.setQuyenId(entity.getQuyenId());
        dto.setTenQuyen(entity.getTenQuyen());
        return dto;
    }

    public static QuyenEntity getEntity(QuyenDTO dto) {
        QuyenEntity entity = new QuyenEntity();
        entity.setQuyenId(dto.getQuyenId());
        entity.setTenQuyen(dto.getTenQuyen());
        return entity;
    }
}
