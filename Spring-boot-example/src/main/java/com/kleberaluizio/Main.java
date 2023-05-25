package com.kleberaluizio;

//334 lesson
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
        SpringApplication.run(Main.class, args);

        printBeans(applicationContext);
    }

    @Bean("foo")
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Foo getFoo(){
        return new Foo("bar");
    }
    record Foo(String name){}

    private static void printBeans(ConfigurableApplicationContext ctx){
        String [] beanDefinitionsNames = ctx.getBeanDefinitionNames();

        for (String beanDefinitionsName : beanDefinitionsNames) {
            System.out.println(beanDefinitionsName);
        }
    }

}
