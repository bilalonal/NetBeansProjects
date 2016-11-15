package objects;

class A {
    private int n;

    A() {
        n = -1;
    }

    A(int a) {
        n = a;
    }

    public void f() {
        n++;
    }

    public void g() {
        f();
        n = 2 * n;
        f();
    }

    public int h() {
        return n;
    }

    public void k() {
        System.out.println(n);
    }

}
