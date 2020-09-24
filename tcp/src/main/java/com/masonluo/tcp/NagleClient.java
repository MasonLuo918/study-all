package com.masonluo.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.concurrent.TimeUnit;

/**
 * @author Masonluo
 * @date 2020-09-22 20:20
 */
public class NagleClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket();
        SocketAddress address = new InetSocketAddress("aliyun", 8080);
        socket.connect(address);
        socket.setTcpNoDelay(true);
        OutputStream outputStream = socket.getOutputStream();
        byte[] request = new byte[10];
        for (int i = 0; i < 5; i++) {
            outputStream.write(request);
        }
        TimeUnit.SECONDS.sleep(1);
        socket.close();
    }
}
