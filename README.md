# Spring_instruction
Spring_instruction
* url教程: https://www.liaoxuefeng.com/wiki/1252599548343744/1282382596407330
* 心法理论: Spring揭秘.pdf

1. IoC:
    * application.xml: 定义各个类
        ```
        <?xml version="1.0" encoding="UTF-8"?>
        <beans xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">
        
            <bean id="Injected" class="springIocAppcontext.Injected">
                <property name="Depended" ref="Depended" />
            </bean>
            <bean id="Depended" class="springIocAppcontext.Depended" />
        </beans>
        ```
    * 容器(掌管各个类的):  
        1. ApplicationContext(默认): 一次性生成所有
            ```
            ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
            Injected userService = context.getBean(Injected.class);
            ```
        2. BeanFactory(少用): 需要用时才生成
            ```
            BeanFactory factory = new XmlBeanFactory(new ClassPathResource("application.xml"));
            Injected userService = factory.getBean(Injected.class);
            ```
