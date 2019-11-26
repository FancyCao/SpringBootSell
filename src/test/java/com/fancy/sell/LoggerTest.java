package com.fancy.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName LoggerTest
 * @Description TODO
 * @Author fancyyyy
 * @Date 2019/11/26 9:26
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void test1() {
        String name = "fancy";
        String password = "123456";
        log.debug("debug...");
        log.info("name: {}, password: {}", name, password);
        log.error("error...");
    }
}
