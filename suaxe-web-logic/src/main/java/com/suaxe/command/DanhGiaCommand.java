package com.suaxe.command;

import com.suaxe.core.dto.DanhGiaDTO;
import com.suaxe.core.web.command.AbstractCommand;

public class DanhGiaCommand extends AbstractCommand<DanhGiaDTO> {
    public DanhGiaCommand() {
        this.pojo = new DanhGiaDTO();
    }
}
