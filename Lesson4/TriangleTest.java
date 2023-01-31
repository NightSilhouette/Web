package org.example.Lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
class TriangleTest {


    @Test
    void test() throws Exception {
        Assertions.assertTimeout(ofMillis(5), () -> {
            Thread.sleep(100);
            return "result";
        });
    }
    @Test
    void test1() {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(24.206145913796355,triangle.TriangleArea(10,10,5));

    }
    @Test
    void test2() {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(30,triangle.TriangleArea(10,10,5));

    }
}


