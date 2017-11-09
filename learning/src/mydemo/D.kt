package mydemo

/**
 * Created by QUOC CUONG on 26/07/2017.
 */
class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun bar() {
        super<B>.bar()
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}