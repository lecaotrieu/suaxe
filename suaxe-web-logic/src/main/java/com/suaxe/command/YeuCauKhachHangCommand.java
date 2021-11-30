package com.suaxe.command;

import com.suaxe.core.dto.YeuCauKhachHangDTO;
import com.suaxe.core.web.command.AbstractCommand;

public class YeuCauKhachHangCommand extends AbstractCommand<YeuCauKhachHangDTO> {
    public YeuCauKhachHangCommand() {
        this.pojo = new YeuCauKhachHangDTO();
    }
}
