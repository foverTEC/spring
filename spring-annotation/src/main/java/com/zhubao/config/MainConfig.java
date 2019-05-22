package com.zhubao.config;

import com.zhubao.bean.Color;
import com.zhubao.bean.Person;
import com.zhubao.condition.FalseCondition;
import com.zhubao.condition.WindowCondition;
import org.springframework.context.annotation.*;

/**
 * 配置类 == xml配置文件
 */
@Configuration  //告诉spring这是配置类
@ComponentScan(value = "com.zhubao") //扫描包 找到类上的注解 加入spring容器
@Import(Color.class)
public class MainConfig {

    @Bean //id默认是使用方法名：person
    @Scope(value = "prototype" )
    @Lazy //懒加载
    /*
    1.多例的ioc容器启动时并不会创建实例：而是每次获取的时候才会创键新的对象
    * */
    @Conditional(FalseCondition.class)
    public Person person01(){
        return new Person("lisi",20);
    }

    /**
     * @conditonal 满足条件才创建bean到容器中:
     */

    @Bean
    @Conditional(WindowCondition.class) //返回的true或者false
    public Person person02(){
        return new Person("window实例",100);
    }

}
