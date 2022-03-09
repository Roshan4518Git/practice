package com.springJdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springJdbc.entities.Courses;

public class courseImpl implements CourseDao {

	private JdbcTemplate jdbcTemplate;
	
	public int insert(Courses course) {
		String query = "insert into courses(id,subject,courseYear,name) values(?,?,?,?)";
		int result = this.jdbcTemplate.update(query,course.getId(),course.getSubject(),course.getCourseYear(),course.getName());
		return result;
	}

	@Override
	public int change(Courses course) {
		String query = "update courses set subject = ?, courseYear = ?, name = ? where id = ?";
		int result = this.jdbcTemplate.update(query,course.getSubject(),course.getCourseYear(),course.getName(),course.getId());
		return result;
	}
	
	@Override
	public int reset(int courseId) {
		String query = "delete from courses where id = ?";
		int result = this.jdbcTemplate.update(query,courseId);
		return result;
	}
	
	@Override
	public Courses getCourse(int courseId) {
		String query = "select * from courses where id = ?";
		RowMapper<Courses> rowMapper = new RowMapperImpl();
		Courses course = this.jdbcTemplate.queryForObject(query, rowMapper, courseId);
		return course;
	}
	
	@Override
	public List<Courses> printTable() {
		String query = "select * from courses";
		RowMapper<Courses> rowMapper = new RowMapperImpl();
		List<Courses> table = this.jdbcTemplate.query(query, rowMapper);
		return table;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	

	

	

	
}
