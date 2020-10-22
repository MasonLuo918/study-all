package com.masonluo.learn.spring._Ioc进阶_模块装配;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Masonluo
 * @date 2020-10-16 09:50
 */
@Configuration
public class BartenderConfiguration {

    @Bean
    public Bartender zhangxiaosan() {
        return new Bartender("张小三");
    }

    @Bean
    public Bartender zhangdasan() {
        return new Bartender("张大三");
    }
}
