package com.suaxe.core.service.utils;

import com.suaxe.core.daoimpl.*;

public class SingletonDaoUtil {
    private static ChiTietDichVuDAOImpl chiTietDichVuDAO = null;
    private static DanhGiaDAOImpl danhGiaDAO = null;
    private static DichVuDAOImpl dichVuDAO = null;
    private static DoiTacDAOImpl doiTacDAO = null;
    private static HoTroTrucTuyenDAOImpl hoTroTrucTuyenDAO = null;
    private static KhachHangDAOImpl khachHangDAO = null;
    private static LoaiXeDAOImpl loaiXeDAO = null;
    private static QuyenDAOImpl quyenDAO = null;
    private static TaiKhoanDAOImpl taiKhoanDAO = null;
    private static ThanhToanDAOImpl thanhToanDAO = null;
    private static YeuCauKhachHangDAOImpl yeuCauKhachHangDAO = null;

    public static ChiTietDichVuDAOImpl getChiTietDichVuDAO() {
        if (chiTietDichVuDAO == null) {
            synchronized (ChiTietDichVuDAOImpl.class) {
                chiTietDichVuDAO = new ChiTietDichVuDAOImpl();
            }
        }
        return chiTietDichVuDAO;
    }

    public static DanhGiaDAOImpl getDanhGiaDAO() {
        if (danhGiaDAO == null) {
            synchronized (DanhGiaDAOImpl.class) {
                danhGiaDAO = new DanhGiaDAOImpl();
            }
        }
        return danhGiaDAO;
    }

    public static DichVuDAOImpl getDichVuDAO() {
        if (dichVuDAO == null) {
            synchronized (DichVuDAOImpl.class) {
                dichVuDAO = new DichVuDAOImpl();
            }
        }
        return dichVuDAO;
    }

    public static DoiTacDAOImpl getDoiTacDAO() {
        if (doiTacDAO == null) {
            synchronized (DoiTacDAOImpl.class) {
                doiTacDAO = new DoiTacDAOImpl();
            }
        }
        return doiTacDAO;
    }

    public static HoTroTrucTuyenDAOImpl getHoTroTrucTuyenDAO() {
        if (hoTroTrucTuyenDAO == null) {
            synchronized (HoTroTrucTuyenDAOImpl.class) {
                hoTroTrucTuyenDAO = new HoTroTrucTuyenDAOImpl();
            }
        }
        return hoTroTrucTuyenDAO;
    }

    public static KhachHangDAOImpl getKhachHangDAO() {
        if (khachHangDAO == null) {
            synchronized (KhachHangDAOImpl.class) {
                khachHangDAO = new KhachHangDAOImpl();
            }
        }
        return khachHangDAO;
    }

    public static LoaiXeDAOImpl getLoaiXeDAO() {
        if (loaiXeDAO == null) {
            synchronized (LoaiXeDAOImpl.class) {
                loaiXeDAO = new LoaiXeDAOImpl();
            }
        }
        return loaiXeDAO;
    }

    public static QuyenDAOImpl getQuyenDAO() {
        if (quyenDAO == null) {
            synchronized (QuyenDAOImpl.class) {
                quyenDAO = new QuyenDAOImpl();
            }
        }
        return quyenDAO;
    }

    public static TaiKhoanDAOImpl getTaiKhoanDAO() {
        if (taiKhoanDAO == null) {
            synchronized (TaiKhoanDAOImpl.class) {
                taiKhoanDAO = new TaiKhoanDAOImpl();
            }
        }
        return taiKhoanDAO;
    }

    public static ThanhToanDAOImpl getThanhToanDAO() {
        if (thanhToanDAO == null) {
            synchronized (ThanhToanDAOImpl.class) {
                thanhToanDAO = new ThanhToanDAOImpl();
            }
        }
        return thanhToanDAO;
    }

    public static YeuCauKhachHangDAOImpl getYeuCauKhachHangDAO() {
        if (yeuCauKhachHangDAO == null) {
            synchronized (YeuCauKhachHangDAOImpl.class) {
                yeuCauKhachHangDAO = new YeuCauKhachHangDAOImpl();
            }
        }
        return yeuCauKhachHangDAO;
    }
}