public abstract class AbstractClass implements Interface {
    public abstract void foo();

    @Override
    public void bar() {
        System.out.println("AbstractClass#bar");
    }
}
