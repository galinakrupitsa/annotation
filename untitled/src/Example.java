@MyAnnotation(value = "ExampleClass", version = 2)
public class Example {

    @MyAnnotation("exampleField")
    private String field;
    @MyAnnotation("exampleField2")
    private int value;

    @MyAnnotation(value = "doSomethingMethod")
    public void doSomething() {
        System.out.println("Doing something ...");
    }
    @MyAnnotation(value = "PrintHelloWorld")
    public void PrintHelloWorld() {
        System.out.println("Hello World");

    }
}