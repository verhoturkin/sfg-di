package com.example.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Alexander Verkhoturkin
 * @created 29/06/2020 - 9:52
 */

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
                                          BeanFactoryAware, ApplicationContextAware {

    public void beforeInit() {
        System.out.println("## Before init called by BPP");
    }

    public void afterInit() {
        System.out.println("## After Init called by BPP");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean factory has been set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## My bean name is: " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The lifecycle bean has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The lifecycle bean has its properties");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## App context has been set");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## PostConstuct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## PreDestroy annotated method has been called");
    }
}
