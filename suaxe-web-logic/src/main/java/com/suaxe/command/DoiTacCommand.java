package com.suaxe.command;

import com.suaxe.core.dto.DoiTacDTO;
import com.suaxe.core.web.command.AbstractCommand;

public class DoiTacCommand extends AbstractCommand<DoiTacDTO> {
    public DoiTacCommand() {
        this.pojo = new DoiTacDTO();
    }
}
