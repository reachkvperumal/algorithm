package com.kv.process;


import com.kv.annotation.Protected;
import com.kv.dto.PimReq;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.Queue;

public class ParseAnnotation {

    public static void init(Class<?> rootClass, Class<? extends Annotation> targetAnnotation) {
        //BFS traversal
        Queue<Class<?>> queue = new LinkedList<>();
        queue.add(rootClass);
        while (!queue.isEmpty()) {
            Class<?> currentClass = queue.poll();
            // Check fields in the current class
            for (Field field : currentClass.getDeclaredFields()) {
                if (field.isAnnotationPresent(targetAnnotation)) {
                    System.out.println(currentClass.getSimpleName() + ": " + field.getName());
                    queue.add(field.getType());
                } else {
                    queue.add(field.getType());
                }
            }
            // Add nested classes to the queue
            for (Class<?> nestedClass : currentClass.getDeclaredClasses()) {
                queue.add(nestedClass);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("start...");
        init(PimReq.class, Protected.class);
        System.out.println("end...");
    }
}


