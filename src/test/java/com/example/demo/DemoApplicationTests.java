package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class DemoApplicationTests {

	@Test
    void contextLoads() {
        // Ensures the application context loads successfully
    }

    @Test
    void testAddition() {
        // Simple addition test
        int a = 5;
        int b = 2;
        int result = a + b;

        assertEquals(7, result, "Addition of 5 and 3 should be 8");
    }


}
