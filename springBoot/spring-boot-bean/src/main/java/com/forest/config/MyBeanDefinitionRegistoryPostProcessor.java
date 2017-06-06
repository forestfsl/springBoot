package com.forest.config;

import com.forest.javabean.JavaBean1;
import com.forest.javabean.JavaBean2;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;
import org.springframework.context.annotation.Configuration;

/**
 * 实现自己实例化bean并注册到Spring管理
 * Created by songlin on 01/06/2017.
 */
@Configuration
public class MyBeanDefinitionRegistoryPostProcessor implements BeanDefinitionRegistryPostProcessor
{
    //bean 的名称生成器
    private BeanNameGenerator beanNameGenerator = new AnnotationBeanNameGenerator();


    /**
     * 先执行：postProcessBeanDefinitionRegistry()方法，
     * 在执行：postProcessBeanFactory()方法。
     *
     */

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        System.out.println("MyBeanDefinitionRegittryPostProcessor.postProcessBeanDefinitionRegistry()");

         /*
        * 在这里可以注入bean.
        */
        registerBean(beanDefinitionRegistry, "JavaBean1", JavaBean1.class);
        registerBean(beanDefinitionRegistry, "JavaBean2", JavaBean2.class);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor.postProcessBeanFactory()");

    }

    /**
     * 提供公共的注册方法。
     * @param beanDefinitionRegistry
     * @param name
     * @param beanClass
     */
    private void registerBean(BeanDefinitionRegistry beanDefinitionRegistry,String name,Class<?> beanClass){
        AnnotatedBeanDefinition annotatedBeanDefinition  = new AnnotatedGenericBeanDefinition(beanClass);
        //可以自动生成name
        String beanName = (name != null?name:this.beanNameGenerator.generateBeanName(annotatedBeanDefinition, beanDefinitionRegistry));
        //bean注册的holer类.
        BeanDefinitionHolder beanDefinitionHolder = new BeanDefinitionHolder(annotatedBeanDefinition, beanName);
        //使用bean注册工具类进行注册.
        BeanDefinitionReaderUtils.registerBeanDefinition(beanDefinitionHolder, beanDefinitionRegistry);
    }

}
