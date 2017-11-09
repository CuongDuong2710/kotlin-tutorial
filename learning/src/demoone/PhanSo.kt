package demoone

/**
 * Created by QUOC CUONG on 27/07/2017.
 */
class PhanSo : Cloneable {
    var tu: Int = 1
    var mau: Int = 1

    constructor(tu: Int, mau: Int) {
        this.tu = tu
        this.mau = mau
    }

    fun copy(): PhanSo {
        var ps: PhanSo = clone() as PhanSo
        return ps
    }

}

// Extension method
fun Int.Cong(a: Int) : Int {
    return this + a
}

fun main(args: Array<String>) {
    var psA = PhanSo(1, 5)
    var psB = PhanSo(3, 7)
    // ban dau
    println("Tu so cua A: " + psA.tu)
    // sau khi psA trỏ về vùng nhớ psB
    psA = psB
    println("Tu so cua A: " + psA.tu)
    // thay đổi phần tử của psA, psB thay đổi theo
    psA.tu = 113
    println("Tu so cua B: " + psB.tu)
    // clone psA ra psC
    var psC = psA.copy()
    psC.tu = 114
    println("Tu so cua A: " + psA.tu)
    println("Tu so cua C: " + psC.tu)
    println("Mau so cua C: " + psC.mau)



    var t = 5.Cong(9)
    println("t = $t")
    var x1 = 10
    var x2 = 9
    var x3 = x1.Cong(x2)
    println("x3 = $x3")

    // Kiem tra so nguyen to
    fun Int.KiemTraSoNguyenTo() : Boolean {
        var dem = 0
        for (i in 1..this) {
            if (this % i == 0)
                dem++
        }
        return dem == 2
    }

    var a = 7
    if (a.KiemTraSoNguyenTo())
        println("$a la so nguyen to")
    else
        println("$a khong phai so nguyen to")

    var b = 9
    if (b.KiemTraSoNguyenTo())
        println("$b la so nguyen to")
    else
        println("$b khong phai so nguyen to")
}
