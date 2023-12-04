package by.itacademy.brest.class22.cw.unknownclass;

import java.lang.reflect.Constructor;

public class DynamicClassCreation {
    public static void main(String[] args) {
        // The name of the class is not known until runtime
        String className = "UnknownClass";

        try {
            // Load the class using its name
            Class<?> unknownClass = Class.forName(className);

            // Get the constructor of the class that takes a String parameter
            Constructor<?> constructor = unknownClass.getConstructor(String.class);

            // Create an instance of the class using the constructor
            Object instance = constructor.newInstance("Hello, Reflection!");

            // Invoke a method on the created instance
            unknownClass.getMethod("displayMessage").invoke(instance);
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + className);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

