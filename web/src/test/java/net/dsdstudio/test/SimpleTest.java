package net.dsdstudio.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;

public class SimpleTest extends TestBase {

    @Value("${net.dsdstudio.server-name}")
    String serverName;

    @Test
    public void test() {
        System.out.println(serverName);
    }
}