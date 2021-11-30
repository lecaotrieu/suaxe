package com.suaxe.core.web.utils;


import com.suaxe.core.service.impl.*;

public class SingletonServiceUtil {
    private static ChiTietDichVuServiceImpl chiTietDichVuService = null;
    private static DanhGiaServiceImpl danhGiaService = null;
    private static DichVuServiceImpl dichVuService = null;
    private static DoiTacServiceImpl doiTacService = null;
    private static HoTroTrucTuyenServiceImpl hoTroTrucTuyenService = null;
    private static KhachHangServiceImpl khachHangService = null;
    private static LoaiXeServiceImpl loaiXeService = null;
    private static QuyenServiceImpl quyenService = null;
    private static TaiKhoanServiceImpl taiKhoanService = null;
    private static ThanhToanServiceImpl thanhToanService = null;
    private static YeuCauKhachHangServiceImpl yeuCauKhachHangService = null;

    public static ChiTietDichVuServiceImpl getChiTietDichVuService() {
        if (chiTietDichVuService == null) {
            synchronized (ChiTietDichVuServiceImpl.class) {
                chiTietDichVuService = new ChiTietDichVuServiceImpl();
            }
        }
        return chiTietDichVuService;
    }

    public static DanhGiaServiceImpl getDanhGiaService() {
        if (danhGiaService == null) {
            synchronized (DanhGiaServiceImpl.class) {
                danhGiaService = new DanhGiaServiceImpl();
            }
        }
        return danhGiaService;
    }

    public static DichVuServiceImpl getDichVuService() {
        if (dichVuService == null) {
            synchronized (DichVuServiceImpl.class) {
                dichVuService = new DichVuServiceImpl();
            }
        }
        return dichVuService;
    }

    public static DoiTacServiceImpl getDoiTacService() {
        if (doiTacService == null) {
            synchronized (DoiTacServiceImpl.class) {
                doiTacService = new DoiTacServiceImpl();
            }
        }
        return doiTacService;
    }

    public static HoTroTrucTuyenServiceImpl getHoTroTrucTuyenService() {
        if (hoTroTrucTuyenService == null) {
            synchronized (HoTroTrucTuyenServiceImpl.class) {
                hoTroTrucTuyenService = new HoTroTrucTuyenServiceImpl();
            }
        }
        return hoTroTrucTuyenService;
    }

    public static KhachHangServiceImpl getKhachHangService() {
        if (khachHangService == null) {
            synchronized (KhachHangServiceImpl.class) {
                khachHangService = new KhachHangServiceImpl();
            }
        }
        return khachHangService;
    }

    public static LoaiXeServiceImpl getLoaiXeService() {
        if (loaiXeService == null) {
            synchronized (LoaiXeServiceImpl.class) {
                loaiXeService = new LoaiXeServiceImpl();
            }
        }
        return loaiXeService;
    }

    public static QuyenServiceImpl getQuyenService() {
        if (quyenService == null) {
            synchronized (QuyenServiceImpl.class) {
                quyenService = new QuyenServiceImpl();
            }
        }
        return quyenService;
    }

    public static TaiKhoanServiceImpl getTaiKhoanService() {
        if (taiKhoanService == null) {
            synchronized (TaiKhoanServiceImpl.class) {
                taiKhoanService = new TaiKhoanServiceImpl();
            }
        }
        return taiKhoanService;
    }

    public static ThanhToanServiceImpl getThanhToanService() {
        if (thanhToanService == null) {
            synchronized (ThanhToanServiceImpl.class) {
                thanhToanService = new ThanhToanServiceImpl();
            }
        }
        return thanhToanService;
    }

    public static YeuCauKhachHangServiceImpl getYeuCauKhachHangService() {
        if (yeuCauKhachHangService == null) {
            synchronized (YeuCauKhachHangServiceImpl.class) {
                yeuCauKhachHangService = new YeuCauKhachHangServiceImpl();
            }
        }
        return yeuCauKhachHangService;
    }
}
