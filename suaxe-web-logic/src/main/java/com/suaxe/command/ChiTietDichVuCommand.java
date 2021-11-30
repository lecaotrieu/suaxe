package com.suaxe.command;

import com.suaxe.core.dto.ChiTietDichVuDTO;
import com.suaxe.core.web.command.AbstractCommand;

public class ChiTietDichVuCommand extends AbstractCommand<ChiTietDichVuDTO> {
    public ChiTietDichVuCommand() {
        this.pojo = new ChiTietDichVuDTO();
    }
}
