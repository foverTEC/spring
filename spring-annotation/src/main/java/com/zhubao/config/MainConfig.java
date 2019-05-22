package com.zhubao.config;

import com.zhubao.bean.Color;
import com.zhubao.bean.Person;
import com.zhubao.condition.FalseCondition;
import com.zhubao.condition.MyImportBeanRefister;
import com.zhubao.condition.MyImportSelector;
import com.zhubao.condition.WindowCondition;
import org.springframework.context.annotation.*;

/**
 * 配置类 == xml配置文件
 */
@Configuration  //告诉spring这是配置类
@ComponentScan(value = "com.zhubao") //扫描包 找到类上的注解 加入spring容器
@Import({MyImportSelector.class,Person.class, MyImportBeanRefister.class})
//这三个类 1.自定义需要导入多个bean 2.直接导入单个bean 3.设置条件导入bean：类似@Conditional注解：满足条件才注入bean
public class MainConfig {

    @Bean //id默认是使用方法名：person
    @Scope(value = "prototype" )
    @Lazy //懒加载
    @Conditional(FalseCondition.class) //相当于使用注解注入value值 只不过这个值是个java类：通过反射获取对应类上的注解然后获取注解中的value值 做对应的操作
    /*
    1.多例的ioc容器启动时并不会创建实例：而是每次获取的时候才会创键新的对象
    * */

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
