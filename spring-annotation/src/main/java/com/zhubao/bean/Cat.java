package com.zhubao.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * 通过实现接口 来定义初始化和销毁方法
 */

@Component //开启自动扫描 spring会寻找类上有注解的类 创建实例加入容器
public class Cat implements InitializingBean, DisposableBean {
    public Cat() {
        System.out.println("spring容器使用无参构造创建Cat实例");
    }

    public void destroy() throws Exception {
        System.out.println("cat销毁。。。。");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("cat初始化。。。。");
    }
}
