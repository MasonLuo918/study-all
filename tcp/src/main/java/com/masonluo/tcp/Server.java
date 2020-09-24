package com.masonluo.tcp;

/**
 * @author Masonluo
 * @date 2020-09-22 15:22
 */

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.setReuseAddress(true);
        serverSocket.bind(new InetSocketAddress("172.20.217.65", 9999));

        while (true) {
            Socket socket = serverSocket.accept();
            InputStream input = socket.getInputStream();
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            byte[] buffer = new byte[1];
            int length;
            while ((length = input.read(buffer)) != -1) {
                output.write(buffer, 0, length);
            }
            String req = new String(output.toByteArray(), "utf-8");
            System.out.println(req.length());
            socket.close();
        }
    }
}