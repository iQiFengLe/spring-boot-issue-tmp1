package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.concurrent.CountDownLatch;

/**
 * 类说明
 *
 * @author 起风了
 * @mail m.zxt@foxmail.com
 * @date 2024/3/6 10:54
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class App {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(App.class, args);
        new CountDownLatch(1).await();
    }

}
