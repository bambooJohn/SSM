package com.bambooJohn.ioc.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class AfterHandler implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		Person person = (Person)bean;
		if(person.getSex().equals("男")) {
			person.setName("张无忌");
		}else {
			person.setName("赵敏");
		}
		return person;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		return bean;
	}

}
