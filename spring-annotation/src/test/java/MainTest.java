import com.zhubao.bean.Color;
import com.zhubao.bean.Person;
import com.zhubao.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class MainTest {
     public static void main(String[] args) {
         ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        

         String[] beanNamesForType = applicationContext.getBeanNamesForType(Color.class);

         for(String name : beanNamesForType){
             System.out.println(name);

         }




     }


}
