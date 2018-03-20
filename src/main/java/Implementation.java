public class Implementation extends AbstractClass {
    @Override
    public void foo() {
        System.out.println("Implementation#foo");
    }

    @Override
    public void bar() {
        System.out.println("Implementation#bar");
    }

    public static void main(String[] args) {
        Implementation implementation = new Implementation();
        implementation.foo();
        implementation.bar();

        // Описание для compileOnly :interface и implementation :abstractclass (в котором implementation :interface)
        // Нам пофиг на объявление Interface, потому что type erasure
        Interface _interface = new Implementation();
        _interface.bar();
        // Но не пофиг на обращение к методам интерфейса, потому что они рантаймовские
//        _interface.foo();
    }
}
