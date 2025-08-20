import java.lang.reflect.*;

public class AnnotationReader {
    public static void main(String[] args) throws Exception {
        Class<Example> clazz = Example.class;

        // Читаем аннотацию у класса
        if (clazz.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation ann = clazz.getAnnotation(MyAnnotation.class);
            System.out.println("Class annotation: value=" + ann.value() + ", version=" + ann.version());
        }

        // Читаем аннотацию у методов
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation ann = method.getAnnotation(MyAnnotation.class);
                System.out.println("Method " + method.getName() + ": value=" + ann.value());
            }

            for (Method method2 : clazz.getDeclaredMethods()) {
                if (method.isAnnotationPresent(Ann2.class)) {
                    Ann2 ann2 = method.getAnnotation(Ann2.class);
                    System.out.println("Method " + method.getName() + ": value=" + ann2.value());
                }
            }

            // Читаем аннотацию у полей
            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(MyAnnotation.class)) {
                    MyAnnotation ann = field.getAnnotation(MyAnnotation.class);
                    System.out.println("Field " + field.getName() + ": value=" + ann.value());
                }
            }


        }

    }
}