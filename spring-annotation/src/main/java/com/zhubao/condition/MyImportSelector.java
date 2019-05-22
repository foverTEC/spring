package com.zhubao.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    //返回值 就是导入到容器中的组件全类名
    //方法参数：annotationMetadata ：当前标注@import注解的类的所有注解信息
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.zhubao.bean.Color"};
    }
}
