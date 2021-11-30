<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %>
<c:url var="registerUrl" value="/dang-ky">
</c:url>
<div class="d-flex justify-content-center align-self-center">
    <div class="d-flex justify-content-center align-self-center">
        <div class="wrap-login100 login-content register-content">
            <div class="login100-pic js-tilt" data-tilt>
                <img src="<c:url value="/template/account/images/hinhxe.png"/>" alt="IMG">
            </div>
            <form action="${registerUrl}" method="get" id="formRegister" class="login100-form validate-register-form">
                <span class="login100-form-title register-title">

                <fmt:message key="label.register" bundle="${lang}"/>
                </span>
                <p id="messageRP"
                   style="color: red;font-family: Helvetica;font-weight: bold;font-size: 12px;text-align: right;padding-right: 18px;">${messageResponse}</p>
                <div class="register-form">
                    <div class="wrap-input100 validate-input"
                         data-validate="<fmt:message key="label.notempty.userName" bundle="${lang}"/>">
                        <input class="input100" type="text" name="pojo.userName"
                               placeholder="<fmt:message key="label.user.name" bundle="${lang}"/>">
                        <span class="focus-input100"></span>
                        <span class="symbol-input100"><i class="fa fa-user" aria-hidden="true"></i></span>
                    </div>
                    <div class="wrap-input100 validate-input"
                         data-validate="<fmt:message key="label.notempty" bundle="${lang}"/>">
                        <input class="input100" type="email" name="pojo.email"
                               placeholder="<fmt:message key="label.user.email" bundle="${lang}"/>">
                        <span class="focus-input100"></span>
                        <span class="symbol-input100"><i class="far fa-envelope" aria-hidden="true"></i></span>
                    </div>
                    <div class="wrap-input100 validate-input"
                         data-validate="<fmt:message key="label.notempty.password" bundle="${lang}"/>">
                        <input class="input100" type="password" name="pojo.password"
                               placeholder="<fmt:message key="label.user.password" bundle="${lang}"/>">
                        <span class="focus-input100"></span>
                        <span class="symbol-input100"><i class="fa fa-lock" aria-hidden="true"></i></span>
                    </div>
                    <div class="wrap-input100 validate-input"
                         data-validate="<fmt:message key="label.notempty" bundle="${lang}"/>">
                        <input class="input100" type="password" name="confirmPassword"
                               placeholder="<fmt:message key="label.user.confirm.password" bundle="${lang}"/>">
                        <span class="focus-input100"></span>
                        <span class="symbol-input100"><i class="fas fa-retweet" aria-hidden="true"></i></span>
                    </div>
                    <div class="custom-control custom-radio">
                        <input type="radio" id="khacHangRadio" name="pojo.quyenDTO.quyenId" value="3"
                               class="custom-control-input">
                        <label class="custom-control-label" for="khacHangRadio">Đăng ký khách hàng</label>
                    </div>
                    <div class="custom-control custom-radio">
                        <input type="radio" id="doiTacRadio" name="pojo.quyenDTO.quyenId" value="2"
                               class="custom-control-input">
                        <label class="custom-control-label" for="doiTacRadio">Đăng ký đối tác</label>
                    </div>
                    <div class="container-login100-form-btn">
                        <button type="button" id="btn-next" class="login100-form-btn">
                            <fmt:message key="label.continue" bundle="${lang}"/>
                        </button>
                    </div>
                </div>
                <%@include file="doitac.jsp" %>
                <%@include file="khachhang.jsp" %>
                <input type="hidden" value="1123" name="taiKhoanDTO.userName">

            </form>
        </div>
    </div>
</div>
<script>
    $(document).ready(function () {
        var url = window.location.pathname;
        url = url + "?urlType=register";
        $('#formRegister').attr('action', url);
        $('#khacHangRadio').attr('checked', true);
    });
</script>
