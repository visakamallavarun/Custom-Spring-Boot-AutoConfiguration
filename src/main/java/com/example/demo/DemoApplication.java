package com.example.demo;

import com.example.demo.Payment.Payment;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.*;

//@EnableAutoConfiguration
//@ComponentScan(basePackages = {"com.exe","com.example"}
////excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {product.class})
//)
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {


//	@Autowired(required = false)
//	private ObjectProvider<product> pp;

	@Autowired
	@Lazy
	private product pp;

	@Autowired
	private Payment p;

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
//		System.out.println(applicationContext.getBean("payment"));
//		System.out.println(applicationContext.getBean("payments"));


	}

	@Bean
	public product getP(){
		return new product();
	}

//	@Lookup
//	public product getProduct(){
//		System.out.println("jshddj");
//		return null;
//	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(pp.getObject().hashCode());
//		System.out.println(pp.getObject().hashCode());
//		System.out.println(getProduct().hashCode());
		System.out.println(pp.hashCode());
		p.process();
	}
}
