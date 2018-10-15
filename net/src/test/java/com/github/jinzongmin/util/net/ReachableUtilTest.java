package com.github.jinzongmin.util.net;

import org.testng.annotations.Test;

import java.io.IOException;

public class ReachableUtilTest {
    @Test
    public void testHost() throws IOException {
        ReachableUtil.host("127.0.0.1");
        ReachableUtil.host("127.0.0.1", 1000);
        ReachableUtil.host("127.0.0.2");
        ReachableUtil.host("127.0.0.2", 1000);
    }

    @Test
    public void testPort() throws IOException {
        ReachableUtil.port("www.baidu.com", 80);
        ReachableUtil.port("www.baidu.com", 80, 5000);
    }
}