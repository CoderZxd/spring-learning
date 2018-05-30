package com.zxd.spring.test.learning;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author CoderZZ
 * @Title: ${FILE_NAME}
 * @Project: springlearning
 * @Package com.zxd.spring.test.learning
 * @description:
 * 最常被使用的 ApplicationContext 接口实现：
 * FileSystemXmlApplicationContext：该容器从 XML 文件中加载已被定义的 bean。在这里，你需要提供给构造器 XML 文件的完整路径。
 * ClassPathXmlApplicationContext：该容器从 XML 文件中加载已被定义的 bean。在这里，你不需要提供 XML 文件的完整路径，只需正确配置 CLASSPATH 环境变量即可，因为，容器会从 CLASSPATH 中搜索 bean 配置文件。
 * WebXmlApplicationContext：该容器会在一个 web 应用程序的范围内加载在 XML 文件中已被定义的 bean。
 * @Version 1.0
 * @create 2018-05-30 23:14
 **/
public class MainApp {
    public static void main(String[] args){
        //1.使用ApplicationContext容器
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
        helloWorld.getMessage();
        helloWorld.setMessage("i am singleton");
        System.out.println(helloWorld.hashCode());
        HelloWorld helloWorld3 = (HelloWorld)context.getBean("helloWorld");
        helloWorld3.getMessage();
        System.out.println(helloWorld3.hashCode());
        HelloIndia helloIndia = (HelloIndia)context.getBean("helloIndia");
        helloIndia.getMessage();
//        context.registerShutdownHook();  //AbstractApplicationContext
        //1.1.使用FileSystemXmlApplicationContext容器
//        ApplicationContext context1 = new FileSystemXmlApplicationContext("F:\\git project\\springlearning\\src\\main\\resources\\application-context.xml");
//        HelloWorld helloWorld2 = (HelloWorld)context.getBean("helloWorld");
//        helloWorld2.getMessage();
        //2.使用BeanFactory容器
//        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
//        HelloWorld helloWorld1 = (HelloWorld)factory.getBean("helloWorld");
//        helloWorld1.getMessage();
    }
}
