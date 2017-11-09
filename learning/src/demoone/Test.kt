package demoone

import mydemo.SinhVien
import mydemo.TamGiac
import mydemo.Tuoi
import java.util.*

/**
 * Created by QUOC CUONG on 26/07/2017.
 */
fun main(args: Array<String>) {
    var sv = SinhVien()
    sv.Ma = 2
    sv.Ten = "NVA"
    println(sv.Ma)
    println(sv.Ten)

    // tinh tuoi SinhVien
    var ns = Calendar.getInstance()
    ns.set(Calendar.YEAR, 1989)
    ns.set(Calendar.MONTH, 10)
    ns.set(Calendar.DAY_OF_MONTH, 15)
    sv.NamSinh = ns.time
    var tuoiCuaNVA = sv.Tuoi()
    println("Tuoi cua NVA = $tuoiCuaNVA")

    // tinh chu vi va dien tich Tam Giac
    var tg = TamGiac(4.0, 5.0, 6.0)
    println(tg.chuVi())
    println(tg.dienTich())


}
