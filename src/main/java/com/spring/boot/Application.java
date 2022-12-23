package com.spring.boot;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;


/**
 * 启动类
 *
 * @author 代码的路
 * @date 2022/11/24
 */

@SpringBootApplication
@EnableApolloConfig
public class Application {

    public static String getTme() {
        Long current_time = System.currentTimeMillis();
        SimpleDateFormat formate = new SimpleDateFormat("yyyyMMddHHmmss");
        String formateTime = formate.format(current_time);
        String clock = formateTime.substring(8, 10) + ":" + formateTime.substring(10, 12) + ":" + formateTime.substring(12, 14);
        return clock;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("i:" + i + " time:" + getTme());
                Thread.sleep(10 * 1000); // 暂停60秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

