package com.springJdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springJdbc.entities.Courses;

public class RowMapperImpl implements RowMapper<Courses> {

	@Override
	public Courses mapRow(ResultSet rs, int rowNum) throws SQLException {
		Courses course = new Courses();
		course.setId(rs.getInt(1));
		course.setSubject(rs.getString(2));
		course.setCourseYear(rs.getInt(3));
		course.setName(rs.getString(4));
		return course;
	}

}
