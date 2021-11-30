package com.suaxe.command;

import com.suaxe.core.dto.KhachHangDTO;
import com.suaxe.core.web.command.AbstractCommand;

public class KhachHangCommand extends AbstractCommand<KhachHangDTO> {
    public KhachHangCommand() {
        this.pojo = new KhachHangDTO();
    }
}
