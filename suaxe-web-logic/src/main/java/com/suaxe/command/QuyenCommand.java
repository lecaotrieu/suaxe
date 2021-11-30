package com.suaxe.command;

import com.suaxe.core.dto.QuyenDTO;
import com.suaxe.core.web.command.AbstractCommand;

public class QuyenCommand extends AbstractCommand<QuyenDTO> {
    public QuyenCommand() {
        this.pojo = new QuyenDTO();
    }
}
