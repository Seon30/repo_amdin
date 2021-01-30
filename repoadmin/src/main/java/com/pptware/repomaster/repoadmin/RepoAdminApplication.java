package com.pptware.repomaster.repoadmin;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan(value={"com.pptware.repomaster.repoadmin.mapper"})
public class RepoAdminApplication {

	private static final Logger logger = LoggerFactory.getLogger(RepoAdminApplication.class);
	
	public static void main(String[] args) {
		
		SpringApplication.run(RepoAdminApplication.class, args);

		System.out.println("================================================================================================================================================================");
		System.out.println("  8 888888888o.   8 8888888888   8 888888888o       ,o888888o.           .8.          8 888888888o.            ,8.       ,8.           8 8888  b.             8 ");
		System.out.println("  8 8888    `88.  8 8888         8 8888    `88.  . 8888     `88.        .888.         8 8888    `^888.        ,888.     ,888.          8 8888  888o.          8 ");
		System.out.println("  8 8888     `88  8 8888         8 8888     `88 ,8 8888       `8b      :88888.        8 8888        `88.     .`8888.   .`8888.         8 8888  Y88888o.       8 ");
		System.out.println("  8 8888     ,88  8 8888         8 8888     ,88 88 8888        `8b    . `88888.       8 8888         `88    ,8.`8888. ,8.`8888.        8 8888  .`Y888888o.    8 ");
		System.out.println("  8 8888.   ,88'  8 888888888888 8 8888.   ,88' 88 8888         88   .8. `88888.      8 8888          88   ,8'8.`8888,8^8.`8888.       8 8888  8o. `Y888888o. 8 ");
		System.out.println("  8 888888888P'   8 8888         8 888888888P'  88 8888         88  .8`8. `88888.     8 8888          88  ,8' `8.`8888' `8.`8888.      8 8888  8`Y8o. `Y88888o8 ");
		System.out.println("  8 8888`8b       8 8888         8 8888         88 8888        ,8P .8' `8. `88888.    8 8888         ,88 ,8'   `8.`88'   `8.`8888.     8 8888  8   `Y8o. `Y8888 ");
		System.out.println("  8 8888 `8b.     8 8888         8 8888         `8 8888       ,8P .8'   `8. `88888.   8 8888        ,88',8'     `8.`'     `8.`8888.    8 8888  8      `Y8o. `Y8 ");
		System.out.println("  8 8888   `8b.   8 8888         8 8888          ` 8888     ,88' .888888888. `88888.  8 8888    ,o88P' ,8'       `8        `8.`8888.   8 8888  8         `Y8o.` ");
		System.out.println("  8 8888     `88. 8 888888888888 8 8888             `8888888P'  .8'       `8. `88888. 8 888888888P'   ,8'         `         `8.`8888.  8 8888  8            `Yo ");
		System.out.println("================================================================================================================================================================");

	}
	
	@Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
        
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        
        sessionFactory.setDataSource(dataSource);
        return sessionFactory.getObject();
        
    }
	
}
