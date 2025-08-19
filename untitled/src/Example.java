@MyAnnotation(value = "ExampleClass", version = 2)
public class Example {

    @MyAnnotation("exampleField")
    private String field;

    @MyAnnotation(value = "doSomethingMethod")
    public void doSomething() {
        System.out.println("Doing something...");
    }
}