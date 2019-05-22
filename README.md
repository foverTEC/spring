# spring 注解使用 解析
 #朱 宝

@给容器中注册组件：
   1.包扫描 + 组件标注注解 (@service @component @Controller) :直接在自己写的组件上加注解
   2.@Bean(导入第三方包里的组件)：注解在方法上：返回值就是需要注入的bean对象
   3.@import 导入组件 :a直接导入 b自定义规则导入组件:实现ImportSelector接口的类  
          c:
   4.
