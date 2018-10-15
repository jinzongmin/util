package com.github.jinzongmin.util.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class ReachableUtil {
    public static final int TIMEOUT = 3000;

    public static boolean host(String host) throws IOException {
        return host(host, TIMEOUT);
    }

    public static boolean host(String host, int timeout) throws IOException {
        boolean status = InetAddress.getByName(host).isReachable(timeout);
        return status;
    }

    public static boolean port(String host, int port) throws IOException {
        return port(host, port, TIMEOUT);
    }

    public static boolean port(String host, int port, int timeout) throws IOException {
        Socket socket = new Socket();
        socket.setReuseAddress(true);
        SocketAddress socketAddress = new InetSocketAddress(host, port);
        socket.connect(socketAddress, timeout);
        return socket.isConnected();
    }
}
