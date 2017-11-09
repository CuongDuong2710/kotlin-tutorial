package mydemo

import java.util.*

/**
 * Created by QUOC CUONG on 26/07/2017.
 */
class SinhVien {
    private var ma: Int = 0
    private var ten: String = ""
    private var diemTrungBinh: Double = 0.0
    private var namSinh: Date? = null

    var Ma: Int
        get() {
            return ma
        }
        set(value) {
            ma = value
        }

    var Ten: String
        get() {
            return ten
        }
        set(value) {
            ten = value
        }

    var NamSinh: Date?
        get() {
            return namSinh
        }
        set(value) {
            namSinh = value
        }

    constructor(){
        println("Secondary constructor 0 doi so")
    }

    constructor(ma: Int, ten: String) {
        println("Secondary constructor 2 doi so")
        println("Ma = $ma, Ten = $ten")
    }

    constructor(ma: Int, ten: String, namSinh: Date?) {
        this.ma = ma
        this.ten = ten
        this.namSinh = namSinh
    }

    constructor(ma: Int, ten: String, diemtrungbinh: Double) {
        this.ma = ma
        this.ten = ten
        this.diemTrungBinh = diemtrungbinh
    }

    fun xepLoaiHocTap() : XepLoai {
        if (diemTrungBinh >= 9) return XepLoai.Xuatsac
        if (diemTrungBinh >= 8) return XepLoai.Gioi
        if (diemTrungBinh >= 7) return XepLoai.Kha
        if (diemTrungBinh >= 5) return XepLoai.TrungBinh
        if (diemTrungBinh >= 3) return XepLoai.Yeu
        return XepLoai.Kem
    }
}

// Extension Method
fun SinhVien.Tuoi() : Int {
    var cal = Calendar.getInstance()
    var yearHienTai = cal.get(Calendar.YEAR)
    cal.time = this.NamSinh
    var yearNamSinh = cal.get(Calendar.YEAR)
    return yearHienTai - yearNamSinh
}

fun main(args: Array<String>) {
    var teo = SinhVien(1, "NVTeo")
    println(teo.Ma)
    println(teo.Ten)

    // tinh tuoi SinhVien
    var ns = Calendar.getInstance()
    ns.set(Calendar.YEAR, 1989)
    ns.set(Calendar.MONTH, 10)
    ns.set(Calendar.DAY_OF_MONTH, 15)
    teo.NamSinh = ns.time
    var tuoiCuaTeo = teo.Tuoi()
    println("Tuoi cua Teo = $tuoiCuaTeo")

}