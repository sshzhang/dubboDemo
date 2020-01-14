package org.apache.dubbo.demo.provider;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

public  class Provider{ // 服务提供者
    public static void main(String... args)throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/dubbo-provider.xml"});
        context.start();
        System.in.read();
    }
}
