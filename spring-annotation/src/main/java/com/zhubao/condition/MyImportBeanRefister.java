package com.zhubao.condition;

import com.zhubao.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanRefister implements ImportBeanDefinitionRegistrar {
    /**
     *
     * @param importingClassMetadata 当前注解@import类的注解信息
     * @param registry 注册类 ：把所有需要添加到容器中的组件(Bean)调用registry.registerBeanDefinition手工注册进来
     */
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean iscolor = registry.containsBeanDefinition("com.zhubao.bean.Color");
        if(iscolor){
            //指定需要注册的bean:指定需要注册的类型信息 class
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(RainBow.class);
            //调用将bean注册的方法
            registry.registerBeanDefinition("rainBow",rootBeanDefinition);
        }
    }
}
