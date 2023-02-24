package com.spring.mvc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.mvc.model.User;
@Transactional
@Repository
public class ApplicationDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private HibernateTemplate hibernateTemplate;

//getting the data from jdbc template
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

//setting the data from jdbc
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List search(User user) {
		final List list = new ArrayList();
		String sql = "select * from user_table where name = '" + user.getName() + "'or email ='" + user.getEmail()
				+ "'or city = '" + user.getCity() + "' or password='" + user.getPassword() + "'or contact='"
				+ user.getContact() + "' or id='" + user.getId() + "'";
		jdbcTemplate.query(sql, new ResultSetExtractor<User>() {

			public User extractData(ResultSet rs) throws SQLException, DataAccessException {
				while (rs.next()) {
					User user = new User();
					user.setId(rs.getLong(1));
					user.setName(rs.getString(2));
					user.setEmail(rs.getString(3));
					user.setContact(rs.getString(4));
					user.setCity(rs.getString(5));
					user.setPassword(rs.getString(6));

					list.add(user);
				}
				return null;
			}
		});
		return list;
	}
	//to get all user details

	public List display() {
		final List list = new ArrayList();
		String sql = "select * from user_table";
		jdbcTemplate.query(sql, new ResultSetExtractor<User>() {
			public User extractData(ResultSet rs) throws SQLException, DataAccessException {
				while (rs.next()) {
					User user = new User();
					user.setId(rs.getLong(1));
					user.setName(rs.getString(2));
					user.setEmail(rs.getString(3));
					user.setContact(rs.getString(4));
					user.setCity(rs.getString(5));
					user.setPassword(rs.getString(6));

					list.add(user);
				}
				return null;
			}
		});
		return list;
	}

	public List resetPassword(final User user) {
		String sql = "update user_table set password=? where email=?";
		jdbcTemplate.execute(sql, new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setString(1, user.getPassword());
				ps.setString(2, user.getEmail());

				return ps.execute();
			}

		});

		List list = display();
		return list;

	}

	public List updateprofile(final User user) {
		String sql = "update user_table set name=?,email=? ,contact=? where id=?";
		jdbcTemplate.execute(sql, new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setLong(1, 1);
				ps.setString(2, user.getName());
				ps.setString(3, user.getContact());
				ps.setString(4, user.getEmail());

				return ps.execute();
			}

		});
		List list = display();
		return list;
	}

	public List<User> findUserByID(Long id) {
		final List list = new ArrayList();
		String sql = "select * from user_table where id=?";
		jdbcTemplate.query(sql, new ResultSetExtractor<User>() {

			public User extractData(ResultSet rs) throws SQLException, DataAccessException {
				while (rs.next()) {
					User user = new User();
					user.setId(rs.getLong(1));
					user.setName(rs.getString(2));
					user.setEmail(rs.getString(3));
					user.setContact(rs.getString(4));
					user.setCity(rs.getString(5));
					user.setPassword(rs.getString(6));

					list.add(user);
					return null;
				}
				return null;
			}

		});
		return list;

	}

	@Transactional
	public User getUser(Long userId) {
		return this.hibernateTemplate.get(User.class, userId);
	}

	

	public List update(final User user) {
		String sql = "update user_table  set name=?,email=?,contact=?,city=? where id=? ";
		jdbcTemplate.execute(sql, new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setString(4, user.getCity());

				ps.setString(3, user.getContact());
				ps.setString(2, user.getEmail());
				ps.setString(1, user.getName());

				ps.setLong(5, user.getId());
				return ps.execute();
			}

		});

		// TODO Auto-generated method stub
		List list = display();
		return list;
	}

	public List delete(User user) {
		String str = "delete from user_table where id='" + user.getId() + "' ";
		jdbcTemplate.update(str);
		List list = display();
		return list;
	}

	public User getUsers() {
		final List list = new ArrayList();
		String sql = "select * from user_table";
		jdbcTemplate.query(sql, new ResultSetExtractor<User>() {

			@Override
			public User extractData(ResultSet rs) throws SQLException, DataAccessException {
				while (rs.next()) {
					User user = new User();
					user.setId(rs.getLong(1));
					user.setName(rs.getString(2));
					user.setEmail(rs.getString(3));
					user.setContact(rs.getString(4));
					user.setCity(rs.getString(5));
					user.setPassword(rs.getString(6));

					list.add(user);
				}
				return null;
			}
			
		});
		return null;
	}

	

}
