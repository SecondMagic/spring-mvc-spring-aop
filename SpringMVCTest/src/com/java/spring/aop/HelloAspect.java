package com.java.spring.aop;
import org.aspectj.lang.ProceedingJoinPoint;  
import org.aspectj.lang.annotation.After;  
import org.aspectj.lang.annotation.AfterReturning;  
import org.aspectj.lang.annotation.AfterThrowing;  
import org.aspectj.lang.annotation.Around;  
import org.aspectj.lang.annotation.Aspect;  
import org.aspectj.lang.annotation.Before;  
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect 
public class HelloAspect {
	@Pointcut("execution(* com.java.spring.service.impl.HelloSpringServiceImpl.*(..))")  
    private void anyMethod(){}//����һ�������  
      
    @Before("anyMethod() && args(name)")  
    public void doAccessCheck(String name){  
        System.out.println(name);  
        System.out.println("ǰ��֪ͨ");  
    }  
      
    @AfterReturning("anyMethod()")  
    public void doAfter(){  
        System.out.println("����֪ͨ");  
    }  
      
    @After("anyMethod()")  
    public void after(){  
        System.out.println("����֪ͨ");  
    }  
      
    @AfterThrowing("anyMethod()")  
    public void doAfterThrow(){  
        System.out.println("����֪ͨ");  
    }  
      
    @Around("anyMethod()")  
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable{  
        System.out.println("���뻷��֪ͨ");  
        Object object = pjp.proceed();//ִ�и÷���  
        System.out.println("�˳�����");  
        return object;  
    }  
}
