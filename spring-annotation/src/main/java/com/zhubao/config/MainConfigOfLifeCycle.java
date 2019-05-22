package com.zhubao.config;

import com.zhubao.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 1.由spring容器管理bean生命周期
 * 2.自定义bean初始化和销毁方法 ：相当于xml配置文件中的 init-method="" 和 destory-method=""
 */

@Configuration
@ComponentScan("com.zhubao")
public class MainConfigOfLifeCycle {
//1.自定义bean初始化和销毁方法 ：相当于xml配置文件中的 init-method="" 和 destory-method=""
    @Bean(initMethod = "init",destroyMethod = "destory")
    public Car car(){
        return new Car();
    }


}
