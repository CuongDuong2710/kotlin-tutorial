package mydemo

/**
 * Created by QUOC CUONG on 26/07/2017.
 */
open abstract class NhanVien {
    protected var ma: Int = 0
    protected var ten: String = ""
    abstract fun tinhLuong(ngayCong: Int) : Double
}