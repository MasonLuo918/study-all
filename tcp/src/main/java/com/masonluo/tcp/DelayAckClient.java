package com.masonluo.tcp;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @author Masonluo
 * @date 2020-09-22 22:06
 */
public class DelayAckClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress("172.20.209.53", 8888));
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String head = "hello, ";
        String body = "world\n";

        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();
            outputStream.write(("#" + i + " " + head).getBytes()); // write
            outputStream.write((body).getBytes()); // write
            String line = reader.readLine(); // read
            System.out.println("RTT: " + (System.currentTimeMillis() - start) + ": " + line);
        }
        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
