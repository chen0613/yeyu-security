/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.renren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Date;
import java.util.TimeZone;



@SpringBootApplication
@EnableScheduling
public class AdminApplication {

	public static void main(String[] args) {
		//时区设置，避免服务以后放到docker容器中有时差问题
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
//		LOGGER.info("system time:[{}]", new Date().toString());
//		LOGGER.info("timezone:[{}]", System.getProperty("user.timezone"));
		SpringApplication.run(AdminApplication.class, args);
		System.out.println("后台管理系统运行成功"+new Date());
	}

}
