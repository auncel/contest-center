package dev.yidafu.auncel.problem.warehouse.biz;

import dev.yidafu.auncel.problem.warehouse.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String msg) {
        return "echo: " + msg;
    }
}
