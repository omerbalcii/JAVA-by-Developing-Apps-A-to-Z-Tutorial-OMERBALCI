package com.bilgeadam.springbootBTS.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

import org.springframework.stereotype.Component;

@Component
//@Lazy
public class BeanFactory
{
	@Bean
	public ResourceBundleMessageSource bundleMessageSource()
	{
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		messageSource.setDefaultLocale(null);
		return messageSource;
	}

	
	

//	@Bean
//	public Person person()
//	{
//		return new Person("yusuf");
//	}
}

class Person
{
	private String name;

	public Person(String name)
	{
		super();
		this.name = name;
	}
}