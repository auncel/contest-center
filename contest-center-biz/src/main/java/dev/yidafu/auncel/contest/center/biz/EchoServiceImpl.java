package dev.yidafu.auncel.contest.center.biz;

import dev.yidafu.auncel.contest.center.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String msg) {
        return "echo: " + msg;
    }
}
