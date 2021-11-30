<div class="form-khachhang" style="display: none">
    <div class="wrap-input100 validate-input"
         data-validate="<fmt:message key="label.notempty" bundle="${lang}"/>">
        <input class="input100" type="text" name="pojo.khachHangDTO.tenKhachHang"
               placeholder="<fmt:message key="label.user.fullName" bundle="${lang}"/>">
        <span class="focus-input100"></span>
        <span class="symbol-input100">
                        <i class="fa fa-user" aria-hidden="true"></i>
                        </span>
    </div>
    <div class="wrap-input100 validate-input"
         data-validate="<fmt:message key="label.notempty" bundle="${lang}"/>">
        <input class="input100" type="text" name="pojo.khachHangDTO.diaChi"
               placeholder="<fmt:message key="label.user.address" bundle="${lang}"/>">
        <span class="focus-input100"></span>
        <span class="symbol-input100">
                            <i class="fa fa-lock" aria-hidden="true"></i>
                        </span>
    </div>
    <div class="wrap-input100 validate-input"
         data-validate="<fmt:message key="label.notempty" bundle="${lang}"/>">
        <input class="input100" type="password" name="pojo.khachHangDTO.sdt"
               placeholder="<fmt:message key="label.user.number" bundle="${lang}"/>">
        <span class="focus-input100"></span>
        <span class="symbol-input100">
                        <i class="fas fa-retweet" aria-hidden="true"></i>
                        </span>
    </div>
    <div class="container-login100-form-btn register-khachhang-btn">
        <button class="login100-form-btn" id="btn-khachhang">
            <fmt:message key="label.register.khachhang" bundle="${lang}"/>
        </button>
    </div>
</div>