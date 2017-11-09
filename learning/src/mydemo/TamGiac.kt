package mydemo

import java.util.*

/**
 * Created by QUOC CUONG on 26/07/2017.
 */
class TamGiac {
    private var a: Double = 0.0
    private var b: Double = 0.0
    private var c: Double = 0.0

    constructor()
    constructor(a: Double, b: Double, c: Double) {
        this.a = a
        this.b = b
        this.c = c
    }

    fun chuVi() : Double {
        return a + b + c
    }

    private fun nuaChuVi () : Double {
        return chuVi() / 2
    }

    fun dienTich() : Double {
        var p = nuaChuVi()
        return Math.sqrt(p * (p - a) * (p - b) * (p - c))
    }

}

class Outer {
    val bar : Int = 1
    class Nested {
        fun foo() = 113
    }
    inner class Inter {
        fun foo() = bar
    }
}

fun main(args: Array<String>) {
//    var tg = TamGiac(4.0, 5.0, 6.0)
//    println("Chu vi: " + tg.chuVi())
//    println("Dien tich: " + tg.dienTich())

    var teo = SinhVien(1, "NVTeo")
    println(teo.Ma)
    println(teo.Ten)

    val demo = Outer.Nested().foo()
    println(demo)
    val dem = Outer().Inter().foo()
    println(dem)

    var sv = SinhVien(1 ,"NVA", 9.0)
    println(sv.xepLoaiHocTap())

    var nv1 = NhanVienChinhThuc()
    var nv2 = NhanVienThoiVu()
    println(nv1.tinhLuong(12))
    println(nv2.tinhLuong(10))


}