package org.javaiw.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcDaoImpl {
	private JdbcTemplate template = null;	
	@Autowired
	public void setDataSource(DataSource dataSource){
		template = new JdbcTemplate(dataSource);
	}

	public void show(){		
		List<Employee> list = template.query("select empno,ename,job,salary,doj from employee", new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
				Employee e1 = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5));
				return e1;
			}
		});
		for (Employee e1:list){
			System.out.println(e1.getEname() + " === " + e1.getJob());
		}
	}
}
