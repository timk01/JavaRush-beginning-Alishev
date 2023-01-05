package javasyntax3;

class A { //this keyword (method)
    void m() {
        System.out.println("hello m");
    }

    void n() {
        System.out.println("hello n");
//m();//same as this.m()
        m();
    }
}

class TestThis4 {
    public static void main(String args[]) {
        A a = new A();
        a.n();
    }
}

//for reference
//https://www.javatpoint.com/this-keyword