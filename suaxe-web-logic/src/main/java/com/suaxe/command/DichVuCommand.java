package com.suaxe.command;

import com.suaxe.core.dto.DichVuDTO;
import com.suaxe.core.web.command.AbstractCommand;

public class DichVuCommand extends AbstractCommand<DichVuDTO> {
    public DichVuCommand() {
        this.pojo = new DichVuDTO();
    }
}
