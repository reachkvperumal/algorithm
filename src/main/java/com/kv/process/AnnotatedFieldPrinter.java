package com.kv.process;



import com.kv.annotation.Protected;
import com.kv.dto.PimReq;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AnnotatedFieldPrinter {

    public static void main(String[] args) {
        System.out.println("start...");

        Class<?> rootClass = PimReq.class;

        // Start BFS traversal
        Queue<Class<?>> queue = new LinkedList<>();
        queue.add(rootClass);


        while (!queue.isEmpty()) {
            Class<?> currentClass = queue.poll();
            // Check fields in the current class
            for (Field field : currentClass.getDeclaredFields()) {

                if (field.isAnnotationPresent(Protected.class)) {
                    System.out.println("Annotated field with @Protected in class " + currentClass.getSimpleName() +
                            ": " + field.getName());
                }else{
                   // System.out.println("Not Present in class : "+ field.getName() + field.getType());
                    queue.add(field.getType());
                }
            }

            // Add nested classes to the queue
            for (Class<?> nestedClass : currentClass.getDeclaredClasses()) {
                queue.add(nestedClass);
            }
        }
        System.out.println("end...");
    }
}

// Example annotations (replace with your actual annotations)


