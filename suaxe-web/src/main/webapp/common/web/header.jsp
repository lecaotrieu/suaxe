<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!-- Navigation -->
<c:url var="logoutUrl" value="/dang-xuat">
    <c:param name="urlType" value="logout"/>
</c:url>
<c:url var="loginUrl" value="/dang-nhap">
    <c:param name="urlType" value="login"/>
</c:url>
<c:url var="registerUrl" value="/dang-ky">
    <c:param name="urlType" value="register"/>
</c:url>
<nav class="navbar navbar-expand-lg navbar-warning bg-warning">
    <div class="container">
        <div class="col-2">
            <a href=""> <img id="logo" class="navbar-brand" src="<c:url value="/template/web/image/logo.png"/>" alt=""></a>
        </div>
        <div class="collapse navbar-collapse" id="">
            <ul class="navbar-nav mr-auto danh-muc">
                <li class="nav-item muc">
                    <a class="nav-link" href="<c:url value="/trang-chu"/>">Trang Chủ</a>
                </li>
                <li class="nav-item muc">
                    <a class="nav-link" href="#">Danh Mục</a>
                </li>
                <li class="nav-item muc">
                    <a class="nav-link" href="#">Liên hệ</a>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0 col-4">
                <div class="input-group input-group-sm col-12">
                    <input type="text" name="pojo.bookFullName" class="form-control col-9" placeholder="Tìm kiếm"
                           value="">
                    <div class="input-group-append">
                        <button type="submit" class="btn btn-outline-info"><i class="fas fa-search" id="btn-search"></i>
                        </button>
                    </div>
                </div>

            </form>
            <div class="col-3">
                <c:if test="${not empty login_user}">
                    <div class="dropdown custom-dropdown show float-right">
                        <a class="dropdown-toggle" role="button" id="dropdownMenuLink" data-toggle="dropdown"
                           aria-haspopup="true" aria-expanded="false">${login_user.khachHangDTO.tenKhachHang}
                        </a>

                        <div class="dropdown-menu custom-dropdown-menu dropdown-menu-right"
                             aria-labelledby="dropdownMenuLink">
                            <a class="dropdown-item" href="#">Sửa Xe</a>
                            <a class="dropdown-item" href="#">Quản lý Dịch Vụ</a>
                            <a class="dropdown-item" href="#">Thông Tin Cá Nhân</a>
                            <a class="dropdown-item" href="${logoutUrl}">Đăng xuất</a>
                        </div>
                    </div>
                </c:if>
                <c:if test="${empty login_user}">
                    <a href="${registerUrl}" class="btn btn-outline-primary float-right btn-account"
                       type="submit"><fmt:message key="label.register" bundle="${lang}"/></a>
                    <a href="${loginUrl}" class="btn btn-outline-success btn-account float-right"
                       type="submit"><fmt:message key="label.login" bundle="${lang}"/></a>
                </c:if>
            </div>
        </div>
    </div>
</nav>


