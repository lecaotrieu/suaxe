package com.suaxe.command;

import com.suaxe.core.dto.LoaiXeDTO;
import com.suaxe.core.web.command.AbstractCommand;

public class LoaiXeCommand extends AbstractCommand<LoaiXeDTO> {
    public LoaiXeCommand() {
        this.pojo = new LoaiXeDTO();
    }
}
