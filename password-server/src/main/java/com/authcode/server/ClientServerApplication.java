package com.authcode.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 授权码模式--启动类
 *
 */
@SpringBootApplication
public class ClientServerApplication 
{
    public static void main( String[] args )
    {
       SpringApplication.run(ClientServerApplication.class, args);
    }
}
