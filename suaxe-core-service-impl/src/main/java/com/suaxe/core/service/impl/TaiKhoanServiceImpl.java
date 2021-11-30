package com.suaxe.core.service.impl;

import com.suaxe.core.dto.TaiKhoanDTO;
import com.suaxe.core.persistence.data.TaiKhoanEntity;
import com.suaxe.core.service.TaiKhoanService;
import com.suaxe.core.service.utils.SingletonDaoUtil;
import com.suaxe.core.utils.TaiKhoanBeanUtil;

import java.util.HashMap;
import java.util.Map;

public class TaiKhoanServiceImpl implements TaiKhoanService {
    public TaiKhoanDTO login(TaiKhoanDTO taiKhoanDTO) {
        Map<String, Object> mapValue = new HashMap<String, Object>();
        mapValue.put("userName", taiKhoanDTO.getUserName());
        mapValue.put("password", taiKhoanDTO.getPassword());
        TaiKhoanEntity entity = SingletonDaoUtil.getTaiKhoanDAO().findByParameter(mapValue);
        if (entity == null) return null;
        else {
            taiKhoanDTO = TaiKhoanBeanUtil.getDTO(entity);
        }
        return taiKhoanDTO;
    }

    public TaiKhoanDTO registerAccount(TaiKhoanDTO taiKhoanDTO) {
        TaiKhoanEntity entity = TaiKhoanBeanUtil.getEntity(taiKhoanDTO);
        return null;
    }
}
