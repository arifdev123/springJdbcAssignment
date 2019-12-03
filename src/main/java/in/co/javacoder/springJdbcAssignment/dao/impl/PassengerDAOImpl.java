package in.co.javacoder.springJdbcAssignment.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import in.co.javacoder.springJdbcAssignment.dao.PassengerDAO;
import in.co.javacoder.springJdbcAssignment.dto.Passenger;
import in.co.javacoder.springJdbcAssignment.rowmapper.PassengerRowMapper;

public class PassengerDAOImpl implements PassengerDAO {
	
	
	private JdbcTemplate jdbcTemplate;
	

	public int create(Passenger passenger) {
		String sql = "insert into passenger values(? , ? , ?)";
		return this.jdbcTemplate.update(sql, passenger.getId(), passenger.getFirstName(), passenger.getLastName());
	}

	public int update(Passenger passenger) {
		String sql = "update passenger set firstname = ?, lastname = ?  where id =  ?";
		return this.jdbcTemplate.update(sql, passenger.getFirstName(), passenger.getLastName(), passenger.getId());
	}

	public List<Passenger> read() {
		PassengerRowMapper passengerRowMapper = new PassengerRowMapper();
		String sql = "select * from passenger";
		return this.jdbcTemplate.query(sql , passengerRowMapper);
	}

	public int delete(int id) {
		String sql = "delete from passenger where id = ?";
		return this.jdbcTemplate.update(sql, id);
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
