public class Main {
    public static void main(String[] args) {
        TestClass.name = "Pion";
        TestClass testClass = new TestClass(25, "White");
        System.out.println("Name: " + testClass.getName());

        TestClass secondTestClass = new TestClass(30, "Black");
        System.out.println(secondTestClass.name);
        TestClass.printSomething();
        secondTestClass.printSomething();
    }
}
