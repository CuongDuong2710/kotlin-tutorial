package mydemo

/**
 * Created by QUOC CUONG on 26/07/2017.
 */
class NhanVienThoiVu : NhanVien() {
    override fun tinhLuong(ngayCong: Int): Double {
        return 150000.0 * ngayCong
    }
}