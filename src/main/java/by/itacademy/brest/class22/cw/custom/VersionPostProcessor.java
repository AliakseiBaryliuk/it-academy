package by.itacademy.brest.class22.cw.custom;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class VersionPostProcessor {

    private VersionPostProcessor() {
    }

    public static void processAnnotation(Object object) {
        Class<?> clazz = object.getClass();
        try {
            Field field = clazz.getDeclaredField("version");
            if (field.isAnnotationPresent(Version.class)) {
                Version version = field.getAnnotation(Version.class);

                field.setAccessible(true);
                field.set(object, version.info());
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void methodProcessing(Object object) {
        Class<?> clazz = object.getClass();
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Version.class)) {
                Version version = method.getAnnotation(Version.class);
                try {
                    method.setAccessible(true);
                    method.invoke(object, version.info());
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
