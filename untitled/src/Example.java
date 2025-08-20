@MyAnnotation(value = "ExampleClass", version = 2)
@Ann2(value = "Аннотация2")
public class Example {

    @MyAnnotation("exampleField")
    private String field;
    @MyAnnotation("Поле 2")
    private int value;

    @MyAnnotation(value = "doSomethingMethod")
    public void doSomething() {
        System.out.println("Doing something ...");
    }
    @Ann2(value = "Это аннотация 2 к методу 2")
    public void PrintHelloWorld() {
        System.out.println("Hello World");

    }
}