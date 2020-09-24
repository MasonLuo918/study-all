package com.masonluo.tcp;

import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * @author Masonluo
 * @date 2020-09-22 15:23
 */
public class Client {
    private static int PORT = 8500;
    private static String HOST = "aliyun";

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket();
        // 测试#1: 默认设置
//        socket.setSoLinger(false, 0);
        // 测试#2
         socket.setSoLinger(true, 0);
        // 测试#3
        //socket.setSoLinger(true, 1);

        SocketAddress address = new InetSocketAddress(HOST, PORT);
        socket.connect(address);

        OutputStream output = socket.getOutputStream();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("hel");
        }
        byte[] request = sb.toString().getBytes("utf-8");
        output.write(request);
        long start = System.currentTimeMillis();
        socket.close();
        long end = System.currentTimeMillis();
        System.out.println("close time cost: " + (end - start));
    }
}