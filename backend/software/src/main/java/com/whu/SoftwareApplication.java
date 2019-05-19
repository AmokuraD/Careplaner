package com.whu;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

@SpringBootApplication(scanBasePackages = {"com.whu"})
@MapperScan
	(
		//指定扫描包
		basePackages = "com.whu.*",
		//指定SqlSessionFactory，如果sqlSessionTemplate被指定，则作废
		sqlSessionFactoryRef = "sqlSessionFactory",
		//指定sqlSessionTemplate，将忽略sqlSessionFactory的配置
		sqlSessionTemplateRef = "sqlSessionTemplate", 
		//markerInterface = Class.class,//限定扫描接口，不常用
		annotationClass = Repository.class
	)

public class SoftwareApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(SoftwareApplication.class, args);
	}

}
