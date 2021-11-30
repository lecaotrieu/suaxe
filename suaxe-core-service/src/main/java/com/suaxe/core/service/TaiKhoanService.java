package com.suaxe.core.service;

import com.suaxe.core.dto.TaiKhoanDTO;

public interface TaiKhoanService {
    TaiKhoanDTO login(TaiKhoanDTO taiKhoanDTO);

    TaiKhoanDTO registerAccount(TaiKhoanDTO taiKhoanDTO);
}
