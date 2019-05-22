import com.zhubao.bean.Color;
import com.zhubao.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
     public static void main(String[] args) {
         ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

         String[] beanNamesForType = applicationContext.getBeanDefinitionNames();
         for(String name : beanNamesForType){
             System.out.println(name);
         }




     }


}
