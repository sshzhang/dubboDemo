package org.apache.dubbo.demo.provider;
import com.alibaba.dubbo.rpc.RpcContext;
import org.apache.dubbo.demo.DemoService;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        String now = new SimpleDateFormat("HH:mm:ss").format(new Date());
        System.out.println("[" + now + "] Hello " + name + " , request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return name;
    }
    public DemoServiceImpl() {
    }
}
