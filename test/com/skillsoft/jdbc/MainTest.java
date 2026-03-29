package com.skillsoft.jdbc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testMysqlDriverClassExists() throws ClassNotFoundException {
        Class<?> driverClass = Class.forName("com.mysql.cj.jdbc.Driver");
        assertNotNull(driverClass);
    }
}
