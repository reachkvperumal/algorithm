package com.kv.algorithm.day18;

import java.util.*;

public class URLfiy {

    static String compute(char[] input) {

        char space = 32;
        String result = "";
        for (int i = 0; i < input.length; i++) {
            if (input[i] != space) {
                result = result + input[i];
            } else {
                if (i + 1 < input.length) {
                    result = result + "%20";
                }
            }


        }
        return result;
    }

    static void build(Graph<Character> graph, String[] words) {

        String prev = words[0];

        insertVertices(graph, prev);
        for (int i = 1; i < words.length; i++) {
            insertVertices(graph, words[i]);
            generateGraph(graph, prev, words[i]);
            prev = words[i];
        }
    }

    static void insertVertices(Graph<Character> graph, String word) {
        for (int i = 0; i < word.length(); i++)
            graph.addVertex(word.charAt(i));
    }

    static String find_order(String[] words) {
        if (words == null || words.length == 0)
            return null;

        return null;
        //find(words);
    }

    static void generateGraph(Graph<Character> graph, String prev, String current) {
        int i = 0;
        int j = 0;

        while (i < prev.length() && j < current.length() && prev.charAt(i) == current.charAt(j)) {
            ++i;
            ++j;
        }

        if (i < prev.length() && j < current.length()) {
            graph.addEdge(current.charAt(j), prev.charAt(i));
        }

    }

    static class Graph<V> {

        private Map<V, List<V>> edge = new HashMap<>();

        public void addVertex(V v) {

            if (!edge.containsKey(v))
                edge.put(v, new LinkedList<>());

        }

        public void addEdge(V from, V to) {
            List<V> rel = edge.get(from);
            rel.add(to);
        }

        public List<V> sort() {
            List<V> ordered = new LinkedList<>();

            Set<V> discovered = new HashSet<>();
            Set<V> processed = new HashSet<>();
            Stack<V> dfs = new Stack<>();

            for (V start : edge.keySet()) {
                if (discovered.contains(start)) {
                    continue;
                }
                dfs.push(start);

                while (!dfs.isEmpty()) {
                    V top = dfs.peek();
                    if (!discovered.contains(top)) {
                        discovered.add(top);
                        for (V pred : edge.get(top)) {
                            dfs.push(pred);
                        }
                    } else {
                        dfs.pop();
                        if (!processed.contains(top)) {
                            processed.add(top);
                            ordered.add(top);
                        }
                    }
                }
            }
            return ordered;
        }

    }

    public static void main(String[] args) {
        String input = "Mr John Smith ";

        System.out.println(compute(input.toCharArray()));

        String[] students = new String[10];
        String studentName = "You are an awesome developer";
        students[0] = studentName;
        studentName = null;
        System.out.println(students[0]);
    }
}
