package com.suaxe.command;

import com.suaxe.core.dto.ThanhToanDTO;
import com.suaxe.core.web.command.AbstractCommand;

public class ThanhToanCommand extends AbstractCommand<ThanhToanDTO> {
    public ThanhToanCommand() {
        this.pojo = new ThanhToanDTO();
    }
}
