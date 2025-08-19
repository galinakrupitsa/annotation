import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


    import java.lang.annotation.*;

    @Retention(RetentionPolicy.RUNTIME)   // аннотация будет доступна во время выполнения
    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD}) // где можно использовать
    public @interface MyAnnotation {
        String value();          // обязательный параметр
        int version() default 1; // параметр со значением по умолчанию
    }

