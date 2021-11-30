package com.suaxe.command;

import com.suaxe.core.dto.DoiTacDTO;
import com.suaxe.core.dto.KhachHangDTO;
import com.suaxe.core.dto.TaiKhoanDTO;
import com.suaxe.core.web.command.AbstractCommand;

public class TaiKhoanCommand extends AbstractCommand<TaiKhoanDTO> {
    public TaiKhoanCommand() {
        this.pojo = new TaiKhoanDTO();
    }

    private String confirmPassword;
    private String people;

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }
}
