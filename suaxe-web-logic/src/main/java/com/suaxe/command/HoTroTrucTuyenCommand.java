package com.suaxe.command;

import com.suaxe.core.dto.HoTroTrucTuyenDTO;
import com.suaxe.core.web.command.AbstractCommand;

public class HoTroTrucTuyenCommand extends AbstractCommand<HoTroTrucTuyenDTO> {
    public HoTroTrucTuyenCommand() {
        this.pojo = new HoTroTrucTuyenDTO();
    }
}
