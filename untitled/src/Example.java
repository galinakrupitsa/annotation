@MyAnnotation(value = "ExampleClass", version = 2)

public class Example {

    @MyAnnotation("exampleField")
    private String field;
    @Ann2("Аннотация 2 для поля")
    private String field2;

    @MyAnnotation(value = "doSomethingMethod")
    public void doSomething() {
        System.out.println("Doing something ...");
    }
    @Ann2(value = "Это аннотация 2 к методу 2")
    public void PrintHelloWorld() {
        System.out.println("Hello World");

    }
}