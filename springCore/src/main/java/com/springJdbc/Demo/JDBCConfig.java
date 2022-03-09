package com.springJdbc.Demo;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springJdbc.dao.CourseDao;
import com.springJdbc.dao.courseImpl;

@Configuration
public class JDBCConfig {

	@Bean(name={"ds"})
	public DataSource getDataSourse() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/demo");
		ds.setUsername("root");
		ds.setPassword("SQL4518");
		return ds;
	}
	
	@Bean(name={"jdbcTemplate"})
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSourse());
		return jdbcTemplate;
	}
	
	@Bean(name={"courseDao"})
	public CourseDao getCourseDao() {
		courseImpl courseDao = new courseImpl();
		courseDao.setJdbcTemplate(getJdbcTemplate());
		return courseDao;
	}
}
