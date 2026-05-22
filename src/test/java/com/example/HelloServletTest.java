package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloServletTest {

    @Test
    public void testServletClassExists() {
        // Just verify that we can create an instance of HelloServlet
        HelloServlet servlet = new HelloServlet();
        assertNotNull(servlet);
    }
}

