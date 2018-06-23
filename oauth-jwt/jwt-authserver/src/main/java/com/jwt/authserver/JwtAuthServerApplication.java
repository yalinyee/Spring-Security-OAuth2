package com.jwt.authserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * JWT授权服务
 * 参考资料：https://jwt.io/
 *
 */
@SpringBootApplication
public class JwtAuthServerApplication 
{
    public static void main( String[] args )
    {
       SpringApplication.run(JwtAuthServerApplication.class,args);
    }
}
