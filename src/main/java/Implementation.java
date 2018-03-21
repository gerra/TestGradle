public class Implementation extends AbstractClass {
    @Override
    public void foo() {
        System.out.println("Implementation#foo");
    }

    public static void main(String[] args) {
        Implementation implementation = new Implementation();
        implementation.foo();
        implementation.bar();
//
//        // Описание для compileOnly :interface и implementation :abstractclass (в котором implementation :interface)
//        Interface _interface = new Implementation();
//        _interface.bar();
    }
}
