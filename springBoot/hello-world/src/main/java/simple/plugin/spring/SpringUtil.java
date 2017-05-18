package simple.plugin.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**不在Spring Boot的扫描包下方式一
 * Created by songlin on 16/05/2017.
 */
@Component
public class SpringUtil implements ApplicationContextAware {
    private static ApplicationContext applicationContext = null;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        if (SpringUtil.applicationContext == null) {
            SpringUtil.applicationContext = applicationContext;
        }
        System.out.print("----------------------------------------------------------");
        System.out.print("----------------------------------------------------------");
        System.out.print("------------------simmple.plugin.spring.SpringUtil----------");
        System.out.print("===========ApplicationContext配置成功,在普通类可以通过调用SpringUtils.getAppContext()获取applicationContext对象,applicationContext=" + SpringUtil.applicationContext + "=========");
        System.out.print("----------------------------------------------------------");

    }


    /*获取applicationContext*/
    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }

    /*通过name获取Bean*/
    public static Object getBean(String name){
        return getApplicationContext().getBean(name);
    }

    /*通过class获取Bean*/
    public static <T> T getBean(Class<T>clazz){
        return getApplicationContext().getBean(clazz);
    }

    /*通过name,与及Clazz返回指定的Bean*/
    public static <T> T getBean(String name,Class<T>clazz){
        return getApplicationContext().getBean(name,clazz);
    }
}
