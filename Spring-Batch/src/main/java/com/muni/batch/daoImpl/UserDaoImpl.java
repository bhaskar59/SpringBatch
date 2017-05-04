package com.muni.batch.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.muni.batch.dao.UserDao;
import com.muni.batch.entity.User;

public class UserDaoImpl implements UserDao{

	@Autowired
	private DataSource dataSource;
	
    private JdbcTemplate jdbcTemplate;
    
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    
    public void setDataSource(DataSource dataSource) {

        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }
	public List<User> getAllUsers() {
		String query="select * from user";
		Connection con=null;
		
		try {
			con = dataSource.getConnection();
			
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, 11706);
			ResultSet rs = ps.getResultSet();
			List<User> userList =new ArrayList<User>();
			User user =null;
			if (rs.next()) {
				user = new User(rs.getString("user_name"),rs.getInt("age"),rs.getBoolean("is_fulfilled"),
						rs.getDate("logged_date"),rs.getString("emailId"));
				userList.add(user);
			}
			ps.close();
			return userList;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (con != null) {
				try {
				con.close();
				} catch (SQLException e) {}
			}
		}
	}

	public void Updatestatus(Integer userId) {
		// TODO Auto-generated method stub
		
	}

}
