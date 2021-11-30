package com.suaxe.controller.web;

import com.suaxe.command.TaiKhoanCommand;
import com.suaxe.core.common.utils.SessionUtil;
import com.suaxe.core.dto.DoiTacDTO;
import com.suaxe.core.web.common.WebConstant;
import com.suaxe.core.web.utils.FormUtil;
import com.suaxe.core.web.utils.SingletonServiceUtil;
import com.suaxe.core.web.utils.WebCommonUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

@WebServlet(urlPatterns = {"/dang-nhap", "/dang-xuat", "/dang-ky"})
public class AccountController extends HttpServlet {
    ResourceBundle bundle = ResourceBundle.getBundle("ApplicationResources");

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().invalidate();
        TaiKhoanCommand command = FormUtil.populate(TaiKhoanCommand.class, request);
        if (command != null && command.getUrlType() != null) {
            if (command.getUrlType().equals(WebConstant.LOGIN)) {
                if (command.getCrudaction() != null) {
                    Map<String, String> mapMessage = buildMapMessage();
                    WebCommonUtil.addRedirectMessage(request, mapMessage, command.getCrudaction());
                }
                RequestDispatcher rd = request.getRequestDispatcher("/views/account/login.jsp");
                rd.forward(request, response);
            } else if (command.getUrlType().equals(WebConstant.LOGOUT)) {
                SessionUtil.getInstance().removeSession(request, WebConstant.LOGIN_USER);
                response.sendRedirect("/trang-chu");
            } else if (command.getUrlType().equals(WebConstant.LOGIN_ERROR)) {
                request.setAttribute(WebConstant.MESSAGE_RESPONSE, bundle.getString("label.login.error"));
                RequestDispatcher rd = request.getRequestDispatcher("/views/account/login.jsp");
                rd.forward(request, response);
            } else if (command.getUrlType().equals(WebConstant.REGISTER)) {
                if (command.getCrudaction() != null) {
                    Map<String, String> mapMessage = buildMapMessage();
                    WebCommonUtil.addRedirectMessage(request, mapMessage, command.getCrudaction());
                }
                RequestDispatcher rd = request.getRequestDispatcher("/views/account/register.jsp");
                rd.forward(request, response);
            }
        }
    }

    private Map<String, String> buildMapMessage() {
        Map<String, String> mapMessage = new HashMap<String, String>();
        mapMessage.put(WebConstant.REDIRECT_ERROR, bundle.getString("label.message.error"));
        mapMessage.put(WebConstant.LOGIN_INCOMPETENT, bundle.getString("label.login.error.incompetent"));
        mapMessage.put(WebConstant.NOT_LOGGED, bundle.getString("label.login.not.logged"));
        mapMessage.put(WebConstant.REGISTER_ERROR, bundle.getString("label.register.fail"));
        mapMessage.put(WebConstant.CONFIRM_PASSWORD_FAIL, bundle.getString("label.password.not.confirm"));
        return mapMessage;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TaiKhoanCommand command = FormUtil.populate(TaiKhoanCommand.class, request);
        if (command.getUrlType() != null && command.getUrlType().equals(WebConstant.LOGIN)) {
            command.setPojo(SingletonServiceUtil.getTaiKhoanService().login(command.getPojo()));
            if (command.getPojo() != null) {
                SessionUtil.getInstance().putSession(request, WebConstant.LOGIN_USER, command.getPojo());
                if (command.getPojo().getQuyenDTO().getQuyenId() == 2) {
                    response.sendRedirect("/doi-tac");
                } else if (command.getPojo().getQuyenDTO().getQuyenId() == 3) {
                    response.sendRedirect("/trang-chu");
                }
            } else {
                String uri = request.getRequestURI();
                response.sendRedirect(uri + "?urlType=login_error");
            }
        }
        if (command.getUrlType() != null && command.getUrlType().equals(WebConstant.REGISTER)) {
            if (command.getConfirmPassword().equals(command.getPojo().getPassword())) {
                SingletonServiceUtil.getTaiKhoanService();
            } else {
                String uri = request.getRequestURI();
                response.sendRedirect(uri + "?urlType=register&crudation=confirm_password_fail");
            }
        }
    }
}
