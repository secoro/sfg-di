package com.example.sfgdi;

import com.example.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		// Primary Bean Controller
		System.out.println("#####################");
		System.out.println("# Primary Bean");
		System.out.println("#####################");
		MyController myController =
				(MyController) context.getBean("myController");
		System.out.println(myController.sayHello() + "\n");

		// Property Injected Controller
		System.out.println("#####################");
		System.out.println("# PROPERTY");
		System.out.println("#####################");
		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting() + "\n");

		// Setter Injected Controller
		System.out.println("#####################");
		System.out.println("# Setter");
		System.out.println("#####################");
		SetterInjectedController setterInjectedController =
				(SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting() + "\n");

		// Constructor Injected Controller
		System.out.println("#####################");
		System.out.println("# Constructor");
		System.out.println("#####################");
		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting() + "\n");

		// Primary Bean Controller
		System.out.println("#####################");
		System.out.println("# International Bean");
		System.out.println("#####################");
		I18nController mySpanishBean =
				(I18nController) context.getBean("i18nController");
		System.out.println(mySpanishBean.sayHello() + "\n");
	}

}
