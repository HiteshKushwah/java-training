class A {
    
    static {
        System.out.println("Static Block of Class A");
    }

    
    {
        System.out.println("Instance Block of Class A");
    }

    
    public A() {
        System.out.println("Default Constructor of Class A");
    }

    
    public A(int x) {
        System.out.println("Parameterized Constructor of Class A with value: " + x);
    }

    public A(String msg) {
        System.out.println("Parameterized Constructor of Class A with message: " + msg);
    }
}

class B {
    
    static {
        System.out.println("Static Block of Class B");
    }


    {
        System.out.println("Instance Block of Class B");
    }

    
    public B() {
        System.out.println("Default Constructor of Class B");
    }

    
    public B(int y) {
        System.out.println("Parameterized Constructor of Class B with value: " + y);
    }

    public B(String name) {
        System.out.println("Parameterized Constructor of Class B with name: " + name);
    }
}

class C {
    static {
        System.out.println("Static Block of Class C");
    }


    {
        System.out.println("Instance Block of Class C");
    }

    
    public C() {
        System.out.println("Default Constructor of Class C");
    }

    
    public C(int z) {
        System.out.println("Parameterized Constructor of Class C with value: " + z);
    }

    public C(String desc) {
        System.out.println("Parameterized Constructor of Class C with description: " + desc);
    }
}
