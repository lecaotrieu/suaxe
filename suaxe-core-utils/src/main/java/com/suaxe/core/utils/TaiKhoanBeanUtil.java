package com.suaxe.core.utils;

import com.suaxe.core.dto.TaiKhoanDTO;
import com.suaxe.core.persistence.data.TaiKhoanEntity;

public class TaiKhoanBeanUtil {
    public static TaiKhoanDTO getDTO(TaiKhoanEntity entity) {
        TaiKhoanDTO dto = new TaiKhoanDTO();
        dto.setTaiKhoanId(entity.getTaiKhoanId());
        dto.setPassword(entity.getPassword());
        dto.setUserName(entity.getUserName());
        dto.setEmail(entity.getEmail());
        if (entity.getQuyenEntity() != null)
            dto.setQuyenDTO(QuyenBeanUtil.getDTO(entity.getQuyenEntity()));
        if (entity.getDoiTacEntity() != null)
            dto.setDoiTacDTO(DoiTacBeanUtil.getDTO(entity.getDoiTacEntity()));
        if (entity.getKhachHangEntity() != null)
            dto.setKhachHangDTO(KhachHangBeanUtil.getDTO(entity.getKhachHangEntity()));
        return dto;
    }

    public static TaiKhoanEntity getEntity(TaiKhoanDTO dto) {
        TaiKhoanEntity entity = new TaiKhoanEntity();
        entity.setTaiKhoanId(dto.getTaiKhoanId());
        entity.setUserName(dto.getUserName());
        entity.setPassword(dto.getPassword());
        entity.setEmail(dto.getEmail());
        if (dto.getQuyenDTO() != null)
            entity.setQuyenEntity(QuyenBeanUtil.getEntity(dto.getQuyenDTO()));
        if (dto.getDoiTacDTO() != null)
            entity.setDoiTacEntity(DoiTacBeanUtil.getEntity(dto.getDoiTacDTO()));
        if (dto.getKhachHangDTO() != null)
            entity.setKhachHangEntity(KhachHangBeanUtil.getEntity(dto.getKhachHangDTO()));
        return entity;
    }
}
