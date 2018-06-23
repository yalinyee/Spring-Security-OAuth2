package com.authcode.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 授权码模式--启动类
 *
 */
@SpringBootApplication
public class AuthcodeServerApplication 
{
    public static void main( String[] args )
    {
       SpringApplication.run(AuthcodeServerApplication.class, args);
    }
}
